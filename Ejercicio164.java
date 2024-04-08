import java.util.Scanner;

/**
 *  164. Programa para la taquilla de un Cine, para que de acuerdo al tipo de boleto
    vendido ( Adulto=$60 , Niño=$30, Promociones=$20 ) indique:
    ○ Cuántos boletos se vendieron.
    ○ Venta bruta.
    ○ Venta por cada tipo de boleto. El programa pedirá datos al menos en 10
    ocasiones antes de mostrar el resumen .
 */

public class Ejercicio164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantBolAdultos=0, cantBolNinios=0, cantBolProm=0, adultosTotal=0, niniosTotal=0, promTotal=0;

        int numVeces=1;
        boolean programaFinalizado=false;
        do { 
            
            System.out.println("Seleccione el tipo de boleta. Boleta "+numVeces);
            System.out.println("1. Adultos");
            System.out.println("2. Niño");
            System.out.println("3. Promociones");
            System.out.println("Opcion: ");
            int op = sc.nextInt();
            while (op<1 || op >3) {
                System.out.println("Ingrese un valor correcto!");
                System.out.println("Opcion: ");
                op = sc.nextInt();
            }

            if (op > 0 && op <=3) {
                numVeces++; 
            }


            switch (op) {
                case 1:
                    cantBolAdultos++;
                    adultosTotal+=60;
                    break;
                case 2:
                    cantBolNinios++;
                    niniosTotal+=30;
                    break;
                case 3:
                    cantBolProm++;
                    promTotal+=20;
                    break;
            }
            
            if (numVeces>10) {
                System.out.println("Desea ingresar mas numeros? si (true) no (false)");
                boolean masIngreso = Boolean.parseBoolean(sc.next());

                if (masIngreso==false) {
                    programaFinalizado=true;
                }

            }
            
        } while (numVeces<=10 || programaFinalizado==false);
        sc.close();

        
        int cantBoletosTotal = cantBolAdultos + cantBolNinios + cantBolProm;
        int ventaBruta = adultosTotal + niniosTotal + promTotal;
        
        System.out.println("---------------------------------");
        System.out.println("\nCantidad de boletos vendidos: "+cantBoletosTotal);
        System.out.println("Venta Bruta de Boletas: "+ventaBruta);
        System.out.println("---------------------------------");
        System.out.println("\nBoletas Adultos: ");
        System.out.println("-Cant.: "+cantBolAdultos+ " -Venta: "+adultosTotal);
        System.out.println("---------------------------------");
        System.out.println("\nBoletas Niños:");
        System.out.println("-Cant.:"+ cantBolNinios+ " -Venta: "+niniosTotal);
        System.out.println("---------------------------------");
        System.out.println("\nBoletas Promocion: ");
        System.out.println("Cant.: "+cantBolProm+ " -Venta: "+promTotal);
        System.out.println("---------------------------------");
    }
}
