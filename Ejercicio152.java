import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaCaracteres;

        System.out.print("Ingrese una cadena de texto: ");
        cadenaCaracteres = entrada.nextLine();
        entrada.close();

        char[] arregloChar = cadenaCaracteres.toCharArray();

        for (int i = 0; i < arregloChar.length; i++) {
            System.out.println(arregloChar[i]);
        }
    }
}
