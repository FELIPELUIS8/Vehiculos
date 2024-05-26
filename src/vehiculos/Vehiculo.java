/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Luis Felipe Cantero
 */
public abstract class Vehiculo {

    private String Marca;
    private int Kilometraje;
    private String Combustible;

    public Vehiculo(String Marca, int Kilometraje, String Combustible) {
        this.Marca = Marca;
        this.Kilometraje = Kilometraje;
        this.Combustible = Combustible;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String MostrarDatos() {
        String info = "Marca: " + getMarca() + "\n"
                + "Kilometraje: " + getKilometraje() + "\n"
                + "Combustible: " + getCombustible() + "\n";
        return info;
    }
    
    
}
