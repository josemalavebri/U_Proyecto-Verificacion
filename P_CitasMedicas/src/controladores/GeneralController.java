package controladores;

import java.util.ArrayList;

public interface GeneralController <T>{
    
    ArrayList<T> get();
    
    boolean post(T objeto);
    
    boolean put(T objeto);
    
    boolean delete(int id);
   
}
