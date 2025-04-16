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
        try {
            dataBase.AllTurnos();
            return new ArrayList<Turnos>();
        } catch(Exception ex){
            System.out.print(ex);
        } finally{
            return null;
        }
    }
    
    
    
    
}
