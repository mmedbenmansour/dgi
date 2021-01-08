package ma.fst.dgi.ws.provided.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import ma.fst.dgi.bean.DeclarationIR;

import javax.persistence.OneToMany;
import java.util.List;

public class EmployeeVo {
    private String id;
    private String reference;
    private List<DeclarationIRVo> declarationIRVos;

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

    public List<DeclarationIRVo> getDeclarationIRVos() {
        return declarationIRVos;
    }

    public void setDeclarationIRVos(List<DeclarationIRVo> declarationIRVos) {
        this.declarationIRVos = declarationIRVos;
    }
}
