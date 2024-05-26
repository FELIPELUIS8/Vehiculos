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
public class Avion extends Vehiculo {

    private String Nombrepiloto;

    public Avion(String Marca, int Kilometraje, String Combustible, String Nombrepiloto) {
        super(Marca, Kilometraje, Combustible);
        this.Nombrepiloto = Nombrepiloto;
    }

    public String getNombrepiloto() {
        return Nombrepiloto;
    }

    public void setNombrepiloto(String Nombrepiloto) {
        this.Nombrepiloto = Nombrepiloto;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()
       + "Nombre del piloto: " + getNombrepiloto();
    }

}
