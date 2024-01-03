/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNueve;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    static ArrayList<Poligono> array = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main (String[] args){
        llenarPoligono();
        
        //mostrar datos y area de cada poligono
        mostrarResultados();
            }
    
    public static void llenarPoligono(){
        
        int opc;
        char res;
        do{
            do{
                System.out.print("Que poligono? ");
                opc = entrada.nextInt();  
            }while(opc>2 || opc<1);
            switch(opc){
                case 1: llenarTriangulo(); break;
                case 2: llenarRectangulo();break;
                
            }          
            System.out.print("Otro más?:");
            res = entrada.next().charAt(0);
            
        }while(res == 's');
    }
    
    public static void llenarTriangulo(){
        double lado1,  lado2,  lado3;
        System.out.print("Lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = entrada.nextDouble();
        System.out.print("Lado 3: ");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        array.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.print("Lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        array.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        for(Poligono poli: array){
            System.out.print(poli.toString());
            System.out.println("  Area: "+poli.area());
            System.out.println("");
        }
    }
}
