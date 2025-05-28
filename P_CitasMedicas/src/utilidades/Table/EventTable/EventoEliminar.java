
package utilidades.Table.EventTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import utilidades.Controller.ManagerController;


public class EventoEliminar<T> implements ActionListener {
    
    private final JTable tabla;
    private final Runnable recargarDatos;
    private final ManagerController manager;

    public EventoEliminar(JTable tabla, ManagerController manager,Runnable recargarDatos) {
        this.tabla = tabla;
        this.recargarDatos = recargarDatos;
        this.manager = manager;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            int id = (int) tabla.getValueAt(fila, 0);
            boolean eliminado = manager.remove(id);
            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
                recargarDatos.run();
            }
        }
    }
    
}
