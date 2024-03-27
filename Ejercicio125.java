import java.util.Scanner;

public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero para imprimir sus multiplos desde 1 hasta nx1000");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println("\nLos multiplos de "+ n + " desde 1 hasta "+ n*1000+ " Son: \n");
        for (int i = 1; i <= n*1000; i++) {
            if (i % n == 0) {
               System.out.print(i+", "); 
            }
            
        }
    }
}