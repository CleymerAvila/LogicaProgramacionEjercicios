import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        String mesPalabra;

        try {
            System.out.println("Por Favor ingrese la fecha en formato AAAA MM DD ");
            String fechFormato= sc.nextLine();
    
            String fechFormato_con_guion = fechFormato.replace(" ", "-");
            LocalDate fecha = LocalDate.parse(fechFormato_con_guion);
    
            mes = fecha.getMonthValue();
            mesPalabra = mesEnLetra(mes);

    
            System.out.println("\nLa fecha ingresada se trata de "+fecha.getDayOfMonth() + " de "+mesPalabra + " de "+fecha.getYear());            
        } catch (Exception e) {
            System.out.println("\nError: El formato de fecha ingresado no es válido. Por favor, ingrese la fecha en el formato AAAA MM DD."); 
        }sc.close();
    }

    public static String mesEnLetra(int mes){
        String mesLetra="";

        switch (mes) {
            case 1:
                mesLetra = "Enero";
                break;
            case 2:
                mesLetra = "Febrero";
                break;
            case 3:
                mesLetra = "Marzo";
                break;
            case 4: 
                mesLetra = "Abril";
                break;
            case 5:
                mesLetra = "Mayo";
                break;
            case 6:
                mesLetra = "Junio";
                break;
            case 7:
                mesLetra = "Julio";
                break;
            case 8: 
                mesLetra = "Agosto";
                break; 
            case 9:
                mesLetra = "Mayo";
                break;
            case 10:
                mesLetra = "Junio";
                break;
            case 11:
                mesLetra = "Julio";
                break;
            case 12: 
                mesLetra = "Agosto";
                break; 
        }
        return mesLetra;
    }
}
