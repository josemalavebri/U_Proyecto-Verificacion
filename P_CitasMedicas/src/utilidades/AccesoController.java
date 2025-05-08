
package utilidades;

import controladores.*;

public class AccesoController {
    
    private FacturaController facturaController;
    private PacienteController medicoController;
    private TurnoController turnosController;
    private CitaMedicaController citaMedicaController;
    
    
    public AccesoController(){
        facturaController = new FacturaController();
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
    
    
}
