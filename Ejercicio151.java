import java.util.Scanner;

public class Ejercicio151 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaCaracteres;

        System.out.print("Ingrese una cadena de texto: ");
        cadenaCaracteres = entrada.nextLine();
        entrada.close();

        if (cadenaCaracteres.length()>10) {
            System.out.println("\nCadena ingresada: "+cadenaCaracteres);
        } else {
            System.out.println("");
        }
    }
}
