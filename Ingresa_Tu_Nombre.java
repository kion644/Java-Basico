import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
    class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in) ;
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa un nombre");
        String nombre = buffer.readLine();
        System.out.println("Hola " + nombre);

}
}