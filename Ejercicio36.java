import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double tarifaEstacionamiento= 15;
        double horasEstacionadasInicial, minEstacionados,  pago, horasEstacionadasFinal;

        System.out.println("Ingresa el numero de horas y minutos estacionado el vehiculo");
        System.out.print("Hora: ");
        horasEstacionadasInicial = sc.nextInt();
        System.out.print("Minutos: ");
        minEstacionados = sc.nextDouble();
        sc.close();

        double converionMinutosAHoras = minEstacionados / 60 ;
        horasEstacionadasFinal = horasEstacionadasInicial + converionMinutosAHoras;

        System.out.println("\nHoras total: "+String.format("%.2f",horasEstacionadasFinal));
        pago = horasEstacionadasFinal * tarifaEstacionamiento;

        System.out.println("El total de pago por el estacionamiento de "
        + horasEstacionadasInicial + " horas " + "y "+ minEstacionados +" minutos es de: $"+pago);

    }
}
