
package utilidades.Table.EventTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilidades.Table.GeneralTableModel;


public class EventoModificar<T> implements ActionListener {
    
    private final JTable tabla;
    private final Consumer<T> abrirFormularioEditar;
    private final Class<T> c;
    

    public EventoModificar(JTable tabla, Consumer<T> abrirFormularioEditar, Class<T> c) {
        this.tabla = tabla;
        this.abrirFormularioEditar = abrirFormularioEditar;
        this.c = c;
    }
    
    private T obtenerObjetoDeFila(JTable tabla, int filaSeleccionada) {
        if (filaSeleccionada < 0) return null;
        GeneralTableModel generalTableModel =  (GeneralTableModel) tabla.getModel();
        Object obj = generalTableModel.getObjetoAt(filaSeleccionada);
        System.out.println("Clase real: " + obj.getClass().getName());

        if (c.isInstance(obj)) {
            return c.cast(obj);
        }
        
        return null;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) { 
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada >= 0) {
            T objetoSeleccionado = obtenerObjetoDeFila(tabla, filaSeleccionada);
            if (objetoSeleccionado != null) {
                abrirFormularioEditar.accept(objetoSeleccionado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo recuperar el objeto de la fila");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona una fila");
        }
    }
}
