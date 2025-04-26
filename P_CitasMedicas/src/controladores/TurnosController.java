package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Turno;

public class TurnosController {

    private FakeDataBase dataBase;
    
    public TurnosController(){
        dataBase = FakeDataBase.getInstancia();
    }
    
    public ArrayList<Turno> GetTurnos(){
        ArrayList<Turno> turnos = new ArrayList<>();
        try {
            turnos = dataBase.AllTurnos();
            return turnos;
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        } 
    }
    
   
    
    
    
    
}
