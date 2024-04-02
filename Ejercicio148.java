import java.util.Scanner;

public class Ejercicio148 {
    private static Scanner entradaDatos = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        limpiarPantalla();
        menu();
        System.out.print("\nIngrese la opcion: "); opcion = entradaDatos.nextInt();
        entradaDatos.nextLine();
        switch (opcion) {
            case 1:
                limpiarPantalla();
                System.out.println("1. Tabla de frecuencia para datos no agrupados");
                
                tablaFrecuenciaNoAgrupados();
            break;
            case 2: 
                System.out.println("2. Tabla de frecuencias para datos agrupados");     
                break;
            case 3:
                System.out.println("3. Medidas de tendencia central");
                break;
            case 4:
                System.out.println("4. Medidas de colocacion o posicion relativa");
                break;
            case 5:
                System.out.println("5. Medidas de Dispersion");
                break;
            case 6:
                System.out.println("6. Medidas de forma");
                break;
            case 7: 
                System.out.println("7. ");
            
                break;
            case 8:
                System.out.println("8. ");
                break;    
            default:
                break;
        }

    }
    //Metodo para mostrar el menu
    public static void menu(){
        System.out.println("----------------------------------------------");
        System.out.println(" CALCULO DE ESTADISTICAS, DATOS AGRUPADOS");
        System.out.println("----------------------------------------------");
        System.out.println("- Tablas de Frecuencias");
        System.out.println("1. Tabla de frecuencia para datos no agrupados");
        System.out.println("2. Tabla de frecuencias para datos agrupados");
        System.out.println("- Analisis de datos");
        System.out.println("3. Medidas de tendencia central");
        System.out.println("4. Medidas de colocacion o posicion relativa");
        System.out.println("5. Medidas de Dispersion");
        System.out.println("6. Medidas de forma");
        System.out.println("- Probabilidad");
        System.out.println("7. ");
        System.out.println("8. ");
    }
    //Metodo para tablas de frecuencias para datos no agrupados
    public static void tablaFrecuenciaNoAgrupados(){
        String variableEstudio="";
        int op=0;
        int tamanioMuestra;

        System.out.println("Ingrese la variable de estudio: ");
        variableEstudio = entradaDatos.nextLine();
        System.out.println("Ingrese el tamaño de la muestra: ");
        tamanioMuestra = entradaDatos.nextInt();
        System.out.println("Seleccione el tipo de variable: ");
        System.out.println("1. Cualitativas");
        System.out.println("2. Cuantitativa ");

        System.out.print("\nOpcion: "); op = entradaDatos.nextInt();

        switch (op) {
            case 1:
                limpiarPantalla();
                System.out.println("Ingrese la cantidad de tipos de variable");
                int n = entradaDatos.nextInt();
                String[] variables = new String[n];
                String[] datos = new String[tamanioMuestra];
                int[] frecuenciasAbsolutas = new int[n];

                for (int i = 0; i < variables.length; i++) {
                    System.out.println("Ingresa la variable "+(i+1)+": ");
                    variables[i] = entradaDatos.next();
                }
                limpiarPantalla();
                System.out.println("Ingresa los datos: ");
                for (int i = 0; i < tamanioMuestra; i++) {
                    System.out.println("Ingrese datos "+(i+1));
                    datos[i] = entradaDatos.next();
                }

                limpiarPantalla();

                int contador=0;
                for (int i = 0; i < datos.length; i++) {
                    
                    for (int j = 0; j < variables.length; j++) {
                        if (datos[i].equals(variables[j])) {
                            frecuenciasAbsolutas[j]+=i;
                        } 
                    }
                }

                System.out.println("Variable de Estudio: "+variableEstudio);
                System.out.println("Tamaño de la muestra: "+ tamanioMuestra);
                System.out.println("Variables            | Frecuencias Absolutas");
                for (int i = 0; i < variables.length; i++) {
                    System.out.println(variables[i] +"                | "+frecuenciasAbsolutas[i]);
                    
                }
                break;
        
            default:
                break;
        }
        

    }

    public static void limpiarPantalla(){
        try{
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pausa(){
        entradaDatos.nextLine();
        System.out.println("\t\nPrecione enter para continuar intentado...");
        entradaDatos.nextLine();
    }
}

