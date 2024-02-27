import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Ingresa el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Ingresa el segundoo numero");
        numero2 = sc.nextInt();
        sc.close();

        int numeroMayor = calcularNumeroMayor(numero1, numero2);

        System.out.println("El numero mayor entre el entero "+ numero1 + " y el entero "+ numero2 + " es "+numeroMayor);
        
    }

    public static int calcularNumeroMayor(int n1, int n2){
        int numeroMayor;

        if (n1>n2) {
            numeroMayor = n1;
        } else if (n2>n1) {
            numeroMayor = n2;
        } else {
            numeroMayor=0;
        }
        return numeroMayor;
    }
}
