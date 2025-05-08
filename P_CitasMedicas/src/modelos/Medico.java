
package modelos;

public class Medico extends Persona{
    
    private String especialidad;
    private int telefono;
    private int cedula;
    private String genero;
    
<<<<<<< HEAD
    public Medico(int id, int cedula, int edad,String nombre, String apellido, String especialidad) {
        super(id,cedula,edad,nombre,apellido,1);
=======
    
    public Medico(int id, int cedula, String nombre, String apellido, String especialidad, String genero, int telefono  ) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
>>>>>>> cb39bc6f867f68e4786fcfdf1ffd65ba814f302a
        this.especialidad = especialidad;
        this.genero = genero;
        this.telefono = telefono;
    }
    
    

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre + " "+apellido;
    }
}
