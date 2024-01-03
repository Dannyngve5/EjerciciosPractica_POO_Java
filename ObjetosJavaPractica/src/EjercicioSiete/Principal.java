
package EjercicioSiete;

import java.util.Scanner;



public class Principal {
    static Scanner entrada = new Scanner(System.in);
    
    
    public static void main (String[] args){
        int opc = 0;
        
    
        do{
            System.out.println("Menú del banco");
            System.out.println("Escoja una opción: \n1) Registrar cliente \n2) Crear cuenta \n3) Consultar saldo cuenta \n4) Ingresar saldo cuenta \n5) Retirar dinero cuenta \n6) Salir");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1: registroCliente(); break;
                case 2: ;break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: System.out.println("Saliendo del sistema");break;
                default: System.out.println("Opción incorrecta");
                
            }
                   
                
            
        }while(opc!=6);
        
    }
    
   public static void registroCliente(){
       String nombre, apellido, dni;
       
       Cliente cliente;
       nombre = entrada.nextLine();
       System.out.print("Ingrese el nombre del cliente: ");
       nombre = entrada.nextLine();
       System.out.print("Ingrese el apellido del cliente");
       apellido = entrada.nextLine();
       System.out.print("Ingrese el DNI del cliente");
       dni = entrada.nextLine();
       cliente = new Cliente(nombre,apellido,dni);
       System.out.println("El cliente es: "+cliente.getNombre()+" "+cliente.getApellido()+" con DNI: "+cliente.getDni());
   }
   
   public static void crearCuenta(){
       
   }
   
   
}
