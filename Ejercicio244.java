import java.util.Scanner;

public class Ejercicio244
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingresa un numero positivo menor que 20");
            num = sc.nextInt();
        } while (num <=  0 || num > 20 );

        int divisores=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                divisores++;
            }
        }

        if (divisores== 2){
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado no es primo");
        }
    }
}
