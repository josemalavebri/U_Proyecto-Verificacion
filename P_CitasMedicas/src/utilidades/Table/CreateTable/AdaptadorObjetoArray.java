
package utilidades.Table.CreateTable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class AdaptadorObjetoArray {
    
    
    public static Object[] convertirAArray(Object objeto) {
    List<Object> valores = new ArrayList<>();
    Class<?> claseActual = objeto.getClass();

    while (claseActual != null && claseActual != Object.class) {
        for (Field campo : claseActual.getDeclaredFields()) {
            campo.setAccessible(true);
            try {
                valores.add(campo.get(objeto));
            } catch (IllegalAccessException e) {
                valores.add(null);
            }
        }
        claseActual = claseActual.getSuperclass(); // sube a Persona, luego a Object
    }

    return valores.toArray();
}
}


