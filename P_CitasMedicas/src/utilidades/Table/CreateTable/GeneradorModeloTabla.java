package utilidades.Table.CreateTable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class GeneradorModeloTabla {

    
    public static String[] extraerNombresColumnas(Object objeto) {
        List<String> columnas = new ArrayList<>();
        List<Class<?>> clases = new ArrayList<>();
        Class<?> clase = objeto.getClass();

        // Guardar todas las clases en la jerarquía
        while (clase != null && clase != Object.class) {
            clases.add(clase);
            clase = clase.getSuperclass();
        }

        // Recorrer de la superclase a la subclase para mantener orden lógico
        for (int i = clases.size() - 1; i >= 0; i--) {
            Field[] campos = clases.get(i).getDeclaredFields();
            for (Field campo : campos) {
                columnas.add(campo.getName());
            }
        }

        return columnas.toArray(new String[0]);
    }
}
