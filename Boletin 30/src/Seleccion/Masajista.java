package Seleccion;

/**
 *
 * @author dpazolopez
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int añosExp;

    public Masajista() {
    }

    public Masajista(String titulacion, int añosExp) {
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }

    public Masajista(String titulacion, int añosExp, String nombre, String apellidos, int edad, int id) {
        super(nombre, apellidos, edad, id);
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public void darMasaje() {
        System.out.println("Dando masaje al jugador");
        System.out.println("Mira que bien esta para jugar ^.^");
    }

    @Override
    public void concentrarse() {
        System.out.println("Vamos con la seleccion al mundial!!");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja al mundial!!");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando para el mundial, el masajista calienta manos");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando el mundial y preparados por si acaso hay alguna lesion");
    }

    @Override
    public String toString() {
        return "Masajista:" + "\nID:" + id + "\nNombre:" + nombre + "\nApellidos:" + apellidos + "\nEdad:" + edad + "\nTitulacion:" + titulacion + "\nAños de experiencia:" + añosExp + '\n';
    }
}
