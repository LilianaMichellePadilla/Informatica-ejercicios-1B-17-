/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veinte;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class veinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int password;
        do {
        System.out.print("Introduzca su contraseña numerica: ");
        password = keyboard.nextInt();
        if (password != 1234);
             System.out.println("La contraseña no es valida.");    
        }
        while (password != 1234);
    }  
}
