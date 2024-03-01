import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horasTrab, tarifaPorHoras, salario;

        System.out.print("Ingresa el numero de horas trabajadas: ");
        horasTrab = sc.nextDouble();

        System.out.println("Ingrese la tarifa por hora trabajada");
        tarifaPorHoras = sc.nextDouble();
        sc.close();

        salario = tarifaPorHoras * horasTrab;

        System.out.println("El salario del trabajador es igual a $"+salario);
    } 
}
