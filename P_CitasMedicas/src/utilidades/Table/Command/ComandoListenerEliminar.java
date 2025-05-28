
package utilidades.Table.Command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.Entity;
import modelos.BaseEntity;
import utilidades.Table.CreateTable.GeneralTableModel;


public class ComandoListenerEliminar implements ActionListener {
    
    private JTable tabla;

    public ComandoListenerEliminar(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int fila = (int) e.getSource();
        GeneralTableModel modelo = (GeneralTableModel) tabla.getModel();
        BaseEntity baseEntity = (BaseEntity) modelo.getObjetoAt(fila);
        int id = baseEntity.getId();
        ((DefaultTableModel) tabla.getModel()).removeRow(fila);
        // Se crea el comando y se ejecuta
        Class<?> c = baseEntity.getClass();
        Comando eliminar = new CommandEliminar(id, c);
        eliminar.ejecutar();
    }
}