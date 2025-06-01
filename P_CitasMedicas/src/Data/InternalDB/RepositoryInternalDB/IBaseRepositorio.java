package Data.InternalDB.RepositoryInternalDB;

import java.util.ArrayList;

public interface IBaseRepositorio<T> {
    ArrayList<T> select();
    boolean insert(T entity);
    boolean delete(int id);
    boolean put(T entity);
}
