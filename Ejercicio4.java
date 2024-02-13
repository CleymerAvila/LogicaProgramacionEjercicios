import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double radio;
        double area=0;
        System.out.println("Para calcular el Area del circulo");
        System.out.print("Ingresa el radio (Metros): ");
        radio = leer.nextDouble();
        area = calcularArea(radio);
        System.out.println("El area del circulo es: " + area + "(m)²");
        leer.close();



    }

    public static double calcularArea(double radio){

        double area = Math.PI*Math.pow(radio, 2);

        return area;


    }
}
