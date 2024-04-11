import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> vocales = new ArrayList<>();
        String entrada;
        System.out.println("Ingrese 5 vocales desordanadas:");

        for (int i = 0; i < 5; i++) {
            char vocal=0;
            do {
                System.out.println("Ingresa la vocal "+(i+1));
                entrada = scanner.next().trim();

                if (entrada.length()!= 1) {
                    System.out.println("Error: Ingresó un caracter que no es vocal.");
                    continue;
                }

                vocal = entrada.charAt(0);

            } while (!esVocal(vocal));

            vocales.add(vocal);

        } scanner.close();

        Collections.sort(vocales);


        System.out.println("\nLas vocales ordenadas: ");
        for(char vocal: vocales){
            System.out.print(vocal+" ");
        }


        
    }

    public static boolean esVocal(char ch){
        ch = Character.toUpperCase(ch);
        boolean vocal = false;

        switch (ch) {
            case 'A':
                vocal = true;
                break;
        
            case 'E':
                vocal = true;
                break;
            case 'I':
                vocal = true;
                break;
            case 'O':
                vocal = true;
                break;

            case 'U':
                vocal = true;
                break;
        }

        return vocal;

    }


}
