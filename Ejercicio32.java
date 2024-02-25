import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largo, ancho, area, areaEnCentimetros;
        long  areaEnMilimetros;

        System.out.println("Ingrese el largo y el ancho del rectangulo para calcular el area en \nmetros, centimetros y milimetros cuadrados");
        System.out.print("Largo (metros):");
        largo = sc.nextDouble();
        System.out.print("Ancho (metros): ");
        ancho = sc.nextDouble();
        sc.close();

        area = largo * ancho;
        areaEnCentimetros = area * 10000;
        areaEnMilimetros = (long)areaEnCentimetros * 100;

        System.out.println("El area del rectangulo metros cuadrados: "+ area +" m²");
        System.out.println("El area del rectangulo centimetros cuadrados: "+ areaEnCentimetros + " cm²");
        System.out.println("El area del rectangulo milimetros cuadrados: "+ areaEnMilimetros + " mm²");


    }
}
