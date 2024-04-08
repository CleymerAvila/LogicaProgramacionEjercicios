import java.util.Scanner;

public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa dos variables numericas (A y B):");
        System.out.print("A: "); double n1 = leer.nextInt();
        System.out.print("B: "); double n2 = leer.nextInt();
        leer.close();
        double s = n1 + n2;
        double r = n1 - n2;
        double mult = (double)(n1 * n2);
        double div = n1 / n2;
        double mod = n1 % n2;


        System.out.println("\nSuma de los numeros: "+s);
        System.out.println("Resta de los numeros: "+r);
        System.out.println("Multiplicacion de los numero: "+mult);
        System.out.println("Division de los numeros: "+div);
        System.out.println("Resto de los numeros divididos: "+mod);
    }
}
