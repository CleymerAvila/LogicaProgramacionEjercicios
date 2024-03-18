import java.util.Scanner;
public class Ejercicio104 {
    public static void main(String []args){
        Scanner leer = new Scanner(System.in);
        double numero, indiceRaiz, resultado;

        System.out.println("Ingresa el numero al que desea calcular la raiz y el indice de la misma");
        System.out.print("Número: ");
        numero = leer.nextDouble();
        System.out.print("Indice de la raiz: ");
        indiceRaiz = leer.nextDouble();
        leer.close();

        resultado = Math.pow(numero, 1.0 / indiceRaiz);

        System.out.println("\nLa raiz "+ indiceRaiz + " de "+ numero + " es "+ resultado);
    }
}
