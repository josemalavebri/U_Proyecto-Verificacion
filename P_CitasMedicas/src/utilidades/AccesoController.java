
package utilidades;

import Data.FakeDB.MedicoFakeDB;
import Data.SQLite.ExternalRepository;
import controladores.*;
import Data.Repository;
import Data.FakeDB.InternalRepository;

public class AccesoController {
    
    private FacturaController facturaController;
    private PacienteController pacienteController;
    private TurnoController turnosController;
    private CitaMedicaController citaMedicaController;
    private MedicoController medicoController;
    private InternalRepository dataBase;
    
    
    
    
    public AccesoController(){
        facturaController = new FacturaController(new ExternalRepository());
        pacienteController = new PacienteController(dataBase);
        turnosController = new TurnoController(dataBase);
        citaMedicaController = new CitaMedicaController(dataBase);
        medicoController = new MedicoController(new MedicoFakeDB());
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
