import java.util.Scanner;

public class Ejercicio226
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la altura: ");
        int altura = Math.abs(sc.nextInt());

        int numCaracter = altura;
        int numLineas = altura;
        int contador=altura;
        do {
            numLineas--;
            System.out.println();
            numCaracter=contador;
            do {
                System.out.print("*");
                numCaracter--;
            } while (numCaracter>0);
            contador--;
        } while (numLineas>0);
    }
}
