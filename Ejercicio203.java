import java.util.Scanner;

public class Ejercicio203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad:  ");
        int edad = sc.nextInt();

        double numPulsaciones = (double) (220 - edad) /10;

        System.out.printf("\n%s %.2f %s", "El numero de pulsaciones por cada 10 segundos de ejercicios es ",numPulsaciones, " pulsaciones");;

    }
}
