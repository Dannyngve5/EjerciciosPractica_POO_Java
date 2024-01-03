/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDos;

import java.util.Scanner;
import javax.swing.JOptionPane;

class Principal {
    
    
        
     public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int x,y,desplaza = 0,opcion;
        
        System.out.println("Digite la posición inicial en X: ");
        x = entrada.nextInt();
        System.out.println("Digite la posición inicial en y: ");
        y = entrada.nextInt();
        Posicion tablero1 = new Posicion(x,y);
        
        do{
            
            tablero1.imprimirposicion();
            System.out.println("---Indique que desea hacer---");
            System.out.println("1. Mover arriba");
            System.out.println("2. Mover abajo");
            System.out.println("3. Mover derecha");
            System.out.println("4. Mover izquierda");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();
            if (opcion != 5){
                System.out.println("Indique numero de desplazamiento");
                desplaza = entrada.nextInt();
            }
            
            switch (opcion){
                case 1: tablero1.moverArriba(desplaza); break;
                case 2: tablero1.moverAbajo(desplaza);break;
                case 3: tablero1.moverDerecha(desplaza);break;
                case 4: tablero1.moverIzquierda(desplaza);break;
                case 5: System.out.println("Programa finalizado");break;
                default: System.out.println("Opcion invalida");break;
            }
                    
            
        }while(opcion != 5);
        
        
    }
}
