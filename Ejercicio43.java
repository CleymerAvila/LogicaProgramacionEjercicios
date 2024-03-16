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

        int numeroMenor = calcularNumeroMenor(numero1, numero2);

        if (numero1 != numero2) {
            System.out.println("El numero menor entre el entero "+ numero1 + " y el entero "+ numero2 + " es "+numeroMenor);
        } else {
            System.out.println("Los numeros son iguales");
        }
        
    }

    public static int calcularNumeroMenor(int n1, int n2){
        int numeroMenor;

        if (n1<n2) {
            numeroMenor = n1;
        } else if (n2<n1) {
            numeroMenor = n2;
        } else {
            numeroMenor=0;
        }
        return numeroMenor;
    }
}
