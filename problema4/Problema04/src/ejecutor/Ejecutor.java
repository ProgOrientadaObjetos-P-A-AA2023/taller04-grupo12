/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

import metodos.Cheques;

/**
 *
 * @author darav
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cheques cheque = new Cheques("Ronaldo Sanchez");
        Cheques cheque2 = new Cheques("Carlos Mejia", "Banco de Pichincha", 5000);
        cheque.establecerBanco("Banco de Loja");
        cheque.establecerValor(2009);
        cheque.calcularComision();
        cheque2.calcularComision();
        System.out.println("Imprimir Consturctor Uno");
        System.out.println(cheque);
        System.out.println("------------------------------------------");
        System.out.println("Imprimir Consturctor  Dos");
        System.out.println(cheque2);
    }

}
