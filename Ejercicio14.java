import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroingresado, sumadelosdigitos;

        System.out.println("Ingresa un numero de 4 digito");
        numeroingresado = leer.nextInt();
        leer.close();
    
        String numero = String.valueOf(numeroingresado);
        char[] digitos = numero.toCharArray();
        
        int digito1 = Character.getNumericValue(digitos[0]);
        int digito2 = Character.getNumericValue(digitos[1]);
        int digito3 = Character.getNumericValue(digitos[2]);
        int digito4 = Character.getNumericValue(digitos[3]);

        sumadelosdigitos = digito1 + digito2 + digito3 + digito4;
        

        System.out.println("La suma de los digitos del numero ingresado es: " + sumadelosdigitos);
        


    }
}
