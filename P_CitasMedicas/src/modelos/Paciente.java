package modelos;

public class Paciente extends Persona {

    private String correo;
    
    public Paciente(){
        
    }

    public Paciente(int cedula, String nombre, String apellido, int edad, String correo, int telefono) {
        super(0,cedula,edad,nombre,apellido,telefono);
        this.correo = correo;
    }

    public Paciente(int id, int cedula, String nombre, String apellido, int edad, String correo, int telefono) {
        super(id,cedula,edad,nombre,apellido,telefono);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    



}
