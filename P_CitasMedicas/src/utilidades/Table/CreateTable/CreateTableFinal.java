
package utilidades.Table.CreateTable;

import java.util.List;
import java.util.function.Consumer;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.CitaMedica;
import utilidades.Controller.ManagerController;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.ButtonTable.ButtonRenderer;
import utilidades.Table.Command.ComandoListenerEliminar;


public class CreateTableFinal<T> {
    
    private final ManagerController<T> controller;
    
    public CreateTableFinal(ManagerController controller){
        this.controller = controller;
    }
    
    //EVENTO NUEVO QUE CREA CON TODO Y COLUMNAS
    
    public void newModelCommand(JTable table, Class<T> c){
        List<T> listaDatos = controller.get(c);
        DefaultTableModel tableModel = crearTablaModeloDatos(listaDatos.get(0));
        GeneralTableModel general = llenarDatos(tableModel, listaDatos);
        table.setModel(general);
    }
    
    //EVENTO QUE PREVIAMENTE FUNCIONABA
    public void newModelTotalConGeneralTable(JTable table, Class<T> c){
        List<T> listaDatos = controller.get(c);
        DefaultTableModel tableModel = crearTablaModeloDatos(listaDatos.get(0));
        GeneralTableModel general = llenarDatos(tableModel, listaDatos);
        table.setModel(general);
    }
    
    public DefaultTableModel crearTablaModeloDatos(T entity){
        TableColumns tableColumns = new TableColumns();
        DefaultTableModel tableModel = tableColumns.CrearColumnasModelo(entity);
        return tableModel;
    }
    
   
    public GeneralTableModel llenarDatos(DefaultTableModel tableModel, List listaDatos){
        CreateTableView tableView = new CreateTableView();
        tableView.cargarDatosEnModelo(tableModel, listaDatos);
        GeneralTableModel<T> general = new GeneralTableModel<>(tableModel,listaDatos);
        return general;
    }

    
    public void CreaEventoModificarEliminar(JTable table, GeneralTableModel general,ComandoListenerEliminar eventoEliminar){
        general.addColumn("Eliminar");
        
        
        table.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        table.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), "Eliminar", eventoEliminar));
    }
    }
    
    
    
    
}
