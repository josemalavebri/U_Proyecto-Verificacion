
package utilidades.RefreshTable;

import java.util.HashMap;
import javax.swing.JTable;
import utilidades.Table.CommandTable.Comando;
import utilidades.Table.CommandTable.ComandoRefresh;


public class RefreshTable  {

    private final HashMap<String, JTable> tables = new HashMap<>();
    private static RefreshTable refreshTable;
    
    private RefreshTable(){
        
    }
    
    public void suscribir(String identificador, JTable table){
        tables.put(identificador, table);
    }
    
    public void refrescar(String identificador){
        JTable table = tables.get(identificador);
        Comando comando = new ComandoRefresh(table);
        comando.ejecutar();
    }

    public static RefreshTable getInstance(){
        if(refreshTable == null){
            refreshTable = new RefreshTable();
        }
        return refreshTable;
    }
 
}
