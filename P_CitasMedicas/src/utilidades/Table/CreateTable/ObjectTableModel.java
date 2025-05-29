
package utilidades.Table.CreateTable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modelos.BaseEntity;


public class ObjectTableModel<T> extends DefaultTableModel {
  
    private List<BaseEntity> datos;

    public ObjectTableModel(List<BaseEntity> datos) {
         super();
         this.datos = datos;
         String[] columnas = GeneradorModeloTabla.extraerNombresColumnas(datos.get(0));
         setColumnIdentifiers(columnas);
           for (BaseEntity fila : datos) {
            addRow(AdaptadorObjetoArray.convertirAArray(fila));
        }
    }


    public BaseEntity getObjetoAt(int row) {
        return datos.get(row);
    }
    
    public void removeById(int id) {
        datos.removeIf(entity -> entity.getId() == id);
    }
        
     
}
