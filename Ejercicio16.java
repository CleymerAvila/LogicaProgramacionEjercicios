import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaExamen;

        do {
            System.out.println("Ingresa la nota del examen matematico (1-10)");
            notaExamen = sc.nextInt();
        } while (notaExamen < 0 || notaExamen > 10);
        sc.close();

        if (notaExamen <= 5) {
            System.out.println("El examen matematico ha sido reprobado");
        }
        else{
            System.out.println("El Examen matematico ha sido aprobado");
        }
    }
}
