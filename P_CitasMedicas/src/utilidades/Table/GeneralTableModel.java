
package utilidades.Table;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class GeneralTableModel<T> extends DefaultTableModel {
  
    private List<T> datos;

    public GeneralTableModel(DefaultTableModel modeloBase, List<T> datos) {
         super(); // Llama al constructor base
         this.datos = datos;

         int columnCount = modeloBase.getColumnCount();
         String[] columnas = new String[columnCount];
         for (int i = 0; i < columnCount; i++) {
             columnas[i] = modeloBase.getColumnName(i);
         }
         setColumnIdentifiers(columnas);

         // Copiar las filas del modelo base
         Vector<?> filas = modeloBase.getDataVector();
         for (Object fila : filas) {
             addRow(((Vector<?>) fila).toArray());
         }
     }
    

    public T getObjetoAt(int row) {
        return datos.get(row);
    }


     
}
