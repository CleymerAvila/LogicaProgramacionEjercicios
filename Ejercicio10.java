import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Ingresa la base del triangulo (Metros): ");
        base = leer.nextInt();
        System.out.println("Ingresa la altura del triangulo (Metros): ");
        altura = leer.nextInt();
        leer.close();

        area = (base * altura)/2;

        System.out.println("El area del triangulo es " + area + " (Metros)");
    }
}
