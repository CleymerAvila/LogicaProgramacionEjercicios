import java.util.Scanner;
public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distanciaMetros, distanciaKM;

        System.out.print("Ingrese la distancia en metros :");
        distanciaMetros = sc.nextFloat();

        distanciaKM = distanciaMetros / 1000;

        System.out.println("\nLa distancia ingresa de "+ distanciaMetros +
        " metros es igual a "+ distanciaKM + " kilometros");
    }
}
