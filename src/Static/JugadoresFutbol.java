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
public class JugadoresFutbol {

    private int num_dorsal;
    private static int num_jugadores;

    public JugadoresFutbol(int num_dorsal) {
        this.num_dorsal = num_dorsal;
        num_jugadores++;
    }

    public static int num_jugadores() {
        return num_jugadores;
    }

}
