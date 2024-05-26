/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

public class Camioneta extends Vehiculo {

    private int CargaMaxima;

    public Camioneta(String Marca, int Kilometraje, String Combustible, int CargaMaxima) {
        super(Marca, Kilometraje, Combustible);
        this.CargaMaxima = CargaMaxima;
    }

    public int getCargaMaxima() {
        return CargaMaxima;
    }

    public void setCargaMaxima(int CargaMaxima) {
        this.CargaMaxima = CargaMaxima;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()
                + "Carga Maxima: " + getCargaMaxima();
    }

}
