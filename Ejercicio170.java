import java.util.Scanner;

public class Ejercicio170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador1;
        int numerador2;
        int denominador1;
        int denominador2;
        String resultado="";
        int op;


        do {
            System.out.println("SUMA O RESTA DE FRACCIONES HOMOGENEAS");
            System.out.print("Ingrese el numerador 1: "); numerador1 = sc.nextInt();
            System.out.print("Ingrese el denominador 1: "); denominador1 = sc.nextInt();
            System.out.print("Ingrese el numerador 2: "); numerador2 = sc.nextInt();
            System.out.print("Ingrese el denominador 2: "); denominador2 = sc.nextInt();
            
            if (denominador1!= denominador2) {
                System.out.println("Los denominadores deben ser diferentes, ingrese de nuevo!");
            }
        } while (denominador1!=denominador2);

        do {
            System.out.println("Elige la operacion: Suma (1) o Resta (2)");
            op = sc.nextInt();
    
            switch (op) {
                case 1:
                    resultado = ""+(numerador1 + numerador2) + " / "+ denominador1; 
                    break;
                case 2:
                    resultado = ""+(numerador1 - numerador2) + " / " + denominador1;
                    break;
                default:
                    System.out.println("Opcion Invalida ingrese de nuevo!");
                    break;
            }
        } while (op != 1 && op != 2);

        sc.close();

        System.out.println("\nResultado: "+resultado);

    }
}
