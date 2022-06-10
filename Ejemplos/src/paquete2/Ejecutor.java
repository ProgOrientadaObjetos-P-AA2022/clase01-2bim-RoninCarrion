/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(10000);
        // System.out.println(edf1);
        Edificio edf2 = new Edificio("Edificio Sur");
        edf2.establecerCostos(20000);

        Edificio edf3 = new Edificio("Edificio Norte");
        edf3.establecerCostos(30000);

        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(20000);

        // Edificio[] edificios = new Edificio[4];
        /*
        edificios[0]= edf1;
        edificios[1]= edf2;
        edificios[2]= edf3;
        edificios[3]= edf4;
         */
        
        Edificio [] edificios = {edf1, edf2, edf3, edf4};
        // Crear un objeto de tipo Empresa:
        Empresa miEmpresa = new Empresa();

        //  Nombre: Empresa de Hojas
        miEmpresa.establecerNombre("Empresa de Hojas");

        //  Lista de edificio: edf1, edf2, edf3, edf4
        miEmpresa.establecerEdificios(edificios);
        miEmpresa.establecerCostoBienesInmuebles();
        // Imprimir el costo de los bienes inmuebles de la empresa
        // System.out.printf("%.2f\n", miEmpresa.obtenerCostoBienesInmuebles());
        System.out.printf("%s\n", miEmpresa);
        
        Vehiculo v1 = new Vehiculo("Auto","Lb12312", 20000);
        Vehiculo v2 = new Vehiculo("Camioneta","Lbwefwdsd", 230000);
        Vehiculo v3 = new Vehiculo("Camión","L3rg1gf312", 456000);
        Vehiculo v4 = new Vehiculo("Volqueta","ggfhhjf2212", 500000);
        
        
        Vehiculo [] autos = {v1, v2, v3, v4};
    }
}
