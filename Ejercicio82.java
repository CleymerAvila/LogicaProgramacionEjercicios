import java.util.Scanner;
public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        boolean positivo=false, neutro=false, negativo=false;

        System.out.println("Ingresa un numero");
        num = sc.nextDouble();
        sc.close();

        if (num > 0) {
            positivo = true;
        } else if (num < 0){
            negativo = true;
        } else{
            neutro = true;
        }

        if (positivo == true) {
            System.out.println("El numero ingresado "+ num+ " es un numero positivo");
        } else if(negativo == true){
            System.out.println("El numero ingresado "+ num+ " es un numero negativo");
        } else if(neutro == true){
            System.out.println("El numero ingresado es neutro");
        }
    }
}
