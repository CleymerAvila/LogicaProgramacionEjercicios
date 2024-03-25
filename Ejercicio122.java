import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int sumaNumeros=0;
        int numero=0;

        do {
            System.out.println("Ingreso numeros: ");
            numero = sc.nextInt();
            sumaNumeros += numero;
        } while (numero != 0);
        

        System.out.println("\nLa suma de los numeros antes de cero es "+ sumaNumeros);
    }
}
