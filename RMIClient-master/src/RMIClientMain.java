

import java.util.Scanner;

public class RMIClientMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RmiCommunicationClient wsc = new RmiCommunicationClient();
            
            Scanner e = new Scanner(System.in);
            int opc = 0;
            System.out.println("Teclee la operacion que desee realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Factorial de un numero");
            System.out.println("6. Conversion a Binario");
            
            opc = e.nextInt();
            
            switch (opc){
                case 1:
                    int num1;
                    int num2;
                    System.out.println("Teclee el primer numero");
                    num1 = e.nextInt();
                    System.out.println("Teclee el segundo numero");
                    num2 = e.nextInt();
                    
                    
                    int suma = wsc.getSuma(num1, num2);
                    System.out.println("Suma: " + suma);
                    break;
                case 2:
                    int num3;
                    int num4;
                    System.out.println("Teclee el primer numero");
                    num3 = e.nextInt();
                    System.out.println("Teclee el segundo numero");
                    num4 = e.nextInt();
                    
                    int resta = wsc.getResta(num3, num4);
                    System.out.println("Resultado: " + resta);
                    break;
                case 3:
                    int num5;
                    int num6;
                    System.out.println("Teclee el primer numero");
                    num5 = e.nextInt();
                    System.out.println("Teclee el segundo numero");
                    num6 = e.nextInt();
                    
                    int mult = wsc.getMultiplicacion(num5, num6);
                    System.out.println("Resultado: " + mult);
                    break;
                case 4:
                    int num7;
                    int num8;
                    System.out.println("Teclee el primer numero");
                    num7 = e.nextInt();
                    System.out.println("Teclee el segundo numero");
                    num8 = e.nextInt();
                    
                    int div = wsc.getDivision(num7, num8);
                    System.out.println("Resultado: " + div);
                    break;
                case 5:
                    int num9;
                    
                    System.out.println("Teclee el numero");
                    num9 = e.nextInt();
                   
                    
                    int fac = wsc.getFactorial(num9);
                    System.out.println("Resultado: " + fac);
                    break;
                case 6:
                    int num10;
                    
                    System.out.println("Teclee el primer numero");
                    num10 = e.nextInt();
                    
                    
                    String bin = wsc.getBinario(num10);
                    System.out.println("Resultado: " + bin);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
                    
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}
