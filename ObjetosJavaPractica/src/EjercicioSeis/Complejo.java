
package EjercicioSeis;

public class Complejo {
    
    
    private double x;
    private double y;

    public Complejo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public Complejo sumar(Complejo c){
        Complejo suma = new Complejo(x+c.getX(),y+c.getY());
        return suma;
    }
    
    public Complejo multiplicar(Complejo c){
        Complejo resultado = new Complejo(x*c.getX(),y*c.getY());
        return resultado;
    }
    
    public boolean comparar(Complejo c){
        
        if(x == c.getX() && y == c.getY()){
            return true;
        }else{
            return false;
        }
    }
    
    public Complejo entero(int k){
        Complejo resultado = new Complejo(x*k,y*k);
        return resultado;
        
        
    }
    
}
