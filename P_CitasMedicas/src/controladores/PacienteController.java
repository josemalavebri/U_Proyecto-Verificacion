/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.Paciente;

/**
 *
 * @author HP
 */

public class PacienteController implements GeneralController<Paciente>{
    
    private FakeDataBase dataBase;
    
    public PacienteController(FakeDataBase dataBase){
        this.dataBase = dataBase;
    }
    
    @Override
    public ArrayList<Paciente> get() {
        try{
            return dataBase.AllPacientes();
        }catch(Exception ex){
            return new ArrayList<>();
        }
    }

    @Override
    public boolean post(Paciente objeto) {
        try {
            dataBase.AddPaciente(objeto);
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }

    @Override
    public boolean put(Paciente objeto) {
        try {
            dataBase.UpdatePaciente(objeto);
            return true;
        } catch (Exception e) {
            return false;
        }    
    }

    @Override
    public boolean delete(int id) {
        try {
            dataBase.DeletePaciente(id);
            return true;
        } catch (Exception e) {
              return false;
        }    
    }
    
}
