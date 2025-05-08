
package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.Factura;

public class FacturaController implements GeneralController<Factura>{
    
    private FakeDataBase dataBase;

    public FacturaController(){
        dataBase = FakeDataBase.getInstancia();
    }

    @Override
    public ArrayList<Factura> get() {
        try{
            return dataBase.allFacturas();
        } catch(Exception ex){
            return new ArrayList<>();
        }
    }

    @Override
    public boolean post(Factura objeto) {
        try {
            return dataBase.addFactura(objeto);
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }    
    }

    @Override
    public boolean put(Factura objeto) {
        try {
            dataBase.updateFactura(objeto);
            return true;
        } catch (Exception e) {
            return false;
        }    
    }

    @Override
    public boolean delete(int id) {
        try {
            dataBase.deleteFactura(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
}
