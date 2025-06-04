package Data.InternalDB.RepositoryInternalDB;

import java.util.ArrayList;
import modelos.Factura;

public class FacturaRepositorio extends BaseRepositorio<Factura>{
    
    @Override
    public ArrayList<Factura> select() {
        return this.crearDatos.datosFacturas();
    }

    @Override
    public boolean insert(Factura entidad) {
        return this.crearDatos.datosFacturas().add(entidad);
    }

    @Override
    public boolean delete(int id) {
        return this.crearDatos.datosFacturas().removeIf(paciente -> paciente.getId()== id);
    }

    @Override
    public boolean put(Factura entity) {
        ArrayList<Factura> facturas = this.crearDatos.datosFacturas();
        for(int i = 0; i< facturas.size();i++){
            if(facturas.get(i).getId() == entity.getId()){
                facturas.set(i, entity);
                return true;
            }
        }
        return false;
    }
    
}
