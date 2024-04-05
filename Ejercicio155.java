import java.util.Scanner;

public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        String palabraInvertida;

        System.out.println("Ingresa una palabra para verificar si es pálindroma");
        System.out.print("Palabra: "); palabra = entrada.next(); entrada.close();

        char[] palabraCharInvert = new char[palabra.length()];
        int decremento=palabra.length()-1;
        int i=0;
        while (decremento>=0) {
            palabraCharInvert[i] = palabra.charAt(decremento);
            i++;
            decremento--;
        }

        palabraInvertida = String.copyValueOf(palabraCharInvert);

        if (palabra.toLowerCase().equals(palabraInvertida.toLowerCase())) {
            System.out.println("\nLa palabra "+ palabra +" es palindroma");
        } else {
            System.out.println("\nLa palabra "+palabra + " no es palindroma");
        }

    }
}
