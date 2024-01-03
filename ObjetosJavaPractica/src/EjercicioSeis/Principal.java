
package EjercicioSeis;

import java.util.Scanner;


public class Principal {
    
    static Scanner entrada = new Scanner(System.in);    
        
    public static void main (String[] args){
        
        double x,y,a,b;
        int e;
        Complejo suma,num1,num2, multiplicar, entero;
        boolean comparar;
        int opcion;
        
        System.out.println("Ingrese un número complejo");
        System.out.print("Parte real: ");
        x = entrada.nextDouble();
        System.out.print("\nParte Imaginaria:");
        y = entrada.nextDouble();
        num1 = new Complejo(x,y);
       
        
        do{
            
            System.out.println("---Menu---");
            System.out.println("1. Sumar con otro complejo");
            System.out.println("2. Multiplicar con otro complejo");
            System.out.println("3. Comparar con otro complejo");
            System.out.println("4. Multiplicar por entero");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese un número complejo");
                    System.out.print("Parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("\nParte Imaginaria:");
                    b = entrada.nextDouble();
                    num2 = new Complejo(a,b);
                    
                    suma = num1.sumar(num2);
                    System.out.println("La suma es: "+suma.getX()+" + ("+suma.getY()+" i)");
                    break;
                case 2:
                    System.out.println("Ingrese un número complejo");
                    System.out.print("Parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("\nParte Imaginaria:");
                    b = entrada.nextDouble();
                    num2 = new Complejo(a,b);
                    multiplicar = num1.multiplicar(num2);
                    System.out.println("La multiplicación es: "+multiplicar.getX()+" + "+multiplicar.getY()+" i");
                    break;
                case 3:
                    System.out.println("Ingrese un número complejo");
                    System.out.print("Parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("\nParte Imaginaria:");
                    b = entrada.nextDouble();
                    num2 = new Complejo(a,b);
                    comparar = num1.comparar(num2);
                    if (comparar){
                        System.out.println("Los números son iguales");
                    }else{
                        System.out.println("Los números no son iguales");
                    }
                    break;
                case 4:
                    System.out.println("Digite un número entero");
                    e = entrada.nextInt();
                    entero = num1.entero(e);
                    System.out.println("El resultado es: "+entero.getX()+" + "+entero.getY()+" i");
                    break;
                case 5: 
                    System.out.println("Finalización del programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            
        }while(opcion!=5);
    }
    
   
    
    
}
