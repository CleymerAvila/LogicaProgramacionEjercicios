import java.util.Scanner;

/**
 * 186. Programa que pida una cadena de caracteres e imprima la palabra en orden
    inverso.
 */
public class Ejercicio186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres");
        String cadena = sc.nextLine(); sc.close();

        char cadenaInversa[] = new char[cadena.length()];

        int d= cadena.length()-1;
        int i=0;
        while (d>=0) {
            cadenaInversa[i] = cadena.charAt(d);
            i++;
            d--;
        }

        String cadenaOrdenInverso = String.valueOf(cadenaInversa);
        
        System.out.println(cadenaOrdenInverso);
    }
}
