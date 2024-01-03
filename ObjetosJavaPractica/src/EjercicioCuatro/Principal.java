/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCuatro;

import java.util.Scanner;

class Principal {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int numero, cantidad;
        float tiempo;
        String nombre;
        
        System.out.println("Indique el número de atletas: ");
        cantidad = entrada.nextInt();
        Atleta array[] = new Atleta[cantidad];
        
        for(int i=0; i<cantidad; i++){
            
            System.out.print("Ingrese el número: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            System.out.print("\nIngrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("\nIngrese el tiempo");
            tiempo = entrada.nextFloat();
            array[i] = new Atleta(numero, nombre, tiempo);
        }
        
        System.out.println(array[Principal.ganador(array)].mostrarDatos());
        
        
        
    }
    
    public static int ganador(Atleta array[]){
        int indice=0;
        float mayor;
        
        mayor = array[0].getTiempo();
        for(int i=1; i<array.length; i++){
            if(array[i].getTiempo() > mayor){
                indice = i;
            }
        }
              
        return indice;
    }
    
    
    
}
