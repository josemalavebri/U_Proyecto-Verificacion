package modelos;

public class CitaMedica {
    
    private int id;

    
    private Paciente paciente;
    private Medico medico;
    private String descripcion;
    private Turnos turno;

    public CitaMedica(Paciente paciente, Medico medico, String descripcion, Turnos turno) {
        this.paciente = paciente;
        this.medico = medico;
        this.descripcion = descripcion;
        this.turno = turno;
    }
    
    public CitaMedica(int id, Paciente paciente, Medico medico, String descripcion, Turnos turno) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.descripcion = descripcion;
        this.turno = turno;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    
}
