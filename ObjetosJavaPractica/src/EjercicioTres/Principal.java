
package EjercicioTres;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String marca, modelo;
        int precio, cantidad, menor=0, pos = 0;
        Vehiculo v1;
        
        System.out.println("Cuantos vehiculos desea crear: ");
        cantidad = entrada.nextInt();
        
        Vehiculo array[] = new Vehiculo[cantidad];
        
        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese las propiedades del vehículo: " + (i+1));
            System.out.print("Ingrese la marca: ");
            marca = entrada.next();
            System.out.print("Ingrese el modelo: ");
            modelo = entrada.next();
            System.out.print("Ingrese el precio: ");
            precio = entrada.nextInt();
            array[i] = new Vehiculo(marca, modelo, precio);
            if(i == 0){
                menor = precio;
                pos = i;
            }else{
                if(precio < menor){
                    menor = precio;
                    pos = i;
                }
            }            
        }
        
        System.out.println("El vehiculo con menor precio es el vehículo número " + (pos+1) + "Y sus características son: ");
        System.out.println("Marca : " + array[pos].getMarca());
        System.out.println("Modelo : " + array[pos].getModelo());
        System.out.println("Precio : " + array[pos].getPrecio());
        
        
        
        
        
        
        
         
        
        
        
        
        
    }
}
