import java.util.Scanner;

public class Ejercicio162 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num; 
        do {
            System.out.println("Ingresa un numero para calcular la tabla de multiplicar (1-10)");
            System.out.print("Numero: "); num = leer.nextInt();
        } while (num <= 0 || num>10); leer.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " +i+ " = "+(num*i));
        }
    }
}
