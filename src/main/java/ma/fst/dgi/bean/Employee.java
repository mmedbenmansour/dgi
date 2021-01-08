package ma.fst.dgi.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.javafx.css.Declaration;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @OneToMany(mappedBy = "employee")
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<DeclarationIR> declarationIRs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<DeclarationIR> getDeclarationIRs() {
        return declarationIRs;
    }

    public void setDeclarationIRs(List<DeclarationIR> declarationIRs) {
        this.declarationIRs = declarationIRs;
    }
}
