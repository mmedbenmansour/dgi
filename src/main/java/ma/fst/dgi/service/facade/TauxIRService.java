package ma.fst.dgi.service.facade;

import ma.fst.dgi.bean.TauxIR;
import ma.fst.dgi.dao.TauxIRDao;
import org.springframework.beans.factory.annotation.Autowired;

public interface TauxIRService {
    TauxIR findBySalaireMinMax(Double montant);
}
