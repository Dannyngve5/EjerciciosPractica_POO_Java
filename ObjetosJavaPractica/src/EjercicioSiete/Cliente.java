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
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
       
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getDni() {
        return dni;
    }

    

    public Cuenta[] getCuentas() {
        return cuentas;
    }
    
    public double consultarSaldo(int numCuenta){
        return cuentas[numCuenta].getSaldo();
        
    }
    
    public void ingresarDinero(int numCuenta, double cantidad){
        cuentas[numCuenta].ingresoDinero(cantidad);
    }
    
    public void retirarDinero(int numCuenta, double cantidad){
        cuentas[numCuenta].retiroDinero(cantidad);
    }
    
          
}
