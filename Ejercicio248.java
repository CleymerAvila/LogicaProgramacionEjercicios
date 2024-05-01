import java.util.Scanner;

public class Ejercicio248
{
    public static void main(String[] args)
    {
        int numNotas;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingresa el numero de notas a digitar");
            numNotas = sc.nextInt();
        } while (numNotas <= 0);

        int sumNotas=0;
        for (int i = 0; i < numNotas; i++) {
            System.out.println("Digite la nota "+(i+1));
            sumNotas+= sc.nextInt();
        }

        System.out.println("La suma total de las notas es: "+sumNotas);
        System.out.printf("%s %.2f","El promedio de las notas es: ",((float)sumNotas/numNotas));

    }
}
