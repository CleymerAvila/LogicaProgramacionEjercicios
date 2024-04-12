import java.time.LocalDate;
import java.util.Scanner;

/**
 * 175. Programa que dada la fecha actual en formato (AAAA-MM-DD), determine la
    fecha del día anterior.
 */

public class Ejercicio175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha en formato (AAAA-MM-DD)");
        String fechaString = sc.next();
        sc.close();

        LocalDate fecha = LocalDate.parse(fechaString);  
        
        LocalDate fechaDiaAnterior = fecha.minusDays(1);

        System.out.println("\nLa fecha del dia anterior es: "+fechaDiaAnterior);
    }
}
