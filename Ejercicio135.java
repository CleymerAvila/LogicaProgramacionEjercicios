import java.util.Scanner;
public class Ejercicio135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int entrada;
        int numMayor=0;
        int numMenor=0;

        System.out.println("ingresa la cantidad de numeros: ");
        n= sc.nextInt();
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Numero "+(i+1));
            entrada=sc.nextInt();
            if (i==0) {
                numMayor=entrada;
            }

            else {
                if (numMayor<entrada) {
                    numMayor=entrada;
                }
            }

            if (i==0) {
                numMenor=entrada;
            }

            else {
                if (numMenor>entrada) {
                    numMenor=entrada;
                }
            }
        } sc.close();

        System.out.println("\nNumero mayor: "+numMayor);
        System.out.println("Numero menor: "+numMenor);
    }
}
