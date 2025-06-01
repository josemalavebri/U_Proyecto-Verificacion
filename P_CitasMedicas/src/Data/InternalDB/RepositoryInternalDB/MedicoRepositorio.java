package Data.InternalDB.RepositoryInternalDB;

import java.util.ArrayList;
import modelos.Medico;

public class MedicoRepositorio extends BaseRepositorio<Medico>{
    
    public MedicoRepositorio(){
    }
    
    @Override
    public ArrayList<Medico> select() {
        return this.crearDatos.datosMedicos();
    }

    @Override
    public boolean insert(Medico entidad) {
        return this.crearDatos.datosMedicos().add(entidad);
    }

    @Override
    public boolean delete(int id) {
        return this.crearDatos.datosMedicos().removeIf(paciente -> paciente.getId()== id);
    }

    @Override
    public boolean put(Medico entity) {
        ArrayList<Medico> medicos = this.crearDatos.datosMedicos();
        for(int i = 0; i< medicos.size();i++){
            if(medicos.get(i).getId() == entity.getId()){
                medicos.set(i, entity);
                return true;
            }
        }
        return false;
    }
    
}
