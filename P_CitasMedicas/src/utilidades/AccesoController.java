
package utilidades;

import Data.FakeDataBase;
import controladores.*;

public class AccesoController {
    
    private FacturaController facturaController;
    private PacienteController pacienteController;
    private TurnoController turnosController;
    private CitaMedicaController citaMedicaController;
    private MedicoController medicoController;
    private FakeDataBase dataBase;
    
    
    public AccesoController(){
        dataBase = new FakeDataBase();
        facturaController = new FacturaController(dataBase);
        pacienteController = new PacienteController(dataBase);
        turnosController = new TurnoController(dataBase);
        citaMedicaController = new CitaMedicaController(dataBase);
        medicoController = new MedicoController(dataBase);
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
