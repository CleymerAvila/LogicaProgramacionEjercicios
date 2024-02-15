import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int dividiendo, divisor, resto;
       
       System.out.println("Ingrese el dividiendo: ");
       dividiendo = leer.nextInt();
       System.out.println("Ingrese el divisor");
       divisor = leer.nextInt();
       leer.close();

       resto = dividiendo % divisor;

       if (resto != 0) {
            System.out.println("El resto de la division entera es "+ resto);
       } else {
            System.out.println("la division ingresada es una division exacta");
       }

       
    }
}
