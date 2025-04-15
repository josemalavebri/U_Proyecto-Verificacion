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

    
    public boolean GuardarCitaMedica(CitaMedica citaMedica ){
        try {
            dataBase.AddDataCitaMedica(citaMedica);
            return true;

        } catch(Exception ex){
            System.out.print(ex);
        } finally{
            return false;
        }
    }
    
    
    public ArrayList<CitaMedica> GetCitasMedicas(){
        try {
            dataBase.AllCitasMedicas();
            return new ArrayList<CitaMedica>();
        } catch(Exception ex){
            System.out.print(ex);
        } finally{
            return null;
        }
    }
    
    
}
