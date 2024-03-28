import java.util.Scanner;

public class Ejercicio133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int numMenor=0;
        int numMayor=0;
        boolean numIguales=false;

        System.out.println("Ingrese dos numeros para verificar el mayor: ");
        System.out.print("- ");
        num1 = sc.nextInt();
        System.out.print("- ");
        num2 = sc.nextInt();
        sc.close();

        if (num1 > num2) {
            numMayor = num1;
            numMenor = num2;
        } else if (num2<num1) {
            numMayor = num2;
            numMenor = num1;
        } else {
            numIguales=true;
        }

        if (numIguales) {
            System.out.println("Los numero ingresados son iguales");
        } else {
            System.out.println("El numero mayor es el "+ numMayor + " y el menor el "+ numMenor);
        }


    }
}

