package Data.InternalDB.Repository;

<<<<<<< HEAD
=======
import Data.InternalDB.InternalBD;
>>>>>>> fa86a089742b961bb7dd5cb6974824fefeea7823
import Data.IRepository;
import Data.InternalDB.RepositoryInternalDB.IBaseRepositorio;
import java.util.ArrayList;

public abstract class GenericInternalRepository<T> implements IRepository<T>{
    
    protected IBaseRepositorio actionEntidad;
    
    public GenericInternalRepository(IBaseRepositorio actionEntidad) {
        this.actionEntidad = actionEntidad;
    }
    
    @Override
    public ArrayList<T> all() {
        return actionEntidad.select();
    }

    @Override
    public boolean add(T entity) {
        return actionEntidad.insert(entity);
    }

    @Override
    public boolean update(T entity) {
        return actionEntidad.put(entity);
    }

    @Override
    public boolean remove(int id) {
        return actionEntidad.delete(id);
    }

    
    @Override
    public T buscarPorCedula(T entity) {
        return entity;
    }
}

