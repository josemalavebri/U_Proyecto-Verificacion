
package utilidades.Table.Command;

import modelos.BaseEntity;
import utilidades.Controller.ManagerController;


public class CommandEliminar implements Comando{

    private final int id;
    private final ManagerController controlador ;
    private final Class<?> c ;
    
    public CommandEliminar(int id, Class<?> c) {
        this.id = id; 
        this.c = c;
        controlador = ManagerController.getInstance();
    }

    @Override
    public void ejecutar() {
        controlador.remove(id, c); 

    }
    
}
