
package utilidades.Table.CreateTable;

import java.awt.event.ActionListener;
import java.util.function.Consumer;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import utilidades.Controller.ManagerController;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.ButtonTable.ButtonRenderer;
import utilidades.Table.EventTable.EventoEliminar;
import utilidades.Table.EventTable.EventoModificar;


public class EventoTabla<T> {

    public void metodoFactor( ManagerController controller, JTable table,Consumer<T> abrirFormularioEditar , Runnable recargarDatoss){
        GeneralTableModel general = (GeneralTableModel) table.getModel();
       
        ActionListener eventoEliminar = new EventoEliminar( table, controller, recargarDatoss);
        ActionListener eventoModificar = new EventoModificar(table, abrirFormularioEditar);
        crearTableConEventos(table, general, eventoEliminar, eventoModificar);
    }
    
    public void crearTableConEventos(JTable table, GeneralTableModel general, ActionListener eventoEliminar, ActionListener eventoModificar  ){
        general.addColumn("Modificar");
        general.addColumn("Eliminar");
        
        table.setModel(general);
        table.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        table.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox(), "Modificar", eventoModificar));

        table.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        table.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), "Eliminar", eventoEliminar));
    }
    
}
