package Data.InternalDB.RepositoryInternalDB;

import java.util.ArrayList;
import modelos.CitaMedica;

public class CitaMedicaRepositorio extends BaseRepositorio<CitaMedica>{
    
    @Override
    public ArrayList<CitaMedica> select() {
        return this.crearDatos.datosCitasMedicas();
    }

    @Override
    public boolean insert(CitaMedica entidad) {
        return this.crearDatos.datosCitasMedicas().add(entidad);
    }

    @Override
    public boolean delete(int id) {
        return this.crearDatos.datosCitasMedicas().removeIf(paciente -> paciente.getId()== id);
    }

    @Override
    public boolean put(CitaMedica entity) {
        ArrayList<CitaMedica> citasMedicas = this.crearDatos.datosCitasMedicas();
        for(int i = 0; i< citasMedicas.size();i++){
            if(citasMedicas.get(i).getId() == entity.getId()){
                citasMedicas.set(i, entity);
                return true;
            }
        }
        return false;
    }
    
}
