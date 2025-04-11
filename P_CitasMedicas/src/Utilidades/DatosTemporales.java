package Utilidades;

import java.util.ArrayList;
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
    
    public static ArrayList<Turnos> CrearTurnosTemporales(){
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
}
