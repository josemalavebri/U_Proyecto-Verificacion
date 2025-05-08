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
public class CitaMedicaController implements  GeneralController<CitaMedica>{
    private FakeDataBase dataBase;

    public CitaMedicaController(){
        dataBase = FakeDataBase.getInstancia();
    }

    @Override
    public ArrayList<CitaMedica> get() {
        try {
            return dataBase.AllCitasMedicas();
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        }     
    }

    @Override
    public boolean post(CitaMedica objeto) {
        try {
            dataBase.AddDataCitaMedica(objeto);
            return true;
        } catch(Exception ex){
            System.out.print(ex);
            return false;
        }
    }

    @Override
    public boolean put(CitaMedica objeto) {
        try {
            dataBase.UpdateCitaMedica(objeto);
            return true;
        } catch(Exception ex){
            System.out.print(ex);
            return false;
        }    
    }

    @Override
    public boolean delete(int id) {
       return dataBase.RemoveCitaMedica(id);
    }
    
    
}
