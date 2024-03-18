import java.util.Scanner;
public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, sumaNumeros, restaNumeros, resto;

        System.out.println("Ingresa los dos valores");
        System.out.print("Valor 1: ");
        num1 = sc.nextInt();
        System.out.print("Valor 2: ");
        num2 = sc.nextInt();

        sumaNumeros = num1 + num2;
        restaNumeros = num1 - num2;
        resto = sumaNumeros % restaNumeros;

        System.out.print("\nLa division entre la suma ("+ sumaNumeros+ ") de los dos valores "+num1 +
        " y "+ num2 + " y la resta (" + restaNumeros + ") de los mismos ");
        if (resto == 0){
            System.out.print("ES EXACTA");
        } else {
            System.out.print("NO ES EXACTA");
        }


    }
}
