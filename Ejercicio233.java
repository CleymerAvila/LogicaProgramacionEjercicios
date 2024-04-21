import java.util.Scanner;

public class Ejercicio233
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String numerosPositivos = "";
        System.out.println("Ingresa la cantidad de numeros negativos");
        int n = Math.abs(sc.nextInt());
        for (int i = 0; i < n; i++) {
            System.out.print("Numero "+(i+1)+": ");
            int numNegativo = sc.nextInt();

            while (numNegativo >= 0){
                System.out.println("Los numeros deben ser negativos!");
                System.out.print("Numero "+(i+1)+": ");
                numNegativo = sc.nextInt();
            }
            numerosPositivos+= Math.abs(numNegativo)+",";

        }

        System.out.println("\nLos numeros transformados a positivos:\n"+numerosPositivos);
    }
}
