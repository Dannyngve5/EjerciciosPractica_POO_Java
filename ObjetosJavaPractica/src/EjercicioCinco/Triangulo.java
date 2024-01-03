
package EjercicioCinco;



public class Triangulo {
    
    private double base;
    private double lado;

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double getPerimetro(){
        double perimetro;
        perimetro = base + 2 * lado;
        return perimetro;
    }
    
    public double getArea(){
        double area;
        
        area = (base * Math.sqrt(lado*lado) - (base*base)/4)/2;
        
        return area;
    }
    
    public String mostrarDatos(){
        return "La base es: "+base+" \nLa altura"+lado+"\nPerimetro"+getPerimetro()+"\nArea: "+getArea();
    }

    
}
