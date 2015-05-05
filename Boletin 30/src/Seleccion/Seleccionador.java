/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Seleccion;

/**
 *
 * @author dpazolopez
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }
    public void seleccionarXogador(){
        System.out.println("¿Que xogador queres seleccionar?");
    }
}
