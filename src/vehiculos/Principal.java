/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Felipe Cantero
 */
public class Principal {

    public static void main(String[] args) {
        Arreglo obj = new Arreglo();
        String[] options = {"Agregar Avion", "Agregar Camioneta", "Mostrar Avion", "Mostrar Camioneta", "Salir"};
        int choice;

        do {
            choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    obj.PedirDatosAvion();
                    break;
                case 1:
                    obj.PedirDatosCamioneta();
                    break;
                case 2:
                    obj.MostrarAvion();
                    break;
                case 3:
                    obj.MostrarDatosCamioneta();
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliedo.........");
                     options.clone();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (choice != 4);
    }
}
