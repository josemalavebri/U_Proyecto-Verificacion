/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelos.CitaMedica;
import Data.FakeDB.InternalRepository;

/**
 *
 * @author josem
 */
public class CitaMedicaController implements  GeneralController<CitaMedica>{
    private InternalRepository dataBase;

    public CitaMedicaController(InternalRepository dataBase){
        this.dataBase = dataBase;
    }

    @Override
    public ArrayList<CitaMedica> get() {
        try {
            return dataBase.all();
        } catch(Exception ex){
            System.out.print(ex);
            return null;
        }     
    }

    @Override
    public boolean post(CitaMedica objeto) {
        try {
            dataBase.add(objeto);
            return true;
        } catch(Exception ex){
            System.out.print(ex);
            return false;
        }
    }

    @Override
    public boolean put(CitaMedica objeto) {
        try {
            dataBase.update(objeto);
            return true;
        } catch(Exception ex){
            System.out.print(ex);
            return false;
        }    
    }

    @Override
    public boolean delete(int id) {
       return dataBase.remove(id);
    }
    
    
}
