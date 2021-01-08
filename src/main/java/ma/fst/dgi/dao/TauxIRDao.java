package ma.fst.dgi.dao;

import ma.fst.dgi.bean.Employee;
import ma.fst.dgi.bean.TauxIR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxIRDao extends JpaRepository<TauxIR,Long> {
    @Query("select t FROM TauxIR t where t.salaireMin <= :salaire and t.salaireMax >= :salaire")
    TauxIR findBySalaireMinMax(@Param("salaire") Double salaire);
}
