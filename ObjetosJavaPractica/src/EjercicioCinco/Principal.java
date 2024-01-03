
package EjercicioCinco;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        double base, lado;
        
        
        System.out.print("Indique la cantidad de triángulos que desea: ");
        cantidad = entrada.nextInt();
        
        Triangulo array[] = new Triangulo[cantidad];
        
        for(int i=0; i<array.length; i++){
            System.out.print("Ingrese la base: ");
            base = entrada.nextDouble();
            System.out.println("\nIngrese el lado:");
            lado = entrada.nextDouble();
            array[i] = new Triangulo(base,lado);
        }
        
        System.out.println(array[Principal.areaMayor(array)].mostrarDatos());
        

    }
    
    public static int areaMayor(Triangulo array[]){
        int indice = 0;
        double areaMayor;
        
        areaMayor = array[0].getArea();
        for(int i=1; i<array.length; i++){
            if(array[i].getArea()>areaMayor){
                areaMayor = array[i].getArea();
                indice = i;
            }
        }
              
        return indice;
    }
}
