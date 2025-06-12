
package utilidades.ComboBox;

import java.util.List;
import javax.swing.JComboBox;
import modelos.BaseEntity;
import utilidades.Controller.ManagerController;


public class ComboBoxControl {
    private ManagerController managerController;
    public ComboBoxControl(){
        managerController = ManagerController.getInstance();
    }
    
    public List LlenarDatos(Class<? extends BaseEntity> c, JComboBox<String> comboBox){
        List lista = managerController.get(c);  // Asegúrate que esto devuelva una lista tipada
        ComboBoxFiller.llenarComboBox(comboBox, lista);
        return lista;
    }
}
