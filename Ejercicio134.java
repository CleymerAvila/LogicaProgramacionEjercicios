import java.util.Scanner;

public class Ejercicio134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean iguales;
        int numMenor;
        int numMayor;

        do {iguales=false;
            System.out.println("Ingrese dos numeros para verificar el mayor y el menor: ");
            System.out.print("- ");
            num1 = sc.nextInt();
            System.out.print("- ");
            num2 = sc.nextInt();

            if (num1==num2) {
                iguales=true;
            }
        } while (iguales); sc.close();

        if (num1>num2) {
            numMayor=num1;
            numMenor=num2;
        } else {
            numMayor=num2;
            numMenor=num1;
        }

        System.out.println("El numero mayor es el "+numMayor + " y el menor el "+ numMenor);

    }
}
