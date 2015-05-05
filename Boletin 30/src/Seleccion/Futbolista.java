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

    public Futbolista(String nombre, String apellidos, int edad, int id, int dorsal, String demarc) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarc;
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

}
