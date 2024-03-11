import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, area;

        System.out.println("Para calcular el area del circulo debe ingresar el radio");
        System.out.print("\nRadio cm: ");
        radio = sc.nextDouble();
        sc.close();

        area = Math.PI * radio * radio;

        if (area > 5000) {
            System.out.println("DATOS ERRONEOS!!");
        } else {
            System.out.println("El area del circulo con un radio de "+radio+ " centimetro es de "+String.format("%.2f", area)+ " centimetros cuadrados");
        }   
    }
}
