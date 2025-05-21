package controladores;
import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Turno;
import Data.FakeDB.InternalRepository;

public class TurnoController implements GeneralController<Turno> {

    private InternalRepository dataBase;

    public TurnoController(InternalRepository dataBase){
        this.dataBase = dataBase;
    }

    @Override
    public ArrayList<Turno> get() {
        try {
            return dataBase.all();
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        } 
    }

    @Override
    public boolean post(Turno objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean put(Turno objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
