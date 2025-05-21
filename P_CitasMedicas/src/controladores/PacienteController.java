/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelos.Paciente;
import Data.FakeDB.InternalRepository;

/**
 *
 * @author HP
 */

public class PacienteController implements GeneralController<Paciente>{
    
    private InternalRepository dataBase;
    
    public PacienteController(InternalRepository dataBase){
        this.dataBase = dataBase;
    }
    
    @Override
    public ArrayList<Paciente> get() {
        try{
            return dataBase.all();
        }catch(Exception ex){
            return new ArrayList<>();
        }
    }

    @Override
    public boolean post(Paciente objeto) {
        try {
            dataBase.add(objeto);
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }

    @Override
    public boolean put(Paciente objeto) {
        try {
            dataBase.update(objeto);
            return true;
        } catch (Exception e) {
            return false;
        }    
    }

    @Override
    public boolean delete(int id) {
        try {
            dataBase.remove(id);
            return true;
        } catch (Exception e) {
              return false;
        }    
    }
    
}
