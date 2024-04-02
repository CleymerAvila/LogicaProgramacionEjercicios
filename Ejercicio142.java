import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        int potencia;

        System.out.println("Ingresa un numero y una potencia para calcular");
        System.out.print("Numero: "); n = sc.nextInt();
        System.out.print("Potencia: "); x = sc.nextInt();

        potencia = calcularPotencia(n, x); sc.close();

        System.out.println("la potencia "+ x + " del numero "+ n + " es igual a "+potencia);



    }

    public static int calcularPotencia(int n, int x){
        int result=n;
        for(int i = 2; i <= x; i++){
            result*=n;
        }
        return result;
    }
}
