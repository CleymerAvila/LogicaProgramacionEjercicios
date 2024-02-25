import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanciaKm, distanciaMetros;

        System.out.println("Ingrese la cantidad de distancia en Kilometros");
        distanciaKm = sc.nextDouble();
        sc.close();

        distanciaMetros = distanciaKm * 1000;

        System.out.println("La cantidad ingresada en "+ distanciaKm + "(Km) es igual " + distanciaMetros +" Mts");
    }
}
