import java.util.Scanner;

public class Ejercicio237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        do {
            System.out.println("Ingresa dos numero para imprimir los numeros impares desde el primero al segundo");
            System.out.print("Primer numero: ");  num1 = sc.nextInt();
            System.out.print("Segundo numero: "); num2 = sc.nextInt();
        } while (num1 > num2 || num1 < 0 || num1 == num2); sc.close();


        System.out.println("numero impares desde "+num1+ " hasta "+num2);
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0){
                System.out.print(" "+i);
            }
        }
    }
}
