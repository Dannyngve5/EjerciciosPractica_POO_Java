
package EjercicioDiez;


public class Doctor extends Persona{
    String titulacion;
    int agnosExperiencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int agnosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.agnosExperiencia = agnosExperiencia;
    }

    
    
    public void curarLesion(){
        System.out.println("Se ha curado una lesión");
    }

    @Override
    public void entrenamiento() {
        System.out.println("El doctor ha supervisado el entrenamiento");
    }

    @Override
    public void partido() {
        System.out.println("El doctor ha supervisado el partido");
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAgnosExperiencia() {
        return agnosExperiencia;
    }

    public void setAgnosExperiencia(int agnosExperiencia) {
        this.agnosExperiencia = agnosExperiencia;
    }
    
    
    
}
