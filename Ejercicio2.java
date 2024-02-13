import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        String textoIngresado;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un texto");
        textoIngresado = leer.nextLine();

        System.out.println("El texto ingresado es: " + textoIngresado);
        leer.close();

    }
}
