
package utilidades.Table.Command;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.ButtonTable.ButtonRenderer;


public class ColumnHelper {
    

    public static void agregarColumnaBoton(JTable tabla, String nombreColumna, ActionListener listener) {
       // tabla.getColumnModel().addColumn(nombreColumna);
        int columna = tabla.getColumnModel().getColumnIndex(nombreColumna);
        tabla.getColumnModel().getColumn(columna).setCellRenderer(new ButtonRenderer());
        tabla.getColumnModel().getColumn(columna).setCellEditor(new ButtonEditor(new JCheckBox(),nombreColumna, listener));
    }
}


