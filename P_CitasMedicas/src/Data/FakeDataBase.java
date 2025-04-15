/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Turnos;


public class FakeDataBase {
    
    private static FakeDataBase instancia;
    private ArrayList<CitaMedica> dataCitasMedicas = new ArrayList();
    private ArrayList<Turnos> dataTurnos = new ArrayList();
    private DatosTemporales datosTemporales = new DatosTemporales();

    private FakeDataBase() {
        this.dataTurnos = datosTemporales.CrearTurnosTemporales();
    }
    
    public static synchronized FakeDataBase getInstancia() {
        if (instancia == null) {
            instancia = new FakeDataBase();
        }
        return instancia;
  
    }
    
    //Metodos para CitaMedica
    public boolean AddDataCitaMedica(CitaMedica citaMedica){
        dataCitasMedicas.add(citaMedica);
        return true;
    }
     
    public ArrayList<CitaMedica> AllCitasMedicas(){
         return dataCitasMedicas;
    }
    
}
