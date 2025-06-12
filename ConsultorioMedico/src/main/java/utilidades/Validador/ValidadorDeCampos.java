package utilidades.Validador;

public class ValidadorDeCampos {

    public static boolean validarCampo(Object valor, TipoValidacion... validaciones) {
        for (TipoValidacion validacion : validaciones) {
            switch (validacion) {
                case NO_NULO -> {
                    if (valor == null) return false;
                }
                case NUMERICO -> {
                    if (!esNumerico(valor)) return false;
                }
                case CADENA_TEXTO_VALIDA -> {
                    if (!esCadenaTextoValida(valor)) return false;
                }
                case SOLO_LETRAS -> {
                    if (!esSoloLetras(valor)) return false;
                }
                case RANGO_EDAD -> {
                    if (!esEdadValida(valor)) return false;
                }
                case TELEFONO_ECUATORIANO -> {
                    if (!esTelefonoEcuatoriano(valor)) return false;
                }
                case CEDULA_ECUATORIANA -> {
                    if (!esCedulaValida(valor)) return false;
                }
                case CORREO_ELECTRONICO -> {
                    if (!esCorreoValido(valor)) return false;
                }
                case OPCION_SELECCIONADA -> {
                    if (!opcionSeleccionada(valor)) return false;
                }
                case LONGITUD_MINIMA -> {
                    if (!tieneLongitudMinima(valor, 3)) return false; 
                }
                case LONGITUD_MAXIMA -> {
                    if (!tieneLongitudMaxima(valor, 50)) return false;
                }
            }
        }
        return true;
    }

    private static boolean esNumerico(Object valor) {
        try {
            Double.parseDouble(valor.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean esCadenaTextoValida(Object valor) {
        String texto = valor.toString().trim();
        return !texto.isEmpty();
    }

    private static boolean esSoloLetras(Object valor) {
        return valor.toString().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
    }

    private static boolean esEdadValida(Object valor) {
        try {
            int edad = Integer.parseInt(valor.toString());
            return edad >= 0 && edad <= 120;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean esTelefonoEcuatoriano(Object valor) {
        String telefono = valor.toString();
        return telefono.matches("^09\\d{8}$");
    }

    private static boolean esCedulaValida(Object valor) {
        String cedula = valor.toString();
        return cedula.matches("^\\d{10}$"); 
    }

    private static boolean esCorreoValido(Object valor) {
        String correo = valor.toString();
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    private static boolean opcionSeleccionada(Object valor) {
        return valor != null && !valor.toString().equalsIgnoreCase("Seleccione");
    }

    private static boolean tieneLongitudMinima(Object valor, int min) {
        return valor.toString().trim().length() >= min;
    }

    private static boolean tieneLongitudMaxima(Object valor, int max) {
        return valor.toString().trim().length() <= max;
    }
    
}
