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
public class Circulo {

    public Circulo() {

    }

    public static double area(double radio) {
        double valor = Math.pow(radio, 2) * Math.PI;

        return valor;
    }

    public static double diametro(double radio) {
        double valor = Math.pow(radio, 2);
        return valor;
    }

    public static double perimetro(double radio) {
        double valor = 2 * Math.PI * radio;
        return valor;
    }

}
