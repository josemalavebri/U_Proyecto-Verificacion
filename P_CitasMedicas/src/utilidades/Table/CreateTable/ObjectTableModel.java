
package utilidades.Table.CreateTable;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.BaseEntity;


public class ObjectTableModel<T> extends DefaultTableModel {
  
    private final List<BaseEntity> datos;

    public ObjectTableModel(List<BaseEntity> datos) {
         super();
         this.datos = datos;
         String[] columnas = GeneradorModeloTabla.extraerNombresColumnas(datos.get(0));
         setColumnIdentifiers(columnas);
           for (BaseEntity fila : datos) {
            addRow(AdaptadorObjetoArray.convertirArrayObjects(fila));
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false; 
    }


    public BaseEntity getObjetoAt(int row) {
        return datos.get(row);
    }
    
    public void removeById(int id) {
        datos.removeIf(entity -> entity.getId() == id);
    }
        
     
}
