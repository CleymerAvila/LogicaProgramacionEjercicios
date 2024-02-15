import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Ingresa tres numeros ");
        System.out.println("Numero 1: ");
        n1 = leer.nextInt();
        System.out.println("Numero 2: ");
        n2 = leer.nextInt();
        System.out.println("Numero 3:  ");
        n3 = leer.nextInt();
        leer.close(); 

        String numero1 = String.valueOf(n1);
        String numero2 = String.valueOf(n2);
        String numero3 = String.valueOf(n3);

        char[] digitos1 = numero1.toCharArray();
        char[] digitos2 = numero2.toCharArray();
        char[] digitos3 = numero3.toCharArray();

        System.out.println("\nlos ultimos digitos de los numeros ingresados son los siguientes\n");
        System.out.println(digitos1[digitos1.length-1]);
        System.out.println(digitos2[digitos2.length-1]);
        System.out.println(digitos3[digitos3.length-1]);
        


        

        


    }
}
