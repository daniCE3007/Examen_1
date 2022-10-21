/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compra_tiquetes_concierto;
import javax.swing.JOptionPane;

/**
 *
 * @author danic
 */
public class Compra_Tiquetes_Concierto {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       int i = 0;
        while (i != 4) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese la categoria de la entrada que desea:\n"
                    + "1.Alta\n2.Media\n3.Baja\n4.Salir"));
            if (opcion==1){
                JOptionPane.showMessageDialog(null, "Los"
                        + "beneficios que adquiere son los siguientes:\n"
                        + "1- Puede adquirir asientos al frente del escenario lo"
                        + " más cerca posible\n"
                        + "2- Ó puede de ir detrás del escenario");
            }else if(opcion==2){
                JOptionPane.showMessageDialog(null, "El"
                        + " beneficio que adquiere con esta entrada es el de "
                        + "estar a una distancia media del escenario");
            }else if (opcion==3){                
                JOptionPane.showMessageDialog(null, "El"
                        + " beneficio que adquiere con esta entrada es el de "
                        + "estar a una distancia considerable del escenario");
            }else {
                JOptionPane.showMessageDialog(null, "Gracias "
                        + "por usar el programa");
                i = 4;
            }

        }
        
        }

}
