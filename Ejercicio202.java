import java.util.Scanner;

public class Ejercicio202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int FECHA_ACTUAL = 2024;

        System.out.println("Ingresa el año de tu nacimiento: ");
        int fechaNaci = sc.nextInt();

        int edad = FECHA_ACTUAL - fechaNaci;

        System.out.println("\nDejamé adivinar tu edad es... "+ edad +  " años!!");
    }
}
