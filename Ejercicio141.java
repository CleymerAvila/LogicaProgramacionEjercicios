import java.util.Scanner;

public class Ejercicio141 {
    public static int c;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double numero;
        double raizcuadrada;

        System.out.println("Ingresa un numero");
        numero = sc.nextDouble();

        raizcuadrada = calcularRaiz(numero); sc.close();

       
        System.out.println("La raiz cuadrada de "+ numero + " es " + raizcuadrada);
    }

    public static double calcularRaiz(double numero){
        
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raiz cuadrada de un número negativo");
        }

        if (numero == 0 || numero == 1) {
            return numero;
        }

        double raiz = 0.0;
        double b = numero;
        double mitad;
        double epsilon = 1e-15; 

        while (raiz <= numero) {
            mitad = (raiz + b) / 2.0;

            if (Math.abs((numero / mitad) - mitad) < epsilon) {
                return mitad; 
            } else if (mitad < (numero / mitad)) {
                raiz = mitad;
            } else {
                b = mitad;
            }
        }
        return raiz;
    }
    
}
