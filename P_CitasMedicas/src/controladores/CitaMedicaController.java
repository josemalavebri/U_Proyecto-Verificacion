/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.CitaMedica;

/**
 *
 * @author josem
 */
public class CitaMedicaController {
    private FakeDataBase dataBase;
    
    public CitaMedicaController(){
        dataBase = FakeDataBase.getInstancia();
    }

    
    public ArrayList<CitaMedica> GetCitasMedicas(){
        ArrayList<CitaMedica> citasMedicas = new ArrayList<CitaMedica>();
        try {
            citasMedicas = dataBase.AllCitasMedicas();
            return new ArrayList<CitaMedica>();
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        } 
    }
    
    public boolean PostCitaMedica(CitaMedica citaMedica){
        try {
            dataBase.AllTurnos();
            return true;
        } catch(Exception ex){
            System.out.print(ex);
            return false;
        }
        
    }
    public boolean removeCitaMedica(){
       return false;
    }
    
    
}
