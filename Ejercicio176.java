import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la fecha en formato (AAAA-MM-DD)");
        String fechaString = sc.next().trim(); sc.close();

        LocalDate fecha = LocalDate.parse(fechaString);

        LocalDate fechaDiaSiguiente = fecha.plusDays(1);

        System.out.println("\nLa fecha del dia siguiente es "+fechaDiaSiguiente);
    }
}
