import java.util.Scanner;
public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad ;

        System.out.println("Ingresa la edad");
        edad = sc.nextInt();
        sc.close();
        String age = String.valueOf(edad);

        System.out.println("La edad ingresa en el teclado es de "+ age+ " años.");
        
    }
}
