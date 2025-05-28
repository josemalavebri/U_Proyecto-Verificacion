package utilidades.Table.CreateTable;

import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilidades.Controller.ManagerController;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.ButtonTable.ButtonRenderer;
import utilidades.Table.CommandTable.ComandoListenerActualizar;
import utilidades.Table.CommandTable.ComandoListenerEliminar;
import vistas.IReceptorEntityJFrame;

public class ConstructorModeloTabla<T> {
    
    private final ManagerController<T> controller;
    
    public ConstructorModeloTabla(ManagerController controller){
        this.controller = controller;
    }
    
    public void construirYAsignarModelo(JTable table, List<T> listaDatos){
        DefaultTableModel tableModel = crearModeloDesdeEntidad(listaDatos.get(0));
        ObjectTableModel general = cargarDatosEnModelo(tableModel, listaDatos);
        table.setModel(general);
    }
    
    private DefaultTableModel crearModeloDesdeEntidad(T entity){
        GeneradorModeloTabla tableColumns = new GeneradorModeloTabla();
        DefaultTableModel tableModel = tableColumns.generarModeloDesdeEntidad(entity);
        return tableModel;
    }
   
    private ObjectTableModel cargarDatosEnModelo(DefaultTableModel tableModel, List listaDatos){
        AdaptadorListaAModeloTabla tableView = new AdaptadorListaAModeloTabla();
        tableView.cargarDatosEnModelo(tableModel, listaDatos);
        ObjectTableModel<T> general = new ObjectTableModel<>(tableModel,listaDatos);
        return general;
    }

    public void AgregarEventosEditarYEliminar(JTable table, IReceptorEntityJFrame frame) {
        ObjectTableModel general = (ObjectTableModel) table.getModel();

        if (general.findColumn("Eliminar") == -1) {
            general.addColumn("Eliminar");
            for (int i = 0; i < general.getRowCount(); i++) {
                general.setValueAt("Eliminar", i, general.getColumnCount() - 1);
            }
        }

        if (general.findColumn("Modificar") == -1) {
            general.addColumn("Modificar");
            for (int i = 0; i < general.getRowCount(); i++) {
                general.setValueAt("Modificar", i, general.getColumnCount() - 1);
            }
        }

        ComandoListenerEliminar eventoEliminar = new ComandoListenerEliminar(table);
        table.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        table.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), "Eliminar", eventoEliminar));

        ComandoListenerActualizar eventoActualizar = new ComandoListenerActualizar(table, frame);
        table.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        table.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox(), "Modificar", eventoActualizar));
    }
}
