/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNueve;

import static java.lang.Math.sqrt;

/**
 *
 * @author Hogar
 */
public class Triangulo extends Poligono{
    private double lado1, lado2, lado3;
    
    public Triangulo( double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString()+ "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
    
    
    @Override
    public  double area(){
        double suma,area;
        suma = (lado1 + lado2 + lado3)/2;
        area = sqrt(suma*(suma-lado1)*(suma-lado2)*(suma-lado3));
        return area;
    }
    
}
