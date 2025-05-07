/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.Factura;
import modelos.Turno;

/**
 *
 * @author josem
 */
public class FacturaController {
    
    
    private FakeDataBase dataBase;

    public FacturaController(){
        dataBase = FakeDataBase.getInstancia();
    }
    
    public ArrayList<Factura> getFacturas(){
        try{
            return dataBase.allFacturas();
        }catch(Exception ex){
            return new ArrayList<>();
        }
    }
    
    public boolean postFactura(Factura factura){
        try {
            return dataBase.addFactura(factura);
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }
    
    public boolean putFactura(Factura factura){
        try {
            dataBase.updateFactura(factura);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean deleteFactura(int idFactura){
        try {
            dataBase.deleteFactura(idFactura);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
  
}
