package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.Paciente;

public interface GeneralController <T>{
    
    ArrayList<T> get();
    
    boolean post(T objeto);
    
    boolean put(T objeto);
    
    boolean delete(int id);
   
}
