import java.util.Scanner;

public class Ejercicio128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anioIngr;
        
        do {
            System.out.println("Ingresa un año");
            anioIngr = sc.nextInt();
        } while (anioIngr < 1000 || anioIngr > 9999);
        sc.close();

        if (anioIngr % 4 == 0 && anioIngr % 100 !=0) {
            System.out.println("El año de "+ anioIngr + " es bisiesto");
        } else if (anioIngr % 4 == 0 && anioIngr % 100 == 0 && anioIngr % 400 ==0) {
            System.out.println("El año de "+ anioIngr + " es bisiesto");
        } else {
            System.out.println("El año de "+ anioIngr + " no es bisiesto");
        }
    }
}
