/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioOcho;

/**
 *
 * @author Hogar
 */
public class Paquete {
    
     private int numPaquete;
    private String dni;
    private double peso;
    private int prioridad;

    public Paquete(int numPaquete, String dni, double peso, int prioridad) {
        this.numPaquete = numPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumPaquete() {
        return numPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatosPaquete(){
        
       return ("Los datos del paquete "+numPaquete+" son: \nDNI: "+dni+" \nPeso: "+peso+"\nPrioridad: "+prioridad);
    }
 
}
