package ma.fst.dgi.ws.provided.vo;

import ma.fst.dgi.bean.Employee;
import ma.fst.dgi.bean.TauxIR;

import javax.persistence.ManyToOne;

public class DeclarationIRVo {
    private String  id;
    private String reference;
    private String slaire;
    private String montant;
    private String mois;
    private String annee;

    private TauxIRVo tauxIRVo;

    private EmployeeVo employeeVo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSlaire() {
        return slaire;
    }

    public void setSlaire(String slaire) {
        this.slaire = slaire;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public TauxIRVo getTauxIRVo() {
        return tauxIRVo;
    }

    public void setTauxIRVo(TauxIRVo tauxIRVo) {
        this.tauxIRVo = tauxIRVo;
    }

    public EmployeeVo getEmployeeVo() {
        return employeeVo;
    }

    public void setEmployeeVo(EmployeeVo employeeVo) {
        this.employeeVo = employeeVo;
    }
}
