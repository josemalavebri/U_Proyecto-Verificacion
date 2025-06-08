
package utilidades.Table.CommandTable;

import java.util.List;
import javax.swing.JTable;
import modelos.BaseEntity;
import utilidades.Controller.ManagerController;
import utilidades.Table.CreateTable.ObjectTableModel;


public class ComandoRefresh implements Comando{

    private ManagerController manager;
    private final JTable tabla;
    
    public ComandoRefresh(JTable tabla){
        this.tabla = tabla;
        manager = ManagerController.getInstance();
    }

    @Override
    public void ejecutar() {
        ObjectTableModel objectTableModel = (ObjectTableModel) tabla.getModel();
        BaseEntity baseEntity = objectTableModel.getObjetoAt(0);
        List<BaseEntity> datos = manager.get(baseEntity.getClass());
        objectTableModel.removeAll();
        objectTableModel.llenarDatosTabla(datos);
    }
    
    
}
