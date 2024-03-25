import java.util.Scanner;

public class Ejercicio123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capitalInicial, capitFinal, tasaInteresdiario;
        int  cantDias;

        System.out.println("Ingrese los siguientes datos para calcular el interes diario:");
        System.out.print("\nIngrese el Capital: ");
        capitalInicial = sc.nextDouble();

        System.out.print("Ingrese la tasa de interes %: ");
        tasaInteresdiario = sc.nextDouble();

        System.out.print("Ingrese el tiempo en dias: ");
        cantDias = sc.nextInt();
        sc.close();
        
        tasaInteresdiario = tasaInteresdiario / 100;

        capitFinal = capitalInicial + (capitalInicial * tasaInteresdiario* cantDias);

        System.out.println("\nEl capital final de una tasa de interes simple diario de "+String.format("%.1f", tasaInteresdiario*100) + "% durante\n"+ cantDias + " dias y con capital inicial de "+ capitalInicial+ " es equivalente a "+ String.format("%.2f", capitFinal));

    }
}
