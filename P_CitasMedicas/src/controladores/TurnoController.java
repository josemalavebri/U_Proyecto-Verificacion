package controladores;
import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Turno;

public class TurnoController implements GeneralController<Turno> {

    private FakeDataBase dataBase;
    private ArrayList<Turno> turnos = new ArrayList<>();

    public TurnoController(){
        dataBase = FakeDataBase.getInstancia();
    }

    @Override
    public ArrayList<Turno> get() {
        try {
            turnos = dataBase.AllTurnos();
            return turnos;
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
