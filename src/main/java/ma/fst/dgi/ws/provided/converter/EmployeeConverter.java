package ma.fst.dgi.ws.provided.converter;

import ma.fst.dgi.bean.DeclarationIR;
import ma.fst.dgi.bean.Employee;
import ma.fst.dgi.service.util.ListUtil;
import ma.fst.dgi.service.util.StringUtil;
import ma.fst.dgi.ws.provided.vo.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter extends AbstractConverter<Employee,EmployeeVo> {
    private boolean declarationIRs;

    @Autowired
    private DeclarationIrConverter declarationIrConverter;

    public Employee toBean(EmployeeVo vo) {
        Employee employee=new Employee();
        if (StringUtil.isNotEmpty(vo.getReference())){
           employee.setReference(vo.getReference());
        }
        if (StringUtil.isNotEmpty(vo.getId())){
            employee.setId(StringUtil.toLong(vo.getId()));
        }
        if (declarationIRs  && ListUtil.isNotEmpty(vo.getDeclarationIRVos())){
            employee.setDeclarationIRs(declarationIrConverter.toBean(vo.getDeclarationIRVos()));
        }
        return employee;
    }

    @Override
    public EmployeeVo toVo(Employee employee) {
        EmployeeVo employeeVo=new EmployeeVo();
        if (StringUtil.isNotEmpty(employee.getReference())){
            employeeVo.setReference(employee.getReference());
        }
        if (employee.getId()!=null){
            employeeVo.setId(StringUtil.toString(employee.getId()));
        }
        if (declarationIRs && ListUtil.isNotEmpty(employee.getDeclarationIRs())){
            employeeVo.setDeclarationIRVos(declarationIrConverter.toVo(employee.getDeclarationIRs()));
        }
        return employeeVo;
    }

    public boolean isDeclarationIRs() {
        return declarationIRs;
    }

    public void setDeclarationIRs(boolean declarationIRs) {
        this.declarationIRs = declarationIRs;
    }
}
