
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mesString, diaString, anioString;

        try {
            System.out.println("Ingresa la fecha (día,mes,año) para verificar la estacion del año (primavera, verano, otoño, invierno)");
            String fechaString = sc.next();
            diaString = fechaString.substring(0,2);

            mesString = fechaString.substring(3, 5);

            anioString = fechaString.substring(6, 10);
    
            String fechaString_con_guion = anioString + "-" + mesString+"-"+diaString;

            LocalDate fecha = LocalDate.parse(fechaString_con_guion);

            int mes = fecha.getMonthValue();
            String estacion = conseguirEstacion(mes);
            System.out.println(fecha.getMonthValue());;
    
            System.out.println("\nLa estacion para la fecha ingresada es de "+ estacion);
        } catch (Exception e) {
            System.out.println("La fecha ingresada es invalida");
        }

        sc.close();
        
    }

    public static String conseguirEstacion(int mes){
        String est="";
        switch (mes) {
            case 12:
            case 1:
            case 2:
                est = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                est =  "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                est = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                est = "Otoño";
                break;
        }
        return est;
    }
}
