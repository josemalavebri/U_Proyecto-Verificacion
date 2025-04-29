package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Turno;

public class TurnosController {

    private FakeDataBase dataBase;
            ArrayList<Turno> turnos = new ArrayList<>();

    public TurnosController(){
        dataBase = FakeDataBase.getInstancia();
    }
    
    public ArrayList<Turno> GetTurnos(){
        try {
            turnos = dataBase.AllTurnos();
            return turnos;
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        } 
    }
    
   
    
    
    
    
}
