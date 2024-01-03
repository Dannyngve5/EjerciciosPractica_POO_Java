/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDos;


public class Posicion {
    
    private int x;
    private int y;
    
    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moverArriba(int desplaza){
        y += desplaza;
    }
    
    public void moverAbajo(int desplaza){
        y -= desplaza;
    }
    
    public void moverDerecha(int desplaza){
        x += desplaza;
    }
    
    public void moverIzquierda(int desplaza){
        x -= desplaza;
    }
    
    public void imprimirposicion(){
        System.out.println("La posición del objeto es: x: " + x + " y: " + y );
    }
}
