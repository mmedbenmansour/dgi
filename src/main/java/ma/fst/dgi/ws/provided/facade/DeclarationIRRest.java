package ma.fst.dgi.ws.provided.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.fst.dgi.bean.DeclarationIR;
import ma.fst.dgi.service.facade.DeclarationIRService;
import ma.fst.dgi.ws.provided.converter.DeclarationIrConverter;
import ma.fst.dgi.ws.provided.converter.EmployeeConverter;
import ma.fst.dgi.ws.provided.vo.DeclarationIRVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dgi/declaration-ir")
@Api("Manages DeclarationIR services")
public class DeclarationIRRest {

    @Autowired
    private EmployeeConverter employeeConverter;
    @Autowired
    private DeclarationIRService declarationIRService;
    @Autowired
    private DeclarationIrConverter declarationIrConverter;

    @PostMapping("/")
    @ApiOperation("Saves the specified DeclarationIR")
    public int save(@RequestBody DeclarationIR declarationIR) {
        return declarationIRService.save(declarationIR);
    }

    @GetMapping("/annee/{annee}/mois/{mois}/employee/reference/{reference}")
    @ApiOperation("find DeclarationIR by annee, month and employee reference")
    public DeclarationIR findByAnneeAndMoisAndEmployeeReference(@PathVariable Integer annee, @PathVariable Integer mois, @PathVariable String reference) {
        return declarationIRService.findByAnneeAndMoisAndEmployeeReference(annee, mois, reference);
    }

    @GetMapping("/reference/{reference}")
    @ApiOperation("find DeclarationIR reference")
    public DeclarationIRVo findByReference(@PathVariable String reference) {
        DeclarationIR declarationIR = declarationIRService.findByReference(reference);
        employeeConverter.setDeclarationIRs(false);
        declarationIrConverter.setEmployee(true);
        return declarationIrConverter.toVo(declarationIR);
    }




}
