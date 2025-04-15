/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author josem
 */
public class Turnos {

    private int id;
    private String fecha;
    private String hora;
    private String minuto;
    
    public Turnos(){
        
    }
    public Turnos(int id, String fecha, String hora, String minuto) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.minuto = minuto;
    }
      
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }
    
     public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
}
