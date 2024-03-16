import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIng; 

        System.out.println("Ingresa un numero para calcular si es primo (1) o no (0)");
        numIng = sc.nextInt();
        sc.close();

        int numResult = devolverEntero(numIng);

        System.out.println("\n"+numResult);
    }

    public static int devolverEntero(int num){
        int numResult=0;
        boolean esPrimo = true;
        if(num >1){
            for (int z = 2; z <= Math.sqrt(num); z++){
                if(num % z == 0){
                    esPrimo=false;
                    break;
                }
            }
            if (esPrimo){
                numResult = 1;
            }
        }
        return numResult;
    }
}
