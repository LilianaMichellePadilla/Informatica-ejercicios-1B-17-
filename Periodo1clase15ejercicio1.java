/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        System.out.println ("Ingrese la base: ");
        double base = Entrada.nextDouble ();
        System.out.println("Ingrese el exponente: ");
        double exponente = Entrada.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println ("El resultado es: "+ resultado);
    }
    
}
