import javax.swing.JOptionPane;

public class Ejercicio120 {
    public static void main(String[] args) {
        boolean stop = false;
        String opcion;
        char opc;
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hola Usuario!");
            }

            do {
                opcion = JOptionPane.showInputDialog(null , "desea que siga imprimiendo el texto [S/N]? ");
                opc = opcion.toUpperCase().charAt(0);
            } while (opcion.length()!=1);
            
            
            if (opc == 'S') {
                stop=false;
            } else if (opc == 'N') {
                stop=true;
            } else {
                JOptionPane.showMessageDialog(null,"Opcion Incorrecta!");
            }
        } while (stop!= true);
    }

    
}
