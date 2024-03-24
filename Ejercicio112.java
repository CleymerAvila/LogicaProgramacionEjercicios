import java.util.Scanner;

public class Ejercicio112 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        char opc;
        String opcionEntrada;

        do {
            limpiarPantalla();
            menu_Opciones();
            opcionEntrada = sc.next();
            
            opc = opcionEntrada.charAt(0);     
            
            switch (opc) {
                case 'a':
                    System.out.println("Su destino es Cartagena, tiempo de traslado 2 hrs, costo $150");
                    break;
                case 'b':
                    System.out.println("Su destino es Barranquilla, tiempo de traslado 2 hrs, costo $320");
                    break;
                case 'c':
                    System.out.println("Su destino es Sincelejo, tiempo de traslado 2 hrs, costo $120");
                    break;
                case 'd':
                    System.out.println("Su destino es Valledupar, tiempo de traslado 2 hrs, costo $90");
                    break;
                case 'e':
                    System.out.println("Su destino es Santa Marta, tiempo de traslado 2 hrs, costo $110");
                    break;
                default:
                    System.out.println("Entrada inválida. La opcion seleccionada no existe o su entrada no es una sola letra.");
                    pausa();
            }
        } while ((opcionEntrada.length() != 1) || (opc != 'a' && opc != 'b' && opc != 'c'&& opc != 'd'&&opc != 'e'));sc.close();
    }

    public static void menu_Opciones(){
        System.out.println("\nLínea de autobuses ADO, seleccione su destino:\n");
        System.out.println("a) Cartagena. [$150]");
        System.out.println("b) Barranquilla. [$320]");
        System.out.println("c) Sincelejo. [$120]");
        System.out.println("d) Valledupar. [$90]");
        System.out.println("e) Santa Marta.[$110]");
        System.out.print("\nOpcion: "); 

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
        sc.nextLine();
        System.out.println("\t\nPrecione enter para continuar...");
        sc.nextLine();
    }
}