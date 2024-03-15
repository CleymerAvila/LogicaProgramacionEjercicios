import java.util.Scanner;
public class Ejercicio87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, base, altura;

        System.out.println("Ingreso de datos (cm) para calculo del area de un triangulo equilatero");
        System.out.print("Base: ");
        base = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        if (area > 1000){
            System.out.println(" \nDATOS NO VÁLIDOS!");
        } else {
            System.out.println("\nEl area del triangulo equilatero es igual a " + area+ " centimetros cuadrados");
        }


    }

}
