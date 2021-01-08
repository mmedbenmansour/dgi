package ma.fst.dgi.dao;

import ma.fst.dgi.bean.DeclarationIR;
import ma.fst.dgi.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeclarationIRDao extends JpaRepository<DeclarationIR,Long> {
    DeclarationIR findByReference(String reference);
    List<DeclarationIR> findByEmployeeReference(String reference);

    DeclarationIR findByAnneeAndMoisAndEmployeeReference(Integer annee, Integer mois, String reference);
}
