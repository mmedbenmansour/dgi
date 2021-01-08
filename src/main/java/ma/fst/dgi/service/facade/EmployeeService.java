package ma.fst.dgi.service.facade;

import ma.fst.dgi.bean.Employee;

public interface EmployeeService {

    Employee findByReference(String reference);
}
