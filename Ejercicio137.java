import java.util.Scanner;

public class Ejercicio137 {
        public static void main(String[] args){
        // Declaración de variables
        double a = 0, b = 0, c = 0, discriminante, x1, x2;
        
        // Crear un objeto Scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        boolean entradaValida = false;
        
        while (!entradaValida) {
            try {
                // Pedir al usuario los coeficientes de la ecuación cuadrática
                System.out.println("Ingrese el coeficiente a:");
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese el coeficiente b:");
                b = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese el coeficiente c:");
                c = Double.parseDouble(sc.nextLine());
                
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("El valor debe ser numérico. Por favor, ingrese un valor válido.");
            }
        }
        
        // Calcular el discriminante
        discriminante = (b * b) - (4 * a * c);
        
        // Comprobar el valor del discriminante para determinar las soluciones
        if (discriminante > 0) {
            // Dos soluciones reales distintas
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones de la ecuación cuadrática son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real (raíz doble)
            x1 = -b / (2 * a);
            System.out.println("La solución de la ecuación cuadrática es:");
            System.out.println("x1 = " + x1);
        } else {
            // No hay soluciones reales
            System.out.println("La ecuación cuadrática no tiene soluciones reales.");
        }
        
        // Cerrar el objeto Scanner
        sc.close();
    }
}
