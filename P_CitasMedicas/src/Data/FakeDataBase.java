/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import modelos.CitaMedica;


public class FakeDataBase {
    
    private static FakeDataBase instancia;

    private ArrayList<CitaMedica> dataCitasMedicas = new ArrayList();

    
    private FakeDataBase() {
    
    }
    
    
    public static synchronized FakeDataBase getInstancia() {
        if (instancia == null) {
            instancia = new FakeDataBase();
        }
        return instancia;
        
    }
    
    public boolean AddDataCitaMedico(CitaMedica citaMedica){
        dataCitasMedicas.add(citaMedica);
        return true;
    }
     
    public ArrayList<CitaMedica> AllCitasMedicas(){
         return dataCitasMedicas;
    }
    
    
    
    
    


    
}
