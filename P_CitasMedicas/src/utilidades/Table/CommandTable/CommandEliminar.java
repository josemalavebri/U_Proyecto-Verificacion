
package utilidades.Table.CommandTable;

import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.BaseEntity;
import utilidades.Controller.ManagerController;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.CreateTable.ObjectTableModel;

public class CommandEliminar implements Comando{

    private final ManagerController controlador ;
    private final JTable tabla;
    private final ActionEvent e;
            
    public CommandEliminar(ActionEvent e, JTable tabla) {
        controlador = ManagerController.getInstance();
        this.tabla = tabla;
        this.e = e;
    }

    @Override
    public void ejecutar() {
        ButtonEditor editor = (ButtonEditor) e.getSource();
        int fila = editor.getRow();
        ObjectTableModel modelo = (ObjectTableModel) tabla.getModel();
        BaseEntity baseEntity = (BaseEntity) modelo.getObjetoAt(fila);
        int id = baseEntity.getId();
        ((DefaultTableModel) tabla.getModel()).removeRow(fila);
        Class<?> c = baseEntity.getClass();
        controlador.remove(id, c);
    }
    
}
