package Data.FakeDB;

import java.util.ArrayList;
import modelos.*;


public class InternalBD {
    private static InternalBD instancia;
    private ArrayList<Turno> listaTurnos;
    private ArrayList<Paciente> listaPacientes;
    private ArrayList<Medico> listaMedicos;
    private ArrayList<Factura> listaFactura;

    
    private InternalBD(){
        listaTurnos = new ArrayList<>();
    }
    
    public InternalBD getInstance(){
        if(this.instancia==null){
            this.instancia = new InternalBD();
            cargarDatosTemporales();
        } 
        return instancia;
    }
    
    private void cargarDatosTemporales(){
        crearTurnosTemporales();
        crearPacienteTemporales();
        crearMedicosTemporales();
    }
    //--------------------------MEDICOS 
    public ArrayList<Medico> getMedicos(){
        try{
            return listaMedicos;
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }      
        return new ArrayList<Medico>();
    }
    
     public Medico getMedicosByCedula(Medico medico){
        try{
            
            for(int i=0; i<listaMedicos.size();i++){
                Medico medicoActual = listaMedicos.get(i);
                if(medicoActual.getCedula() == medico.getCedula()){
                    return medicoActual;
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }  
        return new Medico();
    }
     
   
    public boolean addMedico(Medico m){
        try{
            return listaMedicos.add(m);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean removeMedico(int id){
        try {
            return listaMedicos.removeIf(m -> m.getId() == id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return false;
    }

    public boolean updateMedico(Medico medico){
        try {
            for(int i = 0; i < listaMedicos.size(); i++){
                if(listaMedicos.get(i).getId() == medico.getId()){
                    listaMedicos.set(i, medico);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
     //--------------------------Turno 
    
    public ArrayList<Turno> getTurnos(){
    try {
        return listaTurnos;
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return new ArrayList<Turno>();
}

    public boolean addTurno(Turno t){
        try {
            return listaTurnos.add(t);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    

    public boolean removeTurno(int id){
        try {
            return listaTurnos.removeIf(t -> t.getId() == id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean updateTurno(Turno turno){
        try {
            for (int i = 0; i < listaTurnos.size(); i++) {
                if (listaTurnos.get(i).getId() == turno.getId()) {
                    listaTurnos.set(i, turno);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    //--------------------------Paciente 

    public ArrayList<Paciente> getPacientes(){
        try {
            return listaPacientes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<Paciente>();
    }

    public boolean addPaciente(Paciente p){
        try {
            return listaPacientes.add(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean removePaciente(int id){
        try {
            return listaPacientes.removeIf(p -> p.getId() == id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean updatePaciente(Paciente paciente){
        try {
            for (int i = 0; i < listaPacientes.size(); i++) {
                if (listaPacientes.get(i).getId() == paciente.getId()) {
                    listaPacientes.set(i, paciente);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    
    private void crearTurnosTemporales(){
        String fechaFija = "19/5/2025";
        listaTurnos = new ArrayList<>();
        listaTurnos.add(new Turno(1, fechaFija, "08", "00"));
        listaTurnos.add(new Turno(2, fechaFija, "09", "00"));
        listaTurnos.add(new Turno(3, fechaFija, "10", "00"));
        listaTurnos.add(new Turno(4, fechaFija, "11", "00"));
        listaTurnos.add(new Turno(5, fechaFija, "12", "00"));
        listaTurnos.add(new Turno(6, fechaFija, "13", "00"));
        listaTurnos.add(new Turno(7, fechaFija, "14", "00"));
        listaTurnos.add(new Turno(8, fechaFija, "15", "00"));
        listaTurnos.add(new Turno(9, fechaFija, "16", "00"));
        listaTurnos.add(new Turno(10, fechaFija, "17", "00"));
    }
    
    private void crearPacienteTemporales() {
        listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente(1, 102030405, "Ana", "Pérez", 28, "ana.perez@mail.com", 991234567));
        listaPacientes.add(new Paciente(2, 203040506, "Luis", "Gómez", 35, "luis.gomez@mail.com", 987654321));
        listaPacientes.add(new Paciente(3, 304050607, "Marta", "Ramírez", 22, "marta.r@mail.com", 971122334));
        listaPacientes.add(new Paciente(4, 405060708, "Carlos", "López", 40, "carlos.l@mail.com", 965566778));
        listaPacientes.add(new Paciente(5, 506070809, "Lucía", "Fernández", 30, "lucia.f@mail.com", 999988776));
        listaPacientes.add(new Paciente(6, 607080910, "Pedro", "Suárez", 45, "pedro.suarez@mail.com", 954433221));
        listaPacientes.add(new Paciente(7, 708091011, "Elena", "Cruz", 27, "elena.cruz@mail.com", 945678901));
        listaPacientes.add(new Paciente(8, 809101112, "Jorge", "Mendoza", 33, "jorge.m@mail.com", 981122334));
        listaPacientes.add(new Paciente(9, 910111213, "Camila", "Ríos", 29, "camila.rios@mail.com", 979988776));
        listaPacientes.add(new Paciente(10, 1011121314, "Andrés", "Navarro", 38, "andres.n@mail.com", 966677889));
    }
    
    private void crearMedicosTemporales(){
        listaMedicos = new ArrayList<>();
        listaMedicos.add(new Medico(1, 12345689, 20,"Carlos", "López", "Cardiología", "Masculino", 9876521));
        listaMedicos.add(new Medico(2, 987654321, 20,"Ana", "Gómez", "Pediatría", "Femenino", 123456789));
        listaMedicos.add(new Medico(5, 445566778, 20,"Mateo", "Díaz", "Traumatología", "Masculino", 111222333));
    }
    
    
}

