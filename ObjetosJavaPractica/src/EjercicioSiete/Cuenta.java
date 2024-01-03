/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSiete;

/**
 *
 * @author Hogar
 */
public class Cuenta {
    
    private int numCuenta;
    private double saldo;

    public Cuenta(int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresoDinero(double saldo){
        this.saldo = saldo;
    }
    
    public void retiroDinero(double saldo){
        if(saldo <= this.saldo){
            this.saldo -= saldo;
        }
    }
    
    
}
