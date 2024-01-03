/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDiez;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        Futbolista futbolista = new Futbolista("Juan", "Ramirez", 25, 12, "Delantero");
        Entrenador entrenador = new Entrenador("Pedro", "Gonzales", 45, "Agresiva");
        Doctor doctor = new Doctor("Jose", "Gomez", 50, "Universidad 1", 40);
        
        System.out.println("Bienvenido al menú de Atletico Rilay");
        
        
        do{
            System.out.println("Indique que acción desea realizar \n 1.Viaje de equipo \n 2.Entrenamiento \n 3.Partido "
                + "\n 4.Planificar entrenamiento \n 5.Entrevista \n 6.Curar Lesión \n 7. Salir");
            try{
                opcion = entrada.nextInt();
            }catch(InputMismatchException ex){
                System.out.println("Opción no válida");
                entrada.nextLine();
            }
            
            switch(opcion){
                case 1:
                    futbolista.viajar();
                    break;
                case 2:
                    futbolista.entrenamiento();
                    entrenador.entrenamiento();
                    doctor.entrenamiento();
                    break;
                case 3:
                    futbolista.partido();
                    entrenador.partido();
                    doctor.partido();
                    break;
                case 4:
                    entrenador.planificarEntrenamiento();
                    break;
                case 5:
                    futbolista.entrevista();
                    break;
                case 6:
                    doctor.curarLesion();
                    break;
                case 7:
                    System.out.println("Porgrama finalizado");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }            
        }while(opcion != 7);
        
        
        
        
        
        
        
        
    }
}
