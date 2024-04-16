import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio191 {
    public static void main(String[] args) {
        try {
            // Ruta del archivo
            String rutaArchivo = "C:/Users/CLEYMER/OneDrive/Documentos/Links de repositorios de Ejercicios.txt";
        
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
        
        
    }
}
