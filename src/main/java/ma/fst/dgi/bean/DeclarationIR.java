package ma.fst.dgi.bean;

import javax.persistence.*;

@Entity
public class DeclarationIR {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Double slaire;
    private Double montant;
    private Integer mois;
    private Integer annee;
    @ManyToOne
    private TauxIR tauxIR;
    @ManyToOne
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getSlaire() {
        return slaire;
    }

    public void setSlaire(Double slaire) {
        this.slaire = slaire;
    }

    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public TauxIR getTauxIR() {
        return tauxIR;
    }

    public void setTauxIR(TauxIR tauxIR) {
        this.tauxIR = tauxIR;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
