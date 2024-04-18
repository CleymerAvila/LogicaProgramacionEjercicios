import java.util.Scanner;

public class Ejercicio196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int VENDEDORES=18;
        int PRODUCTOS=10;

        double ingresos[][]= new double[VENDEDORES][PRODUCTOS];

        for (int i = 0; i < VENDEDORES; i++) {
            System.out.println("\nIngrese los ingresos por productos de el Vendedor "+(i+1));
            for (int j = 0; j < PRODUCTOS; j++) {
                System.out.println("Ingresos producto "+(j+1));
                ingresos[i][j] = sc.nextInt();
            }
        }

        // Menú para mostrar diferentes opciones
        int opcion;
        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Revisar el total de ingresos de cada vendedor");
            System.out.println("2. Ver el promedio por cada producto");
            System.out.println("3. Ver el promedio por vendedor");
            System.out.println("4. Obtener los ingresos totales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    totalPorVendedor(ingresos);
                    break;
                case 2:
                    promedioPorProducto(ingresos);
                    break;
                case 3:
                    promedioPorVendedor(ingresos);
                    break;
                case 4:
                    ingresosTotales(ingresos);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();


    }

    // Método para calcular y mostrar el total de ingresos de cada vendedor
    public static void totalPorVendedor(double[][] ingresos) {
        for (int i = 0; i < 18; i++) {
            double total = 0;
            for (int j = 0; j < 10; j++) {
                total += ingresos[i][j];
            }
            System.out.println("Total de ingresos del vendedor " + (i + 1) + ": " + total);
        }
    }

    // Método para calcular y mostrar el promedio por cada producto
    public static void promedioPorProducto(double[][] ingresos) {
        for (int j = 0; j < 10; j++) {
            double total = 0;
            for (int i = 0; i < 18; i++) {
                total += ingresos[i][j];
            }
            double promedio = total / 18;
            System.out.println("Promedio del producto " + (j + 1) + ": " + promedio);
        }
    }

    // Método para calcular y mostrar el promedio por vendedor
    public static void promedioPorVendedor(double[][] ingresos) {
        for (int i = 0; i < 18; i++) {
            double total = 0;
            for (int j = 0; j < 10; j++) {
                total += ingresos[i][j];
            }
            double promedio = total / 10;
            System.out.println("Promedio del vendedor " + (i + 1) + ": " + promedio);
        }
    }

    // Método para calcular y mostrar los ingresos totales
    public static void ingresosTotales(double[][] ingresos) {
        double total = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                total += ingresos[i][j];
            }
        }
        System.out.println("Ingresos totales: " + total);
    }
    

}
