import java.util.Scanner;
public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, salarioxHorasExtra, horasTraba, tarifaPorHoras, horasExtra, tarifaPorHorasExtra, tarifaAumento50porciento;

        System.out.print("Ingresa las horas trabajadas: ");
        horasTraba = sc.nextDouble();

        System.out.print("Ingresa la tarifa por horas trabajadas: ");
        tarifaPorHoras = sc.nextDouble();
        sc.close();

        if (horasTraba > 40) {
            //Calculamos horas extras
            horasExtra = horasTraba - 40;
            //calcular las horas a las que no se le aplicara aumento
            horasTraba = horasTraba - horasExtra;
            //Calcular el salario solo con las horas que no se tendran aumento de 50%
            salario = horasTraba * tarifaPorHoras;
            //Calculamos la tarifa con aumento de 50% y le 
            //sumamos el aumento a la tarifa final para las horas extras 
            tarifaAumento50porciento = tarifaPorHoras * 0.5;
            tarifaPorHorasExtra = tarifaPorHoras + tarifaAumento50porciento;
            salarioxHorasExtra = horasExtra * tarifaPorHorasExtra;
            //Calculamos el salario final sumandole el salario que tenemos mas el salario por las horas extras
            salario = salario + salarioxHorasExtra;
            System.out.println("El salario del trabajador es: $"+ salario);
        } else {
            salario = horasTraba * tarifaPorHoras;
            System.out.println("EL salario del trabajador es: $"+ salario);
        }
    }
}
