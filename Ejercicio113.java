import java.util.Scanner;

public class Ejercicio113 {
        private static Scanner sc = new Scanner(System.in);
        private static final double DISTANCIA_KM_A_MONTERRRY=500;
        private static final double MOTOCICLETA_KM_POR_LITRO=20;
        private static final double AUTOMOVIL_KM_POR_lITRO=10;
        private static final double PICK_UP_KM_LITRO=5;
        private static double gastoGasolina;
    public static void main(String []args){
        int opc;

        do {
            limpiarPantalla();
            mostrarMenu();
            System.out.print("\nopcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    gastoGasolina = DISTANCIA_KM_A_MONTERRRY / MOTOCICLETA_KM_POR_LITRO;
                    System.out.println("\nEl gasto total de gasolina para viajar a Monterrey en Motocicleta es de: \n"+gastoGasolina+ " litros de gasolina");
                    break;
                case 2:
                    gastoGasolina = DISTANCIA_KM_A_MONTERRRY / AUTOMOVIL_KM_POR_lITRO;
                    System.out.println("\nEl gasto total de gasolina para viajar a Monterrey en Automovil es de: \n"+gastoGasolina+ " litros de gasolina");
                    break;
                case 3:
                    gastoGasolina = DISTANCIA_KM_A_MONTERRRY / PICK_UP_KM_LITRO;
                    System.out.println("\nEl gasto total de gasolina para viajar a Monterrey en Pickup es de: \n"+gastoGasolina+ " litros de gasolina");
                    break;
                default:
                    System.out.println("\nLa opcion seleccionada no existe");
                    pausa();
            }
        } while ((opc <= 0 ) || (opc != 1 && opc != 2 && opc != 3 )); sc.close();

    }

    public static void mostrarMenu(){
        System.out.println("Seleccione un transporte para verificar"+
        "el costo estimado de gasolina \npara viajar a Monterrey para dicho vehiculo:");
        System.out.println("\n1) Motocicleta");
        System.out.println("2) Automovil");
        System.out.println("3) Pickup");

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
        System.out.println("\t\nPrecione enter para continuar intentado...");
        sc.nextLine();
    }
}
