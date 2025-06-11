package modelos;

public class AtencionMedica extends BaseEntity {
    public CitaMedica citaMedica;
    public String sintomas;
    public String diagnostico;
    public String receta;
    
    public AtencionMedica(int id) {
        super(id);
        sintomas = "";
        diagnostico = "";
        receta = "";
    }
    
    public AtencionMedica(int id, CitaMedica citaMedica, String sintomas, String diagnostico, String receta) {
        super(id);
        this.citaMedica = citaMedica;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.receta = receta;
    }    
}