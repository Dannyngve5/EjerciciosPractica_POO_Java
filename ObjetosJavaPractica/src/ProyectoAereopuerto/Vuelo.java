/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAereopuerto;

/**
 *
 * @author Hogar
 */
public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero[] listaPasajeros;

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros, Pasajero[] listaPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros] ;
    }
    
    public void insertarPasajero(Pasajero pasajero){
       listaPasajeros[numActualPasajeros] = pasajero;
       numActualPasajeros++;
    }
    
    public Pasajero getPasajero(int identificador){
        return listaPasajeros[identificador];
    }
    
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i = 0;
        Pasajero pasajero = null;
        while((!encontrado)&&(i<numActualPasajeros)){
            if(listaPasajeros[i].getPasaporte().equals(pasaporte)){
                encontrado = true;
                pasajero = listaPasajeros[i];
            }
            i++;
        }
        return pasajero;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    
    
    
    
    
}
