import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio150 {
    public static void main(String[] args) {
        //Creamos el objeto escanner para los datos entrada
        Scanner entrada = new Scanner(System.in);
        int num;

        //Pedir al usuario un numero y guardarlo en la variable num
        System.out.println("Ingrese un numero para hallar su descomposicion en factores primos");
        num = entrada.nextInt();
        entrada.close();

        //Creamos nuestra list y almacenamos lo obtenido con el metodo 
        // Pasandole el numero para que calcule la descomposicion
        List<Integer> factoresPrimos = calcularDescomposicion(num);

        // Si la NO lista esta vacia mostramos la descomposicion
        if (factoresPrimos != null) {
            System.out.println("La descomposicion de factores primos de "+ num +" es: ");
            System.out.print(num + " = ");
            for (Integer factor : factoresPrimos) {
                System.out.print(factor + "*");
            }
        } else { // De lo contrario es decir, si la lista esta vacia 
                 // Le indicamos al usuario que el numero no es valido
            System.out.println("El num ingresado no es valido ");
        }
    }

    //Creamos un metodo q nos devuelva una lista de tipo entero con la descomposicion 
    public static List<Integer> calcularDescomposicion(int num){
        //si el numero es menor o igual q nos devuelva la lista vacia
        if (num<=1) {
            return null;
        }

        //creamos la lista de factores primos
        List<Integer> factores = new ArrayList<>();
        //Iniciamos la variable divisor 2
        int divisor=2;


        //Bucle para iterar hasta la raiz de numero
        while (num >= divisor * divisor) {
            //Mientras numero sea divisible por el divisor, añadimos el divisor a la lista
            while (num % divisor == 0) {
                factores.add(divisor);
                //reducimos mas el numero
                num /= divisor;
            }
            //Incrementamos divisor
            divisor++;
        }

        // Si el numero es todavia mayor que 1 
        //lo añadimos a la lista
        if (num > 1) {
            factores.add(num);
        }
        //Devolvemos la lista
        return factores;
    }
}
