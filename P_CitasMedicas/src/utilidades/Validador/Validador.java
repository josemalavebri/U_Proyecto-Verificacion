
package utilidades.Validador;

import javax.swing.JOptionPane;


public class Validador {
    
    
    public static boolean validarCampoNumerico(Object campoPorVerificar, String mensaje){
        TipoValidacion[] validaciones = {TipoValidacion.NO_NULO,TipoValidacion.NUMERICO};
        if(!ValidadorDeCampos.validarCampo(campoPorVerificar, validaciones)){
            JOptionPane.showMessageDialog(null, mensaje);
            return false;
        }
        return true;
    }
    
     public static boolean validarCampoTexto(Object campoPorVerificar, String mensaje){
        if(!ValidadorDeCampos.validarCampo(campoPorVerificar,TipoValidacion.NO_NULO,TipoValidacion.CADENA_TEXTO_VALIDA)){
            JOptionPane.showMessageDialog(null, mensaje);
            return false;
        }
        return true;
    }


}
