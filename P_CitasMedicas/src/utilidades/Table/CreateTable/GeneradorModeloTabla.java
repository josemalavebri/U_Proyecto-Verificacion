package utilidades.Table.CreateTable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class GeneradorModeloTabla {
    
    public DefaultTableModel generarModeloDesdeEntidad(Object objeto){
        String[] nombreDeColumnas= extraerNombresColumnas(objeto);
        DefaultTableModel modelo = new DefaultTableModel(nombreDeColumnas, 0);
        return modelo;
    }

    private String[] extraerNombresColumnas(Object objeto){
        Field[] campos = objeto.getClass().getDeclaredFields();
        ArrayList<String> columnas = new ArrayList();
        for (Field campo : campos) {
            columnas.add(campo.toString());
        }
        String[] nombresDeColumnas = new String[campos.length];
        for(int i=0; i<campos.length;i++ ){
            nombresDeColumnas[i]= campos[i].getName();
        }
        return nombresDeColumnas;
    }
    
    
}
