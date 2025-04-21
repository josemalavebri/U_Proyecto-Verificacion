package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Turnos;

public class TurnosController {

    private FakeDataBase dataBase;
    
    public TurnosController(){
        dataBase = FakeDataBase.getInstancia();
    }
    
    public ArrayList<Turnos> GetTurnos(){
        ArrayList<Turnos> turnos = new ArrayList<>();
        try {
            turnos = dataBase.AllTurnos();
            return turnos;
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        } 
    }
    
   
    
    
    
    
}
