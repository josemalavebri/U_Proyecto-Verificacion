/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Paciente;
import modelos.Turno;


public class FakeDataBase {
    
    private static FakeDataBase instancia;
    private ArrayList<CitaMedica> dataCitasMedicas = new ArrayList();
    private ArrayList<Turno> dataTurnos = new ArrayList();
    private DatosTemporales datosTemporales = new DatosTemporales();
    private ArrayList<Paciente> dataPaciente = new ArrayList();

    public FakeDataBase() {
        this.dataTurnos = datosTemporales.CrearTurnosTemporales();
        this.dataPaciente = datosTemporales.CrearPacienteTemporales();
    }
    
    public static synchronized FakeDataBase getInstancia() {
        if (instancia == null) {
            instancia = new FakeDataBase();
        }
        return instancia;
  
    }
    
    //------------- Metodos para CITA MEDICA -------------
    public ArrayList<CitaMedica> AllCitasMedicas(){
         return dataCitasMedicas;
    }
    
    public boolean RemoveCitaMedica(int indice){
        if(dataCitasMedicas.remove(indice)!= null){
            return true;
        }
        return false;
    }
    
    public boolean UpdateCitaMedica(CitaMedica citaMedica){
        int id = citaMedica.getId();
        if(dataCitasMedicas.set( (id-1), citaMedica)!=null){
            return true;
        }
        return false;
    }
    
    public boolean AddDataCitaMedica(CitaMedica citaMedica){
        int idCitaMedica = dataCitasMedicas.size()+1;
        citaMedica.setId(idCitaMedica);
        dataCitasMedicas.add(citaMedica);
        return true;
    }
    
    //Metodos para Turno
    public ArrayList<Turno> AllTurnos(){
        return dataTurnos;
    }
    
    public boolean EnviarTurno(Turno turno){
        dataTurnos.add(turno);
        return true;
    }
    
    //Metodos para paciente
    public ArrayList<Paciente> AllPacientes(){
        return dataPaciente;
    }
    
    public void AddPaciente(Paciente paciente){
        int idPaciente = dataPaciente.size()+1;
        paciente.setId(idPaciente);
        dataPaciente.add(paciente);
    }
}
