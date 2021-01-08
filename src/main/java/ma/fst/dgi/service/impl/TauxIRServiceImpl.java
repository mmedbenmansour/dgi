package ma.fst.dgi.service.impl;

import ma.fst.dgi.bean.TauxIR;
import ma.fst.dgi.dao.TauxIRDao;
import ma.fst.dgi.service.facade.TauxIRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TauxIRServiceImpl implements TauxIRService {

    @Autowired
    TauxIRDao tauxIRDao;

    public TauxIR findBySalaireMinMax(Double montant){
        return tauxIRDao.findBySalaireMinMax(montant);
    }

}
