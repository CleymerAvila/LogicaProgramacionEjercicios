
import java.util.Scanner;

public class Ejercicio130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mont_totalxMes, capitalPrestamo, plazoMeses, totalPagar, interesMensual;
    
        do {
            System.out.print("\nIngrese el Capital del Prestamo: ");
            capitalPrestamo = sc.nextDouble();
    
            System.out.print("Ingrese el plazo en meses (12 ó 24): ");
            plazoMeses = sc.nextDouble();
        } while ((plazoMeses <= 0 || capitalPrestamo <= 0) || (plazoMeses != 12 && plazoMeses != 24));sc.close();

        mont_totalxMes = capitalPrestamo / plazoMeses;
        interesMensual = mont_totalxMes * 0.02;
        double mont_totalAPagarxMes = (mont_totalxMes + interesMensual);
        totalPagar = mont_totalAPagarxMes * plazoMeses;

        System.out.println("\nTotal a pagar: "+totalPagar);
        System.out.println("Total a pagar por mes interes 2%: "+mont_totalxMes);
        System.out.println("Plazo de meses: "+ plazoMeses);
    }
}
