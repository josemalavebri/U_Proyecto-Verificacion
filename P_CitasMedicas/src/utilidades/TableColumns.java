package utilidades;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


//CLASE PARA CREAR LOS MODELOS DE LAS TABLAS BASADO EN LOS NOMBRES DE LOS CAMPOS DE LOS OBJETOS
public class TableColumns {
    
    //Retorna Modelo total de la tabla
    public static DefaultTableModel CrearColumnasModelo(Object objeto){
        String[] nombreDeColumnas= NombresColumnasGet(objeto);
        DefaultTableModel modelo = new DefaultTableModel(nombreDeColumnas, 0);
        return modelo;
    }
    
    //Retorna los nombres de los campos del objeto
    private static String[] NombresColumnasGet(Object objeto){
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
