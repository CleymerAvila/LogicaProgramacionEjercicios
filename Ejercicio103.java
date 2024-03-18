import java.util.Scanner;
public class Ejercicio103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        do {
            System.out.println("Ingresa tres numeros para comprobar el mayor");
            System.out.print("Numero 1: ");
            num1 = sc.nextInt();
            System.out.print("Numero 2: ");
            num2 = sc.nextInt();
            System.out.print("Numero 3: ");
            num3 = sc.nextInt();
        } while (num2 == num1 || num2 == num3 || num3 == num1);

        if (num1 > num2 && num1 > num3){
            System.out.println("El numero mayor es el "+num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El numero mayor es el "+ num2);
        } else {
            System.out.println("El numero mayor es el "+num3);
        }


    }
}
