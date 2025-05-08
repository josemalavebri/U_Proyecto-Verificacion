
package modelos;

public class Medico extends Persona{
    
    private String especialidad;
    
    public Medico(int id, int cedula, int edad,String nombre, String apellido, String especialidad) {
        super(id,cedula,edad,nombre,apellido,1);
        this.especialidad = especialidad;
    }
    
    

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre + " "+apellido;
    }
    
     
    
}
