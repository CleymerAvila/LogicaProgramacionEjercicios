import java.util.Scanner;
public class Ejercicio102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horasTrabajadas, tarifaxhora, horasExtras, tarifaPorHrsExtras, salario, salarioFinal;

        System.out.println("Ingrese las horas trabajadas del trabajador electrico");
        horasTrabajadas = sc.nextFloat();

        System.out.println("Ingrese el valor de la tarifa por hora trabajada");
        tarifaxhora = sc.nextFloat();

        if (horasTrabajadas > 40){
            horasExtras = horasTrabajadas - 40;
            horasTrabajadas = horasTrabajadas - horasExtras;
            tarifaPorHrsExtras = tarifaxhora * 0.25;
            salario = horasTrabajadas * tarifaxhora;
            salarioFinal = salario + horasExtras * tarifaPorHrsExtras;
            System.out.println("\nEl salario del trabajador electrico con aumento del 25% a las" +
            " horas extra es de $"+ salarioFinal);
        } else {
            salario = horasTrabajadas * tarifaxhora;
            System.out.println("\nEl salario del trabajador electrico es $"+ salario);
        }

    }
}
