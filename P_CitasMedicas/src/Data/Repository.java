
package Data;

import java.util.ArrayList;


public interface Repository<T> {
    
    ArrayList<T> all();
    boolean add(T entity);
    boolean update(T entity);
    boolean remove(int id);
    boolean buscarPorCedula(int cedula);
}
