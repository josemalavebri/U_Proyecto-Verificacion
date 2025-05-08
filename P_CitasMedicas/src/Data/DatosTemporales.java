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
    
    
    public ArrayList<Paciente> CrearPacienteTemporales(){
       
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente(1, 00203405,  "Ana", "Pérez", 28, "ana.perez@mail.com", 09934567));
        listaPacientes.add(new Paciente(2, 0203040506, "Luis", "Gómez", 35, "luis.gomez@mail.com", 0987654321));
        listaPacientes.add(new Paciente(3, 0304050607, "Marta", "Ramírez", 22, "marta.r@mail.com", 0971122334));
        listaPacientes.add(new Paciente(4, 0405060708, "Carlos", "López", 40, "carlos.l@mail.com", 0965566778));
        listaPacientes.add(new Paciente(5, 0506070809, "Lucía", "Fernández", 30, "lucia.f@mail.com", "0999988776"));
        listaPacientes.add(new Paciente(6, 0607080910, "Pedro", "Suárez", 45, "pedro.suarez@mail.com", "0954433221"));
        listaPacientes.add(new Paciente(7, 0708091011, "Elena", "Cruz", 27, "elena.cruz@mail.com", "0945678901"));
        listaPacientes.add(new Paciente(8, 0809101112, "Jorge", "Mendoza", 33, "jorge.m@mail.com", "0981122334"));
        listaPacientes.add(new Paciente(9, 0910111213, "Camila", "Ríos", 29, "camila.rios@mail.com", "0979988776"));
        listaPacientes.add(new Paciente(10, 1011121311, "Andrés", "Navarro", 38, "andres.n@mail.com", "0966677889"));
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
