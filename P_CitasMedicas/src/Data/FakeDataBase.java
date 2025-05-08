/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Factura;
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
    private ArrayList<Factura> dataFactura;
    
    private FakeDataBase() {
        datosTemporales = new DatosTemporales();
        this.dataTurnos = datosTemporales.CrearTurnosTemporales();
        this.dataPaciente = datosTemporales.CrearPacienteTemporales();
        this.dataMedico = datosTemporales.CrearMedicosTemporales();
        this.dataFactura = new ArrayList<>();
        crearCitasTemporales();
    }
    
    private void crearCitasTemporales(){
        dataCitasMedicas = new ArrayList();
        for(int i=0; i<10; i++){
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
    
    public boolean AddDataCitaMedica(CitaMedica citaMedica){
        int idUltimaCita = 0;
        for(int i = 0; i < dataTurnos.size(); i++){
            if(i==dataTurnos.size() -1){
                idUltimaCita = dataTurnos.get(i).getId()+1;
            }
        }
        citaMedica.setId(idUltimaCita);
        dataCitasMedicas.add(citaMedica);
        return true;
        
    }
    
    public boolean RemoveCitaMedica(int id){
        
        for(CitaMedica citaMedica : dataCitasMedicas){
            if(citaMedica.getId() == id){
               return dataCitasMedicas.remove(citaMedica);
            }
            
        }
        return false;
    }
    
    public boolean UpdateCitaMedica(CitaMedica citaMedica){
        int id = citaMedica.getId();
        return dataCitasMedicas.set( (id-1), citaMedica)!=null;
    }
    
    
    //Metodos para Turno
    public ArrayList<Turno> AllTurnos(){
        return dataTurnos;
    }
    
    public boolean addTurno(Turno turno){
        int idUltimoTurno = 0;
        for(int i = 0; i < dataTurnos.size(); i++){
            if(i==dataTurnos.size() -1){
                idUltimoTurno = dataTurnos.get(i).getId()+1;
            }
        }
        turno.setId(idUltimoTurno);
        dataTurnos.add(turno);
        return true;
    }
    
     public boolean UpdateTurno(Paciente paciente){
        int idPaciente = paciente.getId();
        if(dataPaciente.set(idPaciente, paciente)!= null){
            return true;
        }
        return false;
    }
    
    public boolean DeleteTurno(int idPaciente) {
        for (int i = 0; i < dataPaciente.size(); i++) {
            if (dataPaciente.get(i).getId() == idPaciente) {
                dataPaciente.remove(i);
            }
        }
        return false;
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
            }
        }
        return false;
    }
    
    public Paciente BuscarPacienteId(int id){
        for (Paciente pacienteTemporal : dataPaciente) {
            if(id == pacienteTemporal.getId()){
                return pacienteTemporal;
            }
        }
        return null;
    }
    
    //Metodos para facturas
     public ArrayList<Factura> allFacturas(){
        return dataFactura;
    }
    
    public boolean addFactura(Factura factura){
        int idUltimoTurno = 0;
        for(int i = 0; i < dataFactura.size(); i++){
            if(i==dataFactura.size() -1){
                idUltimoTurno = dataFactura.get(i).getId();
            }
        }
        factura.setId(idUltimoTurno);
        dataFactura.add(factura);
        return true;
    }
    
     public boolean updateFactura(Factura factura){
        int idFactura = factura.getId();
        if(dataFactura.set(idFactura, factura)!= null){
            return true;
        }
        return false;
    }
    
    public boolean deleteFactura(int idFactura) {
        for (int i = 0; i < dataFactura.size(); i++) {
            if (dataFactura.get(i).getId() == idFactura) {
                dataFactura.remove(i);
            }
        }
        return false;
    }
   
}
