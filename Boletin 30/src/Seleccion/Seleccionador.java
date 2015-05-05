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
public class Seleccionador extends SeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(String nombre, String apellidos, int edad, int id) {
        super(nombre, apellidos, edad, id);
    }

    public void seleccionarXogador() {
        System.out.println("¿Que xogador queres seleccionar?");
    }
     @Override
    public String toString() {
        return "Seleccionador:" + "\nID: " + id + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + '\n';
    }
}
