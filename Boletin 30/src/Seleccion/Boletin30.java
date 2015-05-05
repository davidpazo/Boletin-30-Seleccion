package Seleccion;

import java.util.ArrayList;

/**
 *
 * @author dpazolopez
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <SeleccionFutbol> futbol = new ArrayList();
       futbol.add(new Futbolista(1,"Delantero","Pepe","Gonzalez",37,2));
       futbol.add(new Masajista("Fisioterapeuta",10,"Celia","Dominguez",29,3));
       futbol.add(new Entrenador(98,"Jordi","Puyol",50,1));
       futbol.add(new Seleccionador("Iker","Casillas",39,4));
       for (int i = 0; i < futbol.size(); i++) {
            System.out.println(futbol.get(i));
        }
    }
    
}
