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
public class Sucursal {
     private int numSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numSucursal, String direccion, String ciudad) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatosSucursal(){
        return "La sucursal: "+numSucursal+" tiene dirección: "+direccion+" de la ciudad: "+ciudad;
    }
    
    public double calcularPrecio(Paquete t){
        double precio;
        precio = t.getPeso();
        if(t.getPrioridad() == 1){
            precio += 10;
        }
        if(t.getPrioridad()==2){
                precio += 20;
        }
        
        
        return precio;
    }
}
