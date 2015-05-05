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
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("La seleccion se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("La seleccion viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("La seleccion entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("La seleccion juega el mundial");
    }
    
}
