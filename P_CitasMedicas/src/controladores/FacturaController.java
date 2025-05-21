
package controladores;

import java.util.ArrayList;
import modelos.Factura;
import Data.Repository;
import Data.FakeDB.InternalRepository;

public class FacturaController extends GeneralController<Factura>{
    
    public FacturaController(Repository<InternalRepository> db) {
         super(db);
    }
    

    @Override
    public ArrayList<Factura> get() {
        try{
            return db.all();
        } catch(Exception ex){
            return new ArrayList<>();
        }
    }

    @Override
    public boolean post(Factura objeto) {
        try {
            return db.add(objeto);
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }    
    }

    @Override
    public boolean put(Factura objeto) {
        try {
            db.update(objeto);
            return true;
        } catch (Exception e) {
            return false;
        }    
    }

    @Override
    public boolean delete(int id) {
        try {
            db.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
}
