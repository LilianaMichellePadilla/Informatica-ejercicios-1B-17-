/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diecisiete;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class Diecisiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        String quieroJugar = "si";
        while(quieroJugar.equals("si")){
        System.out.println("¿Quieres seguir jugando?");
        quieroJugar = Reader.next();
        }  
    }
}
