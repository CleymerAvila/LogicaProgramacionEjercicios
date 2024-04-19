/**
 * 215. Queremos realizar un pequeño programa para introducirlo en el ordenador de a
 *  bordo de nuestro coche y que nos informe del consumo medio del coche. Diseña un
 *  algoritmo que lea el kilometraje de la última vez que se reportó, el kilometraje actual,
 *  los litros de gasolina que se repostaron la última vez y la cantidad de gasolina
 *  actual. El algoritmo devolverá la cantidad de litros cada 100 kilómetros que consume
 *  nuestro coche.
 */

import java.util.Scanner;

public class Ejercicio215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ultimoReporteKilometraje;
        double reporteKilometrajeActual;
        double ultimoReporteGasolina;
        double reporteGasolinaActual;

        System.out.println("PROGRAMA PARA CALCULAR CONSUMO MEDIO DEL COCHE");
        System.out.println("Digite el ultimo reporte de kilometraje (KM): ");
        ultimoReporteKilometraje = sc.nextDouble();
        do {
            System.out.println("Digite el kilometraje actual (KM)");
            reporteKilometrajeActual = sc.nextDouble();
        } while (reporteKilometrajeActual<ultimoReporteKilometraje);

        System.out.println("Digite el ultimo reporte de gasolina (Lt)");
        ultimoReporteGasolina = sc.nextDouble();
        do {
            System.out.println("Digite el reporte de gasolina actual (Lt)");
            reporteGasolinaActual= sc.nextDouble();
        } while (reporteGasolinaActual>ultimoReporteGasolina);


        double gasolinaConsumida = ultimoReporteGasolina - reporteGasolinaActual;
        double distanciaRecorrida = reporteKilometrajeActual - ultimoReporteKilometraje;

        double consumoMedioLpor100KM = (gasolinaConsumida/distanciaRecorrida)*100;

        System.out.printf("\n%s %.2f %s","El coche consume ",consumoMedioLpor100KM ," litros de gasolina por cada 100KM recorridos");

    }
}
