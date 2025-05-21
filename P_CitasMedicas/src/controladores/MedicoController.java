/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelos.Medico;
import Data.FakeDB.InternalRepository;

/**
 *
 * @author Falquez Steven
 */
public class MedicoController {
    
    private InternalRepository dataBase;
    
    public MedicoController(InternalRepository dataBase){
        this.dataBase = dataBase;
    }
    
    public ArrayList<Medico> getMedico(){
        try{
            return dataBase.all();
        }catch(Exception ex){
            return new ArrayList<>();
        }
    }
    
    public boolean PostMedico(Medico medico){
        try {
            dataBase.add(medico);
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }
    
    public boolean PutMedico(Medico medico){
        try {
            dataBase.update(medico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteMedico(int idMedico){
        try {
            dataBase.remove(idMedico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean buscarPorCedula(int id){
        try {
            dataBase.buscarPorCedula(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
}

