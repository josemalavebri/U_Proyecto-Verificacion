package Data;

import java.util.ArrayList;
import modelos.Paciente;
import modelos.Turnos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josem
 */
public  class DatosTemporales {
    
    public ArrayList<Turnos> CrearTurnosTemporales(){
        String fechaFija = "11/04/2025";
        // Crear lista de turnos
        ArrayList<Turnos> listaTurnos = new ArrayList<>();
        // Crear e insertar los 10 turnos con la fecha fija
        listaTurnos.add(new Turnos(1, fechaFija, "08", "00"));
        listaTurnos.add(new Turnos(2, fechaFija, "09", "00"));
        listaTurnos.add(new Turnos(3, fechaFija, "10", "00"));
        listaTurnos.add(new Turnos(4, fechaFija, "11", "00"));
        listaTurnos.add(new Turnos(5, fechaFija, "12", "00"));
        listaTurnos.add(new Turnos(6, fechaFija, "13", "00"));
        listaTurnos.add(new Turnos(7, fechaFija, "14", "00"));
        listaTurnos.add(new Turnos(8, fechaFija, "15", "00"));
        listaTurnos.add(new Turnos(9, fechaFija, "16", "00"));
        listaTurnos.add(new Turnos(10, fechaFija, "17", "00"));
        return listaTurnos;
    }
    
    public ArrayList<Paciente> CrearPacienteTemporales(){
        ArrayList<Paciente> listaPacientes = new ArrayList<>();

        listaPacientes.add(new Paciente("0102030405", "Ana", "Pérez", 28, "ana.perez@mail.com", "0991234567"));
        listaPacientes.add(new Paciente("0203040506", "Luis", "Gómez", 35, "luis.gomez@mail.com", "0987654321"));
        listaPacientes.add(new Paciente("0304050607", "Marta", "Ramírez", 22, "marta.r@mail.com", "0971122334"));
        listaPacientes.add(new Paciente("0405060708", "Carlos", "López", 40, "carlos.l@mail.com", "0965566778"));
        listaPacientes.add(new Paciente("0506070809", "Lucía", "Fernández", 30, "lucia.f@mail.com", "0999988776"));
        listaPacientes.add(new Paciente("0607080910", "Pedro", "Suárez", 45, "pedro.suarez@mail.com", "0954433221"));
        listaPacientes.add(new Paciente("0708091011", "Elena", "Cruz", 27, "elena.cruz@mail.com", "0945678901"));
        listaPacientes.add(new Paciente("0809101112", "Jorge", "Mendoza", 33, "jorge.m@mail.com", "0981122334"));
        listaPacientes.add(new Paciente("0910111213", "Camila", "Ríos", 29, "camila.rios@mail.com", "0979988776"));
        listaPacientes.add(new Paciente("1011121314", "Andrés", "Navarro", 38, "andres.n@mail.com", "0966677889"));

        return listaPacientes;
    }
    
}
