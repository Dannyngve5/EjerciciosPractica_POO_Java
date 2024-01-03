/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioOcho;

import java.util.Scanner;


public class Principal {
  
  public static void main(String args[]){
     Scanner entrada = new Scanner(System.in);
    int numSucursal, numPaquete, prioridad, opc;
    String direccion, sucursal, dni;
    double peso;
    Sucursal[] sucursales = new Sucursal[20];
    Paquete[] paquetes = new Paquete[10];

    do{
        System.out.println("\t.:MENU:.");
        System.out.println("1) Nueva sucursal");
        System.out.println("2) Enviar paquete");
        System.out.println("3) Consultar sucursal");
        System.out.println("4) Consultar paquete");
        System.out.println("5) Mostrar todas sucursales");
        System.out.println("6) Mostrar todas paquetes");
        System.out.println("7) Salir");
        System.out.print("Opcion: ");
        opc = entrada.nextInt();
    }while(true);
  }
  

  
  
  
}
