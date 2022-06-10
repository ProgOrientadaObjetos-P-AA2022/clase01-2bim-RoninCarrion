/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author ronni
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String a, String b, double c) {
        tipo = a;
        matricula = b;
        valor = c;
    }
    
    

    public void establecerTipo(String a) {
        tipo = a;
    }

    public void establecerMatricula(String a) {
        matricula = a;
    }

    public void establecerValor(double a) {
        valor = a;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }
    
    
}
