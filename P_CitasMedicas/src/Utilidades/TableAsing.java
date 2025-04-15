/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josem
 */
public class TableAsing {
    
    
    
    public static DefaultTableModel CrearModeloTabla(Object objeto){
        String[] nombreDeColumnas= NombresColumnasGet(objeto);
        DefaultTableModel modelo = new DefaultTableModel(nombreDeColumnas, 0);
        return modelo;
    }
    
    private static String[] NombresColumnasGet(Object objeto){
        Field[] campos = objeto.getClass().getDeclaredFields();
        ArrayList<String> columnas = new ArrayList();
        for (Field campo : campos) {
            columnas.add(campo.toString());
        }
        String[] nombresDeColumnas = new String[campos.length];
        for(int i=0; i<campos.length;i++ ){
            nombresDeColumnas[i]= campos[i].toString();
        }
        return nombresDeColumnas;
    }
    
    
    
}
