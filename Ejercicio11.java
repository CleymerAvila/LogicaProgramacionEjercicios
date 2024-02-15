import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int area, largo, ancho;

        System.out.println("Ingrese el ancho y el largo para calcular el area del rectangulo");
        System.out.print("\nAncho (cm): ");
        ancho = leer.nextInt();
        System.out.print("Largo (cm): ");
        largo = leer.nextInt();
        leer.close();
        area = largo * ancho;

        System.out.println("El area del rectangulo es de " + area + " cm cuadrados");

    }
}
