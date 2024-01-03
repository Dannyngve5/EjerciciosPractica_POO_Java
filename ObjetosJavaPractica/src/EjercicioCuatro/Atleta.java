
package EjercicioCuatro;


public class Atleta {
    
    private int numero;
    private String nombre;
    private float tiempo;

    public Atleta(int numero, String nombre, float tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }
    
    public String mostrarDatos(){
        return "Nombre: " + nombre + " Número: " + numero + " Tiempo: " + tiempo;
    }
    
}
