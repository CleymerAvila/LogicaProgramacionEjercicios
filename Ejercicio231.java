import java.util.Scanner;

public class Ejercicio231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String impresionNumeros = "";
        int sum=0;
        System.out.println("Ingresa 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            System.out.print("numero "+(i+1)+": ");
            int num = sc.nextInt();
            if (num>0){
                impresionNumeros += ", " + num ;
                sum+=num;
            }
        }

        System.out.println("\nLa impresion de los numeros positivos son los siguientes\n"+impresionNumeros);
        System.out.println("La suma de los numero positivos es "+sum);
    }
}
