import java.util.Scanner;
public class Ejercicio83 {
    public static void main(String[] args) {
        double num1, num2, num3, promedio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tres numeros para valorar el promedio y su calificacion ");
        System.out.print("Numero 1: ");
        num1 = sc.nextDouble();
        System.out.print("Numero 2: ");
        num2 = sc.nextDouble();
        System.out.print("Numero 3: ");
        num3 = sc.nextDouble();
        sc.close();

        promedio = calcularPromedio(num1, num2, num3);

        System.out.println();
        if (promedio > 7 ) {
            System.out.println("APROBADO ");
        } else {
            System.out.println("MEJORE LA NOTA");
        }

        System.out.println("Su promedio es de "+String.format("%.2f", promedio));
    }

    public static double calcularPromedio(Double num1, Double num2, Double num3){
        
        return (num1 + num2 + num3)/ 3;
    }
}
