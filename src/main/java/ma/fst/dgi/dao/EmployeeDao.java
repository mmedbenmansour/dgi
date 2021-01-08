package ma.fst.dgi.dao;

import ma.fst.dgi.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Long> {

    Employee findByReference(String reference);
}
