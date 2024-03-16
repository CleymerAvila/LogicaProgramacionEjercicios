import java.util.Scanner;
public class Ejercicio90 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int primosMatriz=0, primosArreglo=0;

        System.out.println("Ingrese el tamaño de la matriz y del vector");
        System.out.print("Matriz Filas: ");
        int filas = sc.nextInt();
        System.out.print("Matriz Columnas: ");
        int columnas = sc.nextInt();
        System.out.print("Tamaño del arreglo: ");
        int n = sc.nextInt();

        int matriz [][] = new int[filas][columnas];
        int arreglo [] = new int[n];

        //Rellenar la matriz
        for (int f = 0; f < filas; f++){
            for (int c = 0; c < columnas; c++){
                System.out.println("Ingresa un numero para la matriz en la posicion ("+(f+1)+" "+(c+1)+")");
                matriz[f][c] = sc.nextInt();
            }
        }

        //Verificar si los numeros de la matriz son primos
        boolean esPrimo;
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas; j++) {
                esPrimo = true;
                if(matriz[i][j] >1){
                    for (int z = 2; z <= Math.sqrt(matriz[i][j]); z++){
                        if(matriz[i][j] % z == 0){
                            esPrimo=false;
                            break;
                        }
                    }
                    if (esPrimo){
                        primosMatriz++;
                    }
                }
            }
        }

        //Rellenar el arreglo
        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrese un numero para el arreglo en la posicion "+(i+1));
            arreglo[i]= sc.nextInt();
        }

        //Verificar si los numeros del arreglo son primos
        for (int i = 0; i < n; i++) {
            esPrimo = true;
            if(arreglo[i] >1){
                for (int z = 2; z <= Math.sqrt(arreglo[i]); z++){
                    if(arreglo[i] % z == 0){
                        esPrimo=false;
                        break;
                    }
                }
                if (esPrimo){
                    primosArreglo++;
                }
            }
        }

        System.out.println("\nEL numero de primos en la matriz es de "+ primosMatriz);
        System.out.println("El numero de primos en el arreglo es de "+ primosArreglo);
        System.out.println("Entre ambos hay un total de "+ (primosArreglo+primosMatriz) + " numeros primos");
    }
}
