package calculadora;

/**
 *
 * @author Edgar Montiel
 */
public class Calculadora {

    String numero, numero2, signo, cadena;

    /**
    * Método que permite saber si existe un punto:
    */
    public static boolean punto(String cadena) {
        boolean resultado; // Declaramos una variable boolean
        resultado = false; // Le asignamos el valor false

        for (int i = 0; i < cadena.length(); i++) { // Con for, recorremos todo lo que esta en pantalla 
            if (cadena.substring(i, i++).equals(".")) { // Si encontamos un punto, entonces: 
                resultado = true; // La variable resultado es verdadera. 
                break; //Rompemos el ciclo
            }
        }
        return resultado; // Retornamos el valor. 
    }

    /**
    * Método para definir la operacion a realizar: 
    */
    public static String operaciones(String numero, String numero2, String signo) {
        Double resultado = 0.0; // Declaramos una variable y la inicializamos en 0. 
        String respuesta; //Declaramos la variable donde se guardara el resultado

        if (signo.equals("-")) { // Condicionamos que el signo ingresado sea "-"
            //Operacion que se va a realizar si la condicion es cierta: 
            resultado = Double.parseDouble(numero) - Double.parseDouble(numero2);

        } else if (signo.equals("+")) { // Condicionamos que el signo ingresado sea "+"
            //Operacion que se va a realizar si la condicion es cierta: 
            resultado = Double.parseDouble(numero) + Double.parseDouble(numero2);

        } else if (signo.equals("x")) {// Condicionamos que el signo ingresado sea "x"
            //Operacion que se va a realizar si la condicion es cierta: 
            resultado = Double.parseDouble(numero) * Double.parseDouble(numero2);

        } else if (signo.equals("/")) {// Condicionamos que el signo ingresado sea "/"
            //Operacion que se va a realizar si la condicion es cierta: 
            resultado = Double.parseDouble(numero) / Double.parseDouble(numero2);
        }

        respuesta = resultado.toString();  // Convertimos el valor de la variable respuesta a Entero

        return respuesta; // Retornamos respuesta
    }
}
