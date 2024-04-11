import java.util.Scanner;

public class Ejercicio169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ANIO_ACTUAL=2024;


        System.out.println("Ingresa el año de nacimiento");
        int anioNac = sc.nextInt();

        int edad = ANIO_ACTUAL - anioNac;

        while (edad < 1 || edad > 100) {
            System.out.println("Ingresa el año de nacimiento");
            anioNac = sc.nextInt();
    
            edad = ANIO_ACTUAL - anioNac;
        } sc.close();


        System.out.println("Etapa de vida: ");
        if (edad >= 1 && edad <= 12) {
            System.out.print("Niñez");
        } else if (edad >= 13 && edad <= 18) {
            System.out.print("Adolescencia");
        } else if (edad >= 19  && edad <= 30) {
            System.out.print("Juventud");
        } else if (edad >= 31 && edad <= 60) {
            System.out.print("Adultes");
        } else if (edad >= 61 && edad <= 100) {
            System.out.print("Vejez");
        }

    }
}
