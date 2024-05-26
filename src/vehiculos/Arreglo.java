/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Felipe Cantero
 */
public class Arreglo {
    
    private ArrayList<Avion> avion;
    private ArrayList<Camioneta> camioneta;
    
    public Arreglo() {
        avion = new ArrayList<>();
        camioneta = new ArrayList();
    }
    
    public void PedirDatosAvion() {
        ArrayList<Object> datosAvion = new ArrayList<>();
        String[] camposAvion = {"Marca", "Kilometraje", "Combustible", "Nombre del piloto"};
        
        for (String campos : camposAvion) {
            String evaluador;
            boolean validador = false;
            do {
                evaluador = JOptionPane.showInputDialog(null, "Ingrese  " + campos + " del Avión");
                switch (campos) {
                    case "Marca":
                        if (evaluador.matches("[a-zA-Z\\s]+")) {
                            validador = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: La marca debe contener solo letras y espacios.");
                        }
                        break;
                    
                    case "Kilometraje":
                        
                        try {
                            Integer.parseInt(evaluador);
                            validador = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un kilometraje valido");
                        }
                        break;
                    
                    case "Combustible":
                        if (evaluador.matches("[a-zA-Z\\s]+")) {
                            validador = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: el combustible debe contener solo letras y espacios.");
                        }
                        break;
                    
                    case "Nombre del piloto":
                        if (evaluador.matches("[a-zA-Z\\s]+")) {
                            validador = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: La marca debe contener solo letras y espacios.");
                        }
                }
                break;
            } while (!validador);
            
            datosAvion.add(evaluador);
        }
        Avion DatosAvion = new Avion(
                (String) datosAvion.get(0),
                Integer.parseInt((String) datosAvion.get(1)),
                (String) datosAvion.get(2),
                (String) datosAvion.get(3)
        );
        
        avion.add(DatosAvion);
        
    }
    
    public void MostrarAvion() {
        if (avion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay aviones registrados");
        }
        StringBuilder datos = new StringBuilder();
        for (Avion a : avion) {
            datos.append(a.MostrarDatos()).append("\n");
             datos.append("------------------------------------");
        }
        JOptionPane.showMessageDialog(null, datos.toString());
    }
    
    public void PedirDatosCamioneta() {
        ArrayList<Object> datosCamioneta = new ArrayList<>();
        
        String[] camposCaminioneta = {"Marca", "Kilometraje", "Combustible", "Carga Maxima"};
        
        for (String campos : camposCaminioneta) {
            String evaluador;
            boolean validador = false;
            do {
                evaluador = JOptionPane.showInputDialog("Ingrese " + campos + " de la Camioneta");
                switch (campos) {
                    case "Marca":
                        if (evaluador.matches("[a-zA-Z-\\s]+")) {
                            validador = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo letras ");
                        }
                        break;
                    case "Kilometraje":
                        try {
                            Integer.parseInt(evaluador);
                            validador = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
                        }
                        break;
                    case "Combustible":
                        if (evaluador.matches("[a-zA-Z-\\s]+")) {
                            validador = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo letras ");
                        }
                        break;
                    case "Carga Maxima":
                            
                        try {
                            Integer.parseInt(evaluador);
                            validador = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
                        }
                        break;
                }
            } while (!validador);
            datosCamioneta.add(evaluador);
            
        }
        
        Camioneta camion = new Camioneta(
                (String) datosCamioneta.get(0),
                Integer.parseInt((String) datosCamioneta.get(1)),
                (String) datosCamioneta.get(2),
                Integer.parseInt((String) datosCamioneta.get(3))
        );
        
        camioneta.add(camion);
    }
    
    public void MostrarDatosCamioneta(){
        if (camioneta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se an agregado Camionetas");
        }else{
            StringBuilder datos = new StringBuilder();
            for (Camioneta camionet : camioneta) {
                datos.append(camionet.MostrarDatos()).append("\n");
                datos.append("------------------------------------");
            }
            JOptionPane.showMessageDialog(null, datos.toString());
        }
    }
}
