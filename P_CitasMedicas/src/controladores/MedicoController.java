/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.Medico;

/**
 *
 * @author Falquez Steven
 */
public class MedicoController {
    
      private FakeDataBase dataBase;
    
    public MedicoController(){
        dataBase = FakeDataBase.getInstancia();
    }
    
    public ArrayList<Medico> getMedico(){
        try{
            return dataBase.AllMedico();
        }catch(Exception ex){
            return new ArrayList<>();
        }
    }
    
    public boolean PostMedico(Medico medico){
        try {
            dataBase.AddMedico(medico);
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }
    
    public boolean PutMedico(Medico medico){
        try {
            dataBase.UpdateMedico (medico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteMedico(int idMedico){
        try {
            dataBase.DeleteMedico(idMedico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean SearchId(int id){
        try {
            dataBase.BuscarMedicoId(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
}

