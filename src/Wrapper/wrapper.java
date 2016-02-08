/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrapper;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class wrapper {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String numero;
        String numeros;
        do {
            numero = numeros = sc.next();
            
        } while(!numeros.equals("0"));
            
        System.out.println(Suma.Calcular(numero));
                
        Scanner sc1 = new Scanner(System.in);        
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni = sc1.nextInt();
        int numdni = dni%23;
        System.out.println(letras.charAt(numdni));
    }

}
