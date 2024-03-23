import java.util.Scanner;
public class Ejercicio111 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un numero del 1-7 para mostrar dia de la semana");
            System.out.print("Numero: "); numero = sc.nextInt(); 
        } while (numero < 1 || numero > 7); sc.close();

        switch (numero) {
            case 1:
                System.out.println("\nDomingo");
                break;
            case 2: 
                System.out.println("\nLunes");
                break;
            case 3: 
                System.out.println("\nMartes");
                break;
            case 4:
                System.out.println("\nMiercoles");
                break;
            case 5:
                System.out.println("\nJueves");
                break;
            case 6:
                System.out.println("\nViernes");
                break;
            case 7:
                System.out.println("\nSabado");
                break;
        }
    }
}
