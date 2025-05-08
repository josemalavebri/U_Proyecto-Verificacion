
package modelos;

public class Medico extends Persona{
    
    private String especialidad;
    private String genero;
    

    public Medico(int id, int cedula, int edad,String nombre, String apellido, String especialidad,String genero,int telefono) {
        super(id,cedula,edad,nombre,apellido,telefono);
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
