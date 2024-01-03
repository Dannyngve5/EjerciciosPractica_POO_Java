
package EjercicioDiez;


public class Entrenador extends Persona {
    String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    
    
    public void planificarEntrenamiento(){
        System.out.println("Se ha planificado un entrenamiento");
    }

    @Override
    public void entrenamiento() {
        System.out.println("El entrenador ha dirigdo el entrenamiento");
    }

    @Override
    public void partido() {
        System.out.println("El entrenador ha dirigido el partido");
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
    
}
