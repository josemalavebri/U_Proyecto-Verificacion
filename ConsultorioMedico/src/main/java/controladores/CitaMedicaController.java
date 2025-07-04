
package controladores;

import Data.IRepository;
import modelos.CitaMedica;
import utilidades.Validador.MsgValidacion;
import utilidades.Validador.Validador;

public class CitaMedicaController extends GeneralController<CitaMedica> {

    public CitaMedicaController(IRepository repository) {
        super(repository);
    }

    @Override
    public boolean post(CitaMedica objeto) {
        if (!verificarCampos(objeto.getDescripcion(), objeto.getTurno().getFecha())) {
            return db.add(objeto);
        }
        return false;
    }

    @Override
    public boolean put(CitaMedica objeto) {
        if (!verificarCampos(objeto.getDescripcion(), objeto.getTurno().getFecha())) {
            return db.update(objeto);
        }
        return false;
    }

    private boolean verificarCampos(String descripcion, String turnoSeleccionado) {
        Validador validador = new Validador();
        validador.agregarCampo(descripcion, MsgValidacion.CAMPO_DESCRIPCION);
        validador.agregarCampo(turnoSeleccionado, MsgValidacion.CAMPO_TURNO);
        return validador.validarTodos();
    }

}