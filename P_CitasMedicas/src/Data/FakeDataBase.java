/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Medico;
import modelos.Paciente;
import modelos.Turno;


public class FakeDataBase {
    
    private static FakeDataBase instancia;
    private ArrayList<CitaMedica> dataCitasMedicas;
    private ArrayList<Turno> dataTurnos ;
    private ArrayList<Paciente> dataPaciente;
    private ArrayList<Medico> dataMedico;
    private DatosTemporales datosTemporales;
    
    private FakeDataBase() {
        datosTemporales = new DatosTemporales();
        this.dataTurnos = datosTemporales.CrearTurnosTemporales();
        this.dataPaciente = datosTemporales.CrearPacienteTemporales();
        this.dataMedico = datosTemporales.CrearMedicosTemporales();
        crearCitasTemporales();
    }
    
    private void crearCitasTemporales(){
        dataCitasMedicas = new ArrayList();
        for(int i=0; i>=10; i++){
            CitaMedica citaMedica = new CitaMedica();
            citaMedica.setId(i+1);
            citaMedica.setMedico(dataMedico.get(1));
            citaMedica.setPaciente(dataPaciente.get(i));
            citaMedica.setTurno(dataTurnos.get(i));
            citaMedica.setDescripcion("cita medica falsa");
            dataCitasMedicas.add(citaMedica);
        }
    }
    
    public static synchronized FakeDataBase getInstancia() {
        if (instancia == null) {
            instancia = new FakeDataBase();
        }
        return instancia;
  
    }
    
    public ArrayList<CitaMedica> AllCitasMedicas(){
         return dataCitasMedicas;
    }
    
    public boolean RemoveCitaMedica(int indice){
        return dataCitasMedicas.remove(indice)!= null;
    }
    
    public boolean UpdateCitaMedica(CitaMedica citaMedica){
        int id = citaMedica.getId();
        return dataCitasMedicas.set( (id-1), citaMedica)!=null;
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
    
    //----------------Metodos para paciente
    public ArrayList<Paciente> AllPacientes(){
        return dataPaciente;
    }
    
    public boolean AddPaciente(Paciente paciente){
        int idPaciente = dataPaciente.size()+1;
        paciente.setId(idPaciente);
        dataPaciente.add(paciente);
        return true;
    }
    
    public boolean UpdatePaciente(Paciente paciente){
        int idPaciente = paciente.getId();
        if(dataPaciente.set(idPaciente, paciente)!= null){
            return true;
        }
        return false;
    }
    
    public boolean DeletePaciente(int idPaciente) {
        for (int i = 0; i < dataPaciente.size(); i++) {
            if (dataPaciente.get(i).getId() == idPaciente) {
                dataPaciente.remove(i);

                // Actualizar todos los IDs
                for (int j = 0; j < dataPaciente.size(); j++) {
                    dataPaciente.get(j).setId(j + 1);
                }
                return true;
            }
        }
        return false;
    }
   
}
