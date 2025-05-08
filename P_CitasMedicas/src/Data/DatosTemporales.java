package Data;

import java.util.ArrayList;
import modelos.*;


public class DatosTemporales {
    
    public ArrayList<Turno> CrearTurnosTemporales(){
        String fechaFija = "11/04/2025";
        // Crear lista de turnos
        ArrayList<Turno> listaTurnos = new ArrayList<>();
        // Crear e insertar los 10 turnos con la fecha fija
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
        return listaTurnos;
    }
    
    
    public ArrayList<Paciente> CrearPacienteTemporales() {
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
            listaPacientes.add(new Paciente(1, 102030405, "Ana", "Pérez", 28, "ana.perez@mail.com", 991234567L));
            listaPacientes.add(new Paciente(2, 203040506, "Luis", "Gómez", 35, "luis.gomez@mail.com", 987654321L));
            listaPacientes.add(new Paciente(3, 304050607, "Marta", "Ramírez", 22, "marta.r@mail.com", 971122334L));
            listaPacientes.add(new Paciente(4, 405060708, "Carlos", "López", 40, "carlos.l@mail.com", 965566778L));
            listaPacientes.add(new Paciente(5, 506070809, "Lucía", "Fernández", 30, "lucia.f@mail.com", 999988776L));
            listaPacientes.add(new Paciente(6, 607080910, "Pedro", "Suárez", 45, "pedro.suarez@mail.com", 954433221L));
            listaPacientes.add(new Paciente(7, 708091011, "Elena", "Cruz", 27, "elena.cruz@mail.com", 945678901L));
            listaPacientes.add(new Paciente(8, 809101112, "Jorge", "Mendoza", 33, "jorge.m@mail.com", 981122334L));
            listaPacientes.add(new Paciente(9, 910111213, "Camila", "Ríos", 29, "camila.rios@mail.com", 979988776L));
            listaPacientes.add(new Paciente(10, 1011121314, "Andrés", "Navarro", 38, "andres.n@mail.com", 966677889L));
        return listaPacientes;
    }

    
    public ArrayList<Medico> CrearMedicosTemporales(){
        ArrayList<Medico> listaMedicos = new ArrayList<>();
        listaMedicos.add(new Medico(1, "Carlos", "Pérez", "Cardiología"));
        listaMedicos.add(new Medico(2, "Ana", "Gómez", "Pediatría"));
        listaMedicos.add(new Medico(3, "Luis", "Martínez", "Neurología"));
        return listaMedicos;
    }
    
    
    
    
}
