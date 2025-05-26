
package Data.InternalDB.Repository;

import java.util.ArrayList;
import modelos.Turno;

public class TurnoInternalRepository extends GenericInternalRepository<Turno>{
    
    public TurnoInternalRepository(){
        internalBD = internalBD.getInstance();
    }

    @Override
    public ArrayList<Turno> all() {
        return internalBD.getTurnos();
    }

    @Override
    public boolean add(Turno entity) {
        return internalBD.addTurno(entity);
        
    }

    @Override
    public boolean update(Turno entity) {
        return internalBD.updateTurno(entity);
    }

    @Override
    public boolean remove(int id) {
        return internalBD.removeTurno(id);   
    }
    
    @Override
    public Turno buscarPorCedula(Turno entity) {
        return new Turno();
    }
    
}
