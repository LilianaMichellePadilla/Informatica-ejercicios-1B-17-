/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diecinueve;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class Diecinueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finalizada):");
            valor=datos.nextInt();
            if (valor>=100) {
                System.out.println("Es de 3 digito.");
            } else {
                if (valor>=10) {
                    System.out.println("Es de 2 digitos. ");
                } else {
                    System.out.println("Es de 1 digito.");
                }
            }
        } while (valor!=0);
    }
}
