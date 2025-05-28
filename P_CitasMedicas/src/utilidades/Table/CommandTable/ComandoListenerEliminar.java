
package utilidades.Table.CommandTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.BaseEntity;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.CreateTable.ObjectTableModel;


public class ComandoListenerEliminar implements ActionListener {
    
    private JTable tabla;

    public ComandoListenerEliminar(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonEditor editor = (ButtonEditor) e.getSource();  // ✅ casteamos correctamente
        int fila = editor.getRow();
        ObjectTableModel modelo = (ObjectTableModel) tabla.getModel();
        BaseEntity baseEntity = (BaseEntity) modelo.getObjetoAt(fila);
        int id = baseEntity.getId();
        ((DefaultTableModel) tabla.getModel()).removeRow(fila);
        Class<?> c = baseEntity.getClass();
        Comando eliminar = new CommandEliminar(id, c);
        eliminar.ejecutar();
    }
}