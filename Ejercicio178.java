/**
 *  178. Dada la duración en minutos de una llamada, calcular el costoTotal,
    considerando.
    ● Elcosto de los primeros 3 minutos es de $3.00.
    ● Después de tres minutos el costoTotal por cada minuto será del 50% adicional
    al costoTotal base de $3.
    ● Después de 7minutos, cada minuto adicional se cobrará al 100% del
    costoTotal base de $3 .
 */
import java.util.Scanner;

public class Ejercicio178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costoBase=3;
        double recargo50=costoBase*0.5;
        double recargo100=costoBase*2;

        double duracionMinutos=0;

        double costoTotal=0;

        do {
            System.out.println("Ingrese el cantidad de minutos de la llamada: ");
            duracionMinutos = sc.nextDouble();
        } while (duracionMinutos <=0 ); sc.close();

        if (duracionMinutos > 3) {
            costoTotal += costoBase * 3;
            duracionMinutos-=3;
        } else {
            costoTotal += duracionMinutos * costoBase;
            duracionMinutos=0;
        }

        if (duracionMinutos > 0) {
            int minutos50 = (int) Math.min(duracionMinutos, 4);
            costoTotal += minutos50 * recargo50;
            duracionMinutos -= minutos50;
        }

        if (duracionMinutos>0) {
            costoTotal+=duracionMinutos*recargo100;
        }
        System.out.printf("\nEl ccosto total de la llamada es: $%.2f",costoTotal);
    }
}
