import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 class Ingresa_Tu_Edad {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in) ;
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa tu edad");
        String strEdad = buffer.readLine();
        Integer Edad = Integer.parseInt(strEdad);

        if (Edad >= 18) {
            System.out.println("Es mayor de edad");
        }
            else {
                System.out.println ("NO es mayor de edad");
            }
        }
}
