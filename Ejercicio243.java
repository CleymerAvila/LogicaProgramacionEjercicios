import java.util.Scanner;

public class Ejercicio243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingresa un numero para verificar si es primo");
            num = sc.nextInt();
        } while (num<=0); sc.close();

        int i=1;
        int divisores=0;
        while (i<=num){
            if (num % i == 0){
                divisores++;
            }
            i++;
        }

        if (divisores==2){
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado no es primo ");
        }


    }
}
