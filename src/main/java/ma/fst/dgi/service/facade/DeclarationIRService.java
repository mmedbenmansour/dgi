package ma.fst.dgi.service.facade;

import ma.fst.dgi.bean.DeclarationIR;

public interface DeclarationIRService {

    int save(DeclarationIR declarationIR);

    DeclarationIR findByAnneeAndMoisAndEmployeeReference(Integer annee, Integer mois, String reference);

    DeclarationIR findByReference(String reference);
}
