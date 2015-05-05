package Seleccion;

/**
 *
 * @author dpazolopez
 */
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, String nombre, String apellidos, int edad, int id) {
        super(nombre, apellidos, edad, id);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("Estan muy cansados para entrevistas");
    }

    @Override
    public void concentrarse() {
        System.out.println("La seleccion se concentra para el partido");
    }

    @Override
    public void viajar() {
        System.out.println("Los futbolistas viajan al mundial");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando para la final");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Hay que ganaaaar!!");
    }

    @Override
    public String toString() {
        return "Futbolista: " + "\nID: " + id + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nDorsal: " + dorsal + "\nDemarcacion: " + demarcacion + '\n';
    }
}
