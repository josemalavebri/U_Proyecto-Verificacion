package Data.InternalDB.RepositoryInternalDB;

public abstract class BaseRepositorio<T> implements IBaseRepositorio<T>{

    protected AccesoDatos crearDatos;

    public BaseRepositorio() {
        this.crearDatos = AccesoDatos.getInstance();
    }
    
    
    
}
