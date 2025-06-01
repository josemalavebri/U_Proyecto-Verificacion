
package utilidades.Validador;

import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.JOptionPane;


public class Validador { 
    
    HashMap<Object, String> hashMap = new HashMap<>();
    public void putCampo(Object valorObject, String mensajeError){
        hashMap.put(valorObject, mensajeError);
    }
    
    public boolean validarCamposGuardados(){
        for(Entry<Object,String> entry: hashMap.entrySet()){
            Object entryObjectType = entry.getKey();
            String entryMessage = entry.getValue();
            
            if(entryObjectType instanceof Integer){
                return validarCampoNumerico(entryObjectType, entryMessage);
            }
            
            if(entryObjectType instanceof String){
                return validarCampoTexto(entryObjectType, entryMessage);
            }
        }
        return false;
    }
    
    private boolean validarCampoNumerico(Object campoPorVerificar, String mensaje){
        TipoValidacion[] validaciones = {TipoValidacion.NO_NULO,TipoValidacion.NUMERICO};
        if(!ValidadorDeCampos.validarCampo(campoPorVerificar, validaciones)){
            JOptionPane.showMessageDialog(null, mensaje);
            return false;
        }
        return true;
    }
    
    private boolean validarCampoTexto(Object campoPorVerificar, String mensaje){
        if(!ValidadorDeCampos.validarCampo(campoPorVerificar,TipoValidacion.NO_NULO,TipoValidacion.CADENA_TEXTO_VALIDA)){
            JOptionPane.showMessageDialog(null, mensaje);
            return false;
        }
        return true;
    }


}
