import java.util.Scanner;
public class Ejercicio101 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        boolean divisible=false;

        System.out.println("Ingresa dos numeros para verificar si uno es divible por el otro");
        System.out.print("Numero 1: ");
        numero1 = sc.nextInt();
        System.out.print("Numero 2: ");
        numero2 = sc.nextInt();
        sc.close();

        divisible = calcularDivisible(numero1, numero2);

        if (divisible){
            System.out.println("\nDIVISIBLE");
        } else {
            System.out.println("\nNO ES DIVISIBLE");
        }
    }

    public static boolean calcularDivisible(int dividendo, int divisor){
        boolean esDivisible=false;
        if (dividendo % divisor == 0){
            esDivisible = true;
        }
        return esDivisible;
    }
}
