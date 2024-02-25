import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, base, altura, areaEnCentimetros, areaEnMetros;
        System.out.println("Ingresa la Base y la altura de un triangulo para calcular \nel area en milimetros, centimetros y metros cuadrados");
        System.out.print("Base (mm): ");
        base = sc.nextDouble();
        System.out.print("Altura (mm): ");
        altura = sc.nextDouble();
        sc.close();

        area = (base * altura)/2;
        areaEnCentimetros = area * 0.01;
        areaEnMetros = areaEnCentimetros * 0.0001 ;

        System.out.println("Area milimetros cuadrados: " + area + " mm²");
        System.out.println("Area centimetros cuadrados: "+ areaEnCentimetros + " cm²");
        System.out.println("Area en metros cuadrados: "+ areaEnMetros + " m²");


    }
}
