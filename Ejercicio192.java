import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio192 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un texto de máximo 255 caracteres:");
        String texto = sc.nextLine();
        
        // Limitar el texto a 255 caracteres
        if (texto.length() > 255) {
            texto = texto.substring(0, 255);
            System.out.println("Texto limitado a 255 caracteres.");
        }
        
        escribirArchivo(texto);

        String rutaArchivo = "C:/Users/CLEYMER/OneDrive/Documentos/Links de repositorios de Ejercicios.txt";
        


        try {
            // Crear un objeto FileReader para leer el archivo
            FileReader lectorArchivo = new FileReader(rutaArchivo);

            // Crear un objeto BufferedReader para leer el archivo de forma eficiente
            BufferedReader lectorLinea = new BufferedReader(lectorArchivo);

            // Leer cada línea del archivo
            String linea;
            while ((linea = lectorLinea.readLine()) != null) {
                // Procesar la línea leída
                System.out.println(linea);
            }

            // Cerrar el archivo
            lectorLinea.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        sc.close();
    }
    
    public static void escribirArchivo(String texto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/CLEYMER/OneDrive/Documentos/Links de repositorios de Ejercicios.txt"))) {
            bw.write(texto);
            System.out.println("Texto guardado correctamente en 'Links de repositorios de Ejercicios.txt'.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}

