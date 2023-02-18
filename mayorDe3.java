import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class mayorDe3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in) ;
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingresa el 1er numero");
        String strnumero1 = buffer.readLine();
        Integer numero1 = Integer.parseInt(strnumero1);

        System.out.println("Ingresa el 2do numero");
        String strnumero2 = buffer.readLine();
        Integer numero2 = Integer.parseInt(strnumero2);

        System.out.println("Ingresa el 13er numero");
        String strnumero3 = buffer.readLine();
        Integer numero3 = Integer.parseInt(strnumero3);
        
        Integer numeroMayor = numero1;
        
        if (numero2 > numero1) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        System.out.println("El mayor es: " + numeroMayor);
    }
}
