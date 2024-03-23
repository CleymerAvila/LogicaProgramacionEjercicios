import java.util.Scanner;

public class Ejercicio107 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int edad;

        do {
            System.out.println("Ingrese su edad para determinar si es mayor de edad");
            System.out.print("Edad: ");
            edad = sc.nextInt();
        } while (edad <= 0 || edad > 100);sc.close();

        if (edad >= 18) {
            System.out.println("\nERES MAYOR DE EDAD!");
        } else {
            System.out.println("\nNO ERES MAYOR DE EDAD");
        }
    }
}
