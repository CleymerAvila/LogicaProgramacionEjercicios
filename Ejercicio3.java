import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        float base, altura, area=0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la base y la altura");
        System.out.print("Base: ");
        base = leer.nextFloat();
        System.out.print("Altura: ");
        altura = leer.nextFloat();
        area = calcularArea(base,altura);
        System.out.println("\nEL Area del triangulo es : " + area);
        leer.close();



    }

    public static float calcularArea(float base, float altura){

        float area = (base * altura)/2;

        return area;

    }
}
