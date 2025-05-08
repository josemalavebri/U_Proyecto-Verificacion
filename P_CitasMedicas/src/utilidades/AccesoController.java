
package utilidades;

import controladores.*;

public class AccesoController {
    
    private FacturaController facturaController;
    private PacienteController pacienteController;
    private TurnoController turnosController;
    private CitaMedicaController citaMedicaController;
    private MedicoController medicoController;
    
    
    public AccesoController(){
        facturaController = new FacturaController();
        pacienteController = new PacienteController();
        turnosController = new TurnoController();
        citaMedicaController = new CitaMedicaController();
        medicoController = new MedicoController();
    }
    
    public FacturaController facturaController(){
        return facturaController;
    }
   
    public TurnoController turnosController(){
        return turnosController;
    }
    
    public CitaMedicaController citaMedicaController(){
        return citaMedicaController;
    }
    
    public PacienteController pacienteController(){
        return pacienteController;
    }
    
    public MedicoController medicoController(){
        return medicoController;
    }
    
    
}
