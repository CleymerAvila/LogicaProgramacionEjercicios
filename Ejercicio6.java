import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Float n1, n2, n3, media;
        System.out.println("Ingrese 3 numeros para calcular la media: ");
        System.out.print("Numero 1: ");
        n1 = leer.nextFloat();
        System.out.print("Numero 2: ");
        n2 = leer.nextFloat();
        System.out.print("Numero 3: ");
        n3 = leer.nextFloat();
        System.out.println();
        media = (n1 + n2 + n3)/3;
        System.out.println("la media aritmetica de: " + n1 + ", " + n2 + " y " + n3 + " es " + media);
        leer.close();

    


    }
}
