/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hogar
 */
public class Ventana extends JFrame{
    public Ventana(){
       
       this.setTitle("Mi Ventana");
       
       this.setSize(500, 500); //Establecer el tamaño de la ventana
       //setLocation(400, 150); //Establece la posición inicial de la ventana en pantalla
       
        //setBounds(400, 150, 500, 500); //Hace lo mismo que setSize y setLocation al mismo tiempo
        
        this.setLocationRelativeTo(null); //Aparee la ventana en el centro de la pantalla
        
        this.setResizable(false); //Evita que el usuario pueda redimensionar la ventana
        //this.setMinimumSize(new Dimension(200,200)); //Establece un tamaño mínimo para redimensionar la ventana
        
        this.getContentPane().setBackground(Color.BLUE); //Establecer el color del fondo, primero getConenido del panel
        
        inicarComponentes();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Termina el programa al cerrar la ventana
        
        
    }
    
    private void inicarComponentes(){
        JPanel panel = new JPanel(); //creacion del panel 
        panel.setLayout(null); //Desactiva el layout por defecto de los paneles
        panel.setBackground(Color.yellow); //Establecer el color del panel
        
        this.getContentPane().add(panel); //Agregar el panel a la ventana
        
        JLabel etiqueta = new JLabel(/*"Hola"*/); //Crea etiqueta
        etiqueta.setText("Hola"); //Añade lo que contiene la etiqueta
        etiqueta.setBounds(10, 10, 50, 30);
        panel.add(etiqueta); //Añade la etiqueta
        
        
        
    }
}
