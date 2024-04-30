import java.util.Scanner;

public class Ejercicio241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo;
        int divisor;

        do {
            System.out.println("Ingresa dos enteros para dividir");
            System.out.println("El dividendo debe ser mayor");
            System.out.print("Dividendo: "); dividendo = sc.nextInt();
            System.out.print("Divisor : "); divisor = sc.nextInt();
        } while (dividendo < divisor);

        if (divisor == 0){
            System.out.println("No se puede dividir por cero!!");
        } else {
            int cociente = dividir(dividendo, divisor);
            int resto = dividendo % divisor;

            System.out.println("Resultado de la division: ");
            System.out.println("Cociente: "+cociente);
            System.out.println("Residuo: "+ resto);
        }


    }

    public static int  dividir(int dividendo, int divisor){
        int cociente = 0;

        while (dividendo >= divisor){
            dividendo -= divisor;
            cociente++;
        }

        return cociente;
    }
}
