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
    ArrayList<CitaMedica> citasMedicas = new ArrayList<CitaMedica>();

    public CitaMedicaController(){
        dataBase = FakeDataBase.getInstancia();
    }

    
    public ArrayList<CitaMedica> getCitasMedicas(){
        try {
            citasMedicas = dataBase.AllCitasMedicas();
            return citasMedicas;
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        } 
    }
    
    public boolean postCitaMedica(CitaMedica citaMedica){
        try {
            dataBase.AddDataCitaMedica(citaMedica);
            return true;
        } catch(Exception ex){
            System.out.print(ex);
            return false;
        }
        
    }
    
    public boolean putCitaMedica(CitaMedica citaMedica){
        try {
            dataBase.UpdateCitaMedica(citaMedica);
            return true;
        } catch(Exception ex){
            System.out.print(ex);
            return false;
        }
        
    }
    
    
    public boolean removeCitaMedica(int indice){
       return dataBase.RemoveCitaMedica(indice);
    }
    
    
}
