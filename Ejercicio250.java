import java.util.Scanner;

public class Ejercicio250
{
    public static void main(String[] args)
    {
        int numNotas;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingresa el numero de notas a digitar");
            numNotas = sc.nextInt();
        } while (numNotas <= 0);


        int notaMayor;
        int nota;
        System.out.print("Digite la nota 1: ");
        notaMayor = sc.nextInt();
        for (int i = 1; i <numNotas; i++) {
            System.out.print("Digite la nota "+(i+1)+": ");
            nota = sc.nextInt();
            if (nota>notaMayor){
                notaMayor=nota;
            }
        }

        System.out.println("La nota mas alta es "+notaMayor);
    }
}
