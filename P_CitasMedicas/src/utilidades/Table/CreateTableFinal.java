
package utilidades.Table;

import java.util.List;
import java.util.function.Consumer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilidades.ManagerController;


public class CreateTableFinal<T> {
    
    private final ManagerController controller;
    
    public CreateTableFinal(ManagerController controller){
        this.controller = controller;
    }
    
    
    public void newModelTotalConGeneralTable(JTable table,Class<T> c){
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

    
    
    
    
}
