/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author daw1
 */
public class Main {

    public static void main(String[] args) {

        JugadoresFutbol j1 = new JugadoresFutbol(123);
        JugadoresFutbol j2 = new JugadoresFutbol(569);
        JugadoresFutbol j4 = new JugadoresFutbol(834);
        JugadoresFutbol j5 = new JugadoresFutbol(274);

        System.out.println(JugadoresFutbol.num_jugadores());
              
        System.out.println(Circulo.area(2));
        System.out.println(Circulo.diametro(2));
        System.out.println(Circulo.perimetro(2));
        
        
    }

}
