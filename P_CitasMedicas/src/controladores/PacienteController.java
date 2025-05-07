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

public class PacienteController {
    
    private FakeDataBase dataBase;
    
    public PacienteController(){
        dataBase = FakeDataBase.getInstancia();
    }
    
    public ArrayList<Paciente> GetPacientes(){
        try{
            return dataBase.AllPacientes();
        }catch(Exception ex){
            return new ArrayList<>();
        }
    }
    
    public boolean PostPaciente(Paciente paciente){
        try {
            dataBase.AddPaciente(paciente);
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }
    
    public boolean PutPaciente(Paciente paciente){
        try {
            dataBase.UpdatePaciente(paciente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeletePaciente(int idPaciente){
        try {
            dataBase.DeletePaciente(idPaciente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean SearchId(int id){
        try {
            dataBase.BuscarPacienteId(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Paciente ObtenerPacienteId(int id){
        return dataBase.BuscarPacienteId(id);
    }
    
}
