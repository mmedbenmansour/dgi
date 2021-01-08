package ma.fst.dgi.service.impl;

import ma.fst.dgi.bean.Employee;
import ma.fst.dgi.dao.EmployeeDao;
import ma.fst.dgi.service.facade.DeclarationIRService;
import ma.fst.dgi.service.facade.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public Employee findByReference(String reference) {
        return employeeDao.findByReference(reference);
    }
}
