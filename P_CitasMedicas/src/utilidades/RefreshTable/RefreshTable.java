
package utilidades.RefreshTable;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import utilidades.Table.CommandTable.Comando;
import utilidades.Table.CommandTable.ComandoRefresh;


public class RefreshTable  {

    private final HashMap<String, JTable> tables = new HashMap<>();
    
    private static RefreshTable refreshTable;
    
    private RefreshTable(){ }
    
    public void suscribir(String identificador, JTable table){
        
        
        tables.put(table.getName(), table);
    }
    
    public void refrescar(JTable tableName){
        JTable table = tables.get(tableName.getName());
        Comando comando = new ComandoRefresh(table);
        comando.ejecutar();
    }
    
    public void refrescarTodas(){
        for(var table : tables.entrySet()){
            Comando comando = new ComandoRefresh(table.getValue());
            comando.ejecutar();
        }
    }

    public static RefreshTable getInstance(){
        if(refreshTable == null){
            refreshTable = new RefreshTable();
        }
        return refreshTable;
    }
 
}
