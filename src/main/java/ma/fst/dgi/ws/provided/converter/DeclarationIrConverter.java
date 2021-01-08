package ma.fst.dgi.ws.provided.converter;

import ma.fst.dgi.bean.DeclarationIR;
import ma.fst.dgi.bean.Employee;
import ma.fst.dgi.service.util.StringUtil;
import ma.fst.dgi.ws.provided.vo.DeclarationIRVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeclarationIrConverter extends AbstractConverter<DeclarationIR,DeclarationIRVo>{

    private boolean employee;
    @Autowired
    private EmployeeConverter employeeConverter;


    public DeclarationIR toBean(DeclarationIRVo vo){
        DeclarationIR declarationIR= new DeclarationIR();
        if(StringUtil.isNotEmpty(vo.getAnnee())){
            declarationIR.setAnnee(StringUtil.toInteger(vo.getAnnee()));
        }
        if(StringUtil.isNotEmpty(vo.getMois())){
            declarationIR.setMois(StringUtil.toInteger(vo.getMois()));
        }
        if(StringUtil.isNotEmpty(vo.getReference())){
            declarationIR.setReference(vo.getReference());
        }
        if(vo.getEmployeeVo()!=null && employee){
            declarationIR.setEmployee(employeeConverter.toBean(vo.getEmployeeVo()));
        }

        return declarationIR;

    }

    @Override
    public DeclarationIRVo toVo(DeclarationIR declarationIR) {
        DeclarationIRVo declarationIRVo= new DeclarationIRVo();
        if(declarationIR.getAnnee()!=null){
            declarationIRVo.setAnnee(StringUtil.toString(declarationIR.getAnnee()));
        }
        if(declarationIR.getMois()!=null){
            declarationIRVo.setMois(StringUtil.toString(declarationIR.getMois()));
        }
        if(StringUtil.isNotEmpty(declarationIR.getReference())){
            declarationIRVo.setReference(declarationIR.getReference());
        }
        if(declarationIR.getEmployee()!=null && employee){
            declarationIRVo.setEmployeeVo(employeeConverter.toVo(declarationIR.getEmployee()));
        }

        return declarationIRVo;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }
}
