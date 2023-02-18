import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Funciones {
    
    public static void main(String[] args) throws IOException {

        System.out.println("Ingresa el 1er numero");
        Integer numero1 = CargarNumero() ;

        System.out.println("Ingresa el 2do numero");
        Integer numero2 = CargarNumero() ;

        System.out.println("Ingresa el 13er numero");
        Integer numero3 = CargarNumero() ;

        Funcion(numero1, numero2, numero3);
    }

    //Esto es para leer el numero que el usuario va a ingresar
    private static Integer CargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in) ;
        BufferedReader buffer = new BufferedReader(capturarTeclado) ;
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }


    /**
     * Esto es para calcular el menor de los 3 numeros
     * @param numero1 es el 1er numero
     * @param numero2 es el 2do numero
     * @param numero3 es el 3er numero
     */
    private static void Funcion( Integer numero1 , Integer numero2 , Integer numero3) {
        
        Integer numeroMenor = numero1;
        
        if (numero2 < numero1) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        System.out.println("El menor es: " + numeroMenor);
    }
}
