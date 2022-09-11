/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea onjeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner (System.in);
        
        int numero1; // declaracion de variable, primer numero a sumar
        int numero2; // declaracion de variable, segundo numero a sumar
        int suma; // declaracion de variable, suma de numero1 y numero2
                
        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer numero del usuario
        
        System.out.print("Escriba el segundo entero: "); //Indicador
        numero2 = entrada.nextInt(); // lee el segundo numero del usuario
        
        suma = numero1 + numero2; // suma los numeros, despues almacena el total en suma
        
        System.out.println("La suma es " + suma); //muestra la suma
    }
    
}
