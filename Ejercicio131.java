import java.util.Scanner;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nomina, horasTrab, horaextra, tarifa, tarifaHrsExtra;
        
        do {
            System.out.println("Ingresa las horas Trabajadas del trabajador:");
            horasTrab = sc.nextDouble();
            System.out.println("Ingresa la tarifa por hora: ");
            tarifa = sc.nextDouble();
        } while (horasTrab <= 0 || tarifa <= 0);sc.close();

        if (horasTrab > 40) {
            horaextra = horasTrab - 40;
            horasTrab = horasTrab - horaextra;
            nomina = horasTrab * tarifa;
            tarifaHrsExtra = tarifa*2;
            nomina+=horaextra * tarifaHrsExtra;
            System.out.println("La nomina del trabajador con el doble de la tarifa para las horas extra es $"+nomina);
        } else {
            nomina = horasTrab * tarifa;
            System.out.println("La nomina del trabajador es $"+ nomina);
        }
    }
}
