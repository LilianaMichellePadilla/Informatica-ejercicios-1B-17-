/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner Entrada = new Scanner(System.in);
       System.out.println("Ingre el numero de meses: ");
       float NM = Entrada.nextFloat ();
       double precio, prima, descuento, deuda, cuota;
       if (NM >=1 && NM <=65){
           precio = 23000 * 1.13;
           descuento = 0;
           if (NM == 36){
               descuento = precio * 0.2;
               prima = (precio - descuento) * 0.15;
               deuda = (precio - descuento)-prima;
           } else {
               prima = precio * 015;
               deuda = precio - prima;   
           } 
           cuota = deuda / NM;
            System.out.println("Precio: " + precio);
            System.out.println("Descuento: " + descuento);
            System.out.println("Deuda: " + deuda);
            System.out.println("Couta: " + cuota);
         } else {    
               System.out.println("Lo siento corazon lea por favor");
                  
       }
    }
    
}
