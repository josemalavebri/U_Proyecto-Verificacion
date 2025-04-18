package modelos;

public class CitaMedica {
    
    
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
    
    
    
    
}
