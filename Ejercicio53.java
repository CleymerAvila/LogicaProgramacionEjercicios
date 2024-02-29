import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int areaCuadrado,longitudLado;

        System.out.println("Ingrese la longitud del lado del cuadrado");
        longitudLado = sc.nextInt();
        sc.close();

        areaCuadrado = longitudLado * longitudLado;

        System.out.println("La medida del area del cuadrado es igual "+ areaCuadrado + " metros cuadrados");

    }
}
