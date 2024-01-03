
package EjercicioTres;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int precio;
    
    public Vehiculo(String marca, String modelo, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
    
}
