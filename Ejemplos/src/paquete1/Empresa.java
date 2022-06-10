/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private double costoBienesInmuebles;
    private Vehiculo[] vehiculos;
    private double costoVehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma += edificios[i].obtenerCosto();

        }
        costoBienesInmuebles = suma;

    }

    public void establecerCostoVehiculos(double a) {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma += vehiculos[i].obtenerValor();

        }
        costoVehiculos = suma;

    }

    public void establecerCostoTotalBienes(double a) {
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostoVehiculos() {
        return costoVehiculos;
    }

    public double obtenerCostoTotalBienes() {
        return costoTotalBienes;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nLista de Edificios\n", nombre);
        for (int i = 0; i < edificios.length; i++) {
            cadena = String.format("%s%d. %s (%.1f)\n", cadena,
                    i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
            
            cadena = String.format("");
        }
        cadena = String.format("%sTotal de inmuebles: %.1f\n",
                cadena,
                obtenerCostoBienesInmuebles());
        // cadena += "Total inmuebles: " + obtenerCostoBienesInmuebles(); 
        return cadena;
    }

}
