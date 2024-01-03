/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDiez;

/**
 *
 * @author Hogar
 */
public class Futbolista extends Persona {
    
    int dorsal;
    String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

       
    public void entrevista(){
        System.out.println("Se ha concedido una entrevista");
    }

    @Override
    public void entrenamiento() {
        System.out.println("El futbolista ha entrenado");
    }

    @Override
    public void partido() {
        System.out.println("El futbolista ha jugado un partido");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
    
}
