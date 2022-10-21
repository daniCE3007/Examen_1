/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dibujec;
import javax.swing.JOptionPane;

/**
 *
 * @author LeonardoCZ
 */
public class dibujeC {
    
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog(
                null,"Ingrese la cantidad de asteriscos "
                        + "que tendra la C: "));
        int i = 1;
        
        while (i > 0){
            if (numero == 0){
                numero = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "El numero no puede ser"
                                + " menor que 1, ingrese otro numero: "));
                
            }else {
                for (int x = 1; x <= numero; x++){
                    System.out.print(" *");
                }
                System.out.println(" ");
                for (int y = 2; y < numero; y++){
                    System.out.println(" *" );
                }
                for (int c = 1; c <= numero; c++){
                    System.out.print(" *");
                }
                i = 0;
                        
            }
            System.out.print("\n");
                
                
        }
    }
    
}

