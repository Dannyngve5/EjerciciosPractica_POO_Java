/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNueve;


public abstract class Poligono {
    
    protected int numLados;

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }
    
    
    @Override
    public String toString() {
        return "Poligono{" + "numero de Lados: " + numLados + '}';
    }
    
    public abstract double area();
    
    
    
    
}
