/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

public class ComprobadorObjetos {
    
    
    public boolean objetoNoNulo(Object objeto){
        if(objeto==null){
            return true;
        }
        return false;
    }
    
    public boolean cadenaIsString(Object entrada){
        return entrada instanceof String;
    }
    
    
    public static boolean contieneSoloTexto(String entrada) {
        return entrada.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    }
    
    
    
    
    
}
