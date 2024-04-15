import java.util.Scanner;

public class Ejercicio182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String numeroRomano="";

        do {
            System.out.println("Ingresa un numero (1-1000)");
            num = sc.nextInt();
        } while (num<=0 || num > 1000); sc.close();

        if (num==1000) {
            numeroRomano="M";
        } else {
            
           
            if (num>= 1 && num<=9) {
                String numString = Integer.toString(num);
                int u;
                u = Character.getNumericValue(numString.charAt(0));
                switch (u) {
                    case 1:
                        numeroRomano+="I";
                        break;
                    case 2:
                        numeroRomano+="II";
                        break;
                    case 3:
                        numeroRomano+="III";
                        break;
                    case 4: 
                        numeroRomano+="IV";
                        break;
                    case 5: 
                        numeroRomano+="V";
                        break;
                    case 6: 
                        numeroRomano+="VI";
                        break;
                    case 7:
                        numeroRomano+="VII";
                        break;
                    case 8: 
                        numeroRomano+="VIII";
                        break;
                    case 9:
                        numeroRomano+="IX";
                        break;
                }
            } else if (num>9 && num<=99) {
                String numString = Integer.toString(num);
                int u;
                int d;
                d = Character.getNumericValue(numString.charAt(0));
                u = Character.getNumericValue(numString.charAt(1));
                

                switch (d) {
                    case 1:
                        numeroRomano+="X";
                        break;
                    case 2:
                        numeroRomano+="XX";
                        break;
                    case 3:
                        numeroRomano+="XXX";
                        break;
                    case 4: 
                        numeroRomano+="XL";
                        break;
                    case 5: 
                        numeroRomano+="L";
                        break;
                    case 6: 
                        numeroRomano+="LX";
                        break;
                    case 7:
                        numeroRomano+="LXX";
                        break;
                    case 8: 
                        numeroRomano+="LXXX";
                        break;
                    case 9:
                        numeroRomano+="XC";
                        break;
                }

                if (u>0) {
                    switch (u) {
                        case 1:
                            numeroRomano+="I";
                            break;
                        case 2:
                            numeroRomano+="II";
                            break;
                        case 3:
                            numeroRomano+="III";
                            break;
                        case 4: 
                            numeroRomano+="IV";
                            break;
                        case 5: 
                            numeroRomano+="V";
                            break;
                        case 6: 
                            numeroRomano+="VI";
                            break;
                        case 7:
                            numeroRomano+="VII";
                            break;
                        case 8: 
                            numeroRomano+="VIII";
                            break;
                        case 9:
                            numeroRomano+="IX";
                            break; 
                }

                }
            } else if (num>99 && num<=999) {
                String numString = Integer.toString(num);
                int u;
                int d;
                int c;
                c = Character.getNumericValue(numString.charAt(0));
                d = Character.getNumericValue(numString.charAt(1));
                u = Character.getNumericValue(numString.charAt(2));

                switch (c) {
                    case 1:
                        numeroRomano+="C";
                        break;
                    case 2:
                        numeroRomano+="CC";
                        break;
                    case 3:
                        numeroRomano+="CCC";
                        break;
                    case 4: 
                        numeroRomano+="CD";
                        break;
                    case 5: 
                        numeroRomano+="D";
                        break;
                    case 6: 
                        numeroRomano+="DC";
                        break;
                    case 7:
                        numeroRomano+="DCC";
                        break;
                    case 8: 
                        numeroRomano+="DCCC";
                        break;
                    case 9:
                        numeroRomano+="CM";
                        break;
                }

                switch (d) {
                    case 1:
                        numeroRomano+="X";
                        break;
                    case 2:
                        numeroRomano+="XX";
                        break;
                    case 3:
                        numeroRomano+="XXX";
                        break;
                    case 4: 
                        numeroRomano+="XL";
                        break;
                    case 5: 
                        numeroRomano+="L";
                        break;
                    case 6: 
                        numeroRomano+="LX";
                        break;
                    case 7:
                        numeroRomano+="LXX";
                        break;
                    case 8: 
                        numeroRomano+="LXXX";
                        break;
                    case 9:
                        numeroRomano+="XC";
                        break;
                }

                switch (u) {
                    case 1:
                        numeroRomano+="I";
                        break;
                    case 2:
                        numeroRomano+="II";
                        break;
                    case 3:
                        numeroRomano+="III";
                        break;
                    case 4: 
                        numeroRomano+="IV";
                        break;
                    case 5: 
                        numeroRomano+="V";
                        break;
                    case 6: 
                        numeroRomano+="VI";
                        break;
                    case 7:
                        numeroRomano+="VII";
                        break;
                    case 8: 
                        numeroRomano+="VIII";
                        break;
                    case 9:
                        numeroRomano+="IX";
                        break;
                }
            }

        }

        System.out.println("\nNumero Romano de "+num+ ": "+numeroRomano);
        
    }
}
