package ma.fst.dgi.service.impl;

import ma.fst.dgi.bean.DeclarationIR;
import ma.fst.dgi.bean.Employee;
import ma.fst.dgi.bean.TauxIR;
import ma.fst.dgi.dao.DeclarationIRDao;
import ma.fst.dgi.service.facade.DeclarationIRService;
import ma.fst.dgi.service.facade.EmployeeService;
import ma.fst.dgi.service.facade.TauxIRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeclarationIRServiceImpl implements DeclarationIRService {
    @Autowired
    DeclarationIRDao declarationIRDao;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    TauxIRService tauxIRService;

    @Override
    public int save(DeclarationIR declarationIR) {
        Employee employee=employeeService.findByReference(declarationIR.getEmployee().getReference());
        if ( employee== null) {
            return -1;
        } else if (findByAnneeAndMoisAndEmployeeReference(declarationIR.getAnnee(), declarationIR.getMois(), declarationIR.getEmployee().getReference()) != null) {
            return -2;
        } else {
            TauxIR tauxIR = tauxIRService.findBySalaireMinMax(declarationIR.getSlaire());
            if (tauxIR==null) {
                return -3;
            }else {
                Double montant=tauxIR.getMontant()*declarationIR.getSlaire();
                declarationIR.setMontant(montant);
                declarationIR.setEmployee(employee);
                declarationIRDao.save(declarationIR);
                return 1;
            }

        }

    }

    @Override
    public DeclarationIR findByAnneeAndMoisAndEmployeeReference(Integer annee, Integer mois, String reference) {
        return declarationIRDao.findByAnneeAndMoisAndEmployeeReference(annee,mois,reference);
    }

    @Override
    public DeclarationIR findByReference(String reference) {
        return declarationIRDao.findByReference(reference);
    }


}
