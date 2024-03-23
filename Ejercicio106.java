import java.util.Scanner;
public class Ejercicio106 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor, maxComunDiv=0;

        do {
            System.out.println("Ingresa por favor dos numero para calcular el MCD de ambos numeros");
            System.out.print("- Numero Mayor: ");
            dividendo = sc.nextInt();
            System.out.print("- Numero Menor: ");
            divisor = sc.nextInt();
        } while (dividendo <= divisor);
        sc.close();

        maxComunDiv = calcularMaxComunDiv(dividendo, divisor);
        System.out.println("\nEl maximo comun divisor de ("+ dividendo + ", " + divisor + ") es " +maxComunDiv);

    }

    public static int calcularMaxComunDiv(int divdendo, int  divsor){
        int residuo=0;
        int mcd=0;
        residuo = divdendo % divsor; 
        if (residuo == 0) {
            mcd = divsor;
        } else {
            do {
                divdendo = divsor;
                divsor = residuo;
                residuo = divdendo % divsor;
                if (residuo==0) {
                    mcd = divsor;
                }  
            } while (residuo!= 0);
        }
        return mcd;
    }
}
