import java.util.Scanner;

public class Ejercicio140 {
    private static Scanner entrada = new Scanner(System.in);
    private static double num;
    public static void main(String[] args) {
        int opcion;
        double resultado=0;
        do {
            menu();
            System.out.print("\nOpcion: ");
            opcion = entrada.nextInt();
            
            if (opcion==1) {
                System.out.println("\nSalio del programa!!");
            } else if (opcion==2) {
                resultado = calculoOperacion(opcion);
                System.out.println("\nLa sumatoria sucesiva desde 1 hasta "+num+ " es "+ resultado);
            } else if (opcion==3) {
                resultado = calculoOperacion(opcion);
                System.out.println("\nEl factorial de "+num+ " es "+ resultado);
            } else {
                calculoOperacion(opcion);
            }
        } while (opcion!=1); entrada.close();

        
    }

    private  static void menu(){
        System.out.println("-----------------");
        System.out.println("Menu Opciones");
        System.out.println("-----------------");
        System.out.println("1. Salir");
        System.out.println("2. Sumatoria");
        System.out.println("3. Factorial");
        System.out.println("-----------------");
    }

    public static double calculoOperacion(int op){
        double resultado=0;
        switch (op) {
            case 2:
                double sumatoria=0; 

                do {
                    System.out.println("\nIngrese un numero: ");
                    System.out.print("- "); 
                    num = entrada.nextDouble();
                } while (num<=0);

                for (int i = 1; i <= num; i++) {
                    sumatoria+=i;
                }

                resultado=sumatoria;
                break;
            case 3:
                double factorial=1;

                do {
                    System.out.println("\nIngresa un numero: ");
                    System.out.println("- ");
                    num = entrada.nextDouble();
                } while (num<=0);

                for (int i = 2; i <= num; i++) {
                    factorial*=i;
                }

                resultado=factorial;
                break;
            default: 
                System.out.println("\nOpcion invalida, Ingrese de nuevo!!");
                break;
        }

        return resultado;
    }
}
