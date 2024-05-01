import java.util.Scanner;

public class Ejercicio251
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numLeido;
        int leidos=0;
        do {
            System.out.println("Ingresa un numero entero");
            numLeido = sc.nextInt();
            leidos++;
        } while (numLeido>=5);

        System.out.println("Valor leido: "+numLeido);
        System.out.println("Veces numeros leidos hasta valor correcto: "+leidos);
    }
}
