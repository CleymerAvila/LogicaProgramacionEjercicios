import java.util.Scanner;

/**
 * 183. Crear un programa que permita almacenar el nombre completo de una persona
 en un Arreglo y que muestre en pantalla el total de vocales y cuantas veces se
 repite cada vocal.
 */
public class Ejercicio183 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        System.out.print("Ingreso nombre completo: ");
        String nombre = leer.nextLine(); leer.close();

        char vectorNombre[] = nombre.toUpperCase().toCharArray();

        int vocales=0;
        int vocalA=0;
        int vocalE=0;
        int vocalI=0;
        int vocalO=0;
        int vocalU=0;
        for (int i = 0; i < vectorNombre.length; i++) {
            if (vectorNombre[i]=='A' 
                || vectorNombre[i]=='E'
                || vectorNombre[i]=='I'
                || vectorNombre[i]=='O'
                || vectorNombre[i]=='U') {

                vocales++;
                
            }

            if(vectorNombre[i]=='A'){
                vocalA++;
            } else if (vectorNombre[i]=='E') {
                vocalE++;
            } else if (vectorNombre[i]=='I') {
                vocalI++;
            } else if (vectorNombre[i]=='O') {
                vocalI++;
            } else if (vectorNombre[i]=='U') {
                vocalU++;
            }
        }

        System.out.println("\nEn el nombre "+nombre+ " hay un total de "+vocales+ " vocales");
        System.out.println("Veces A: "+vocalA);
        System.out.println("Veces E: "+vocalE);
        System.out.println("Veces I: "+vocalI);
        System.out.println("Veces O: "+vocalO);
        System.out.println("Veces U: "+vocalU);

        
    }
}
