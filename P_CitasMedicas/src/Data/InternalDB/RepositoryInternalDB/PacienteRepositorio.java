package Data.InternalDB.RepositoryInternalDB;

import java.util.ArrayList;
import modelos.Paciente;

public class PacienteRepositorio extends BaseRepositorio<Paciente>{
    
    
    
    @Override
    public ArrayList<Paciente> select() {
        return this.crearDatos.datosPacientes();
    }

    @Override
    public boolean insert(Paciente entidad) {
        return this.crearDatos.datosPacientes().add(entidad);
    }

    @Override
    public boolean delete(int id) {
        return this.crearDatos.datosPacientes().removeIf(paciente -> paciente.getId()== id);
    }

    @Override
    public boolean put(Paciente entity) {
        ArrayList<Paciente> pacientes = this.crearDatos.datosPacientes();
        for(int i = 0; i<pacientes.size();i++){
            if(pacientes.get(i).getId() == entity.getId()){
                pacientes.set(i, entity);
                return true;
            }
        }
        return false;
    }
    
}
