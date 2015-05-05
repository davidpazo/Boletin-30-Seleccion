package Seleccion;

/**
 *
 * @author dpazolopez
 */
public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, String nombre, String apellidos, int edad, int id) {
        super(nombre, apellidos, edad, id);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento() {
        System.out.println("Vamos a planificar el entrenamiento, se van a enterar");
    }

    @Override
    public void concentrarse() {
        System.out.println("Nos mentalizamos para el mundial, un entrenador concentrado, es un partido ganado");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja al mundial");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador entrena a la selección");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando el mundial");
    }

    @Override
    public String toString() {
        return "Entrenador:" + "\nID:" + id + "\nNombre:" + nombre + "\nApellidos:" + apellidos + "\nEdad:" + edad + "\nIDFederacion:" + idFederacion + '\n';
    }
}
