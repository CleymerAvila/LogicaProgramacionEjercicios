
import java.util.Scanner;

public class Ejercicio132 {
    private static int saldo=1000, cantidadDeposito=0, cantidadRetiro=0, op;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            mostrarMenu();
            System.out.println("Seleccione una opcion:");
            op = sc.nextInt();
            while (op <= 0 || op >3) {
                System.out.println("Opcion invalida, seleccione una opcion valida ");
                op = sc.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println();
                    System.out.println("------------ DEPOSITO ----------");
                    System.out.println("Ingrese la cantidad a depositar ");
                    cantidadDeposito = sc.nextInt();
                    while (cantidadDeposito < 0) {
                        System.out.println("Cantidad incorrecta, ingresa de nuevo");
                        cantidadDeposito = sc.nextInt(); 
                    }
                    saldo= saldo + cantidadDeposito;
                    System.out.println();
                    System.out.println("Su deposito se ha realizado con exito!!");
                    System.out.println("Ahora su saldo es de: $" + saldo);
                    System.out.println();
                    break;
            
                case 2:
                    System.out.println();
                    System.out.println("------------ RETIRO ------------");
                    System.out.println("Ingrese la cantidad de retiro");
                    cantidadRetiro = sc.nextInt();
                    if (cantidadRetiro > saldo) {
                        System.out.println();
                        System.out.println("No se puede realizar el retiro debido a que no cuenta ");
                        System.out.println("con saldo necesario para la cantidad requerida");
                        System.out.println();
                    } else {
                        saldo = saldo - cantidadRetiro;
                        System.out.println();
                        System.out.println("Su retiro se ha realizado con exito!!");
                        System.out.println("Su retiro ha sido de: $" + cantidadRetiro);
                        System.out.println("Su saldo ahora es de: $" + saldo);
                        System.out.println();
                    }
                    break;
            }
        } while (op!=3);

        System.out.println();
        System.out.println("El saldo final de su cuenta es de: $" + saldo );
        sc.close();
        
    }

    public static void mostrarMenu(){
        System.out.println("------ CAJERO AUTOMATICO-----");
        System.out.println("Saldo: $" + saldo);
        System.out.println("-----------------------------");
        System.out.println("Menu de Opciones: ");
        System.out.println("1. Deposito");
        System.out.println("2. Retiro");
        System.out.println("3. Salir");
        System.out.println("-------------------------------");
    }
}
