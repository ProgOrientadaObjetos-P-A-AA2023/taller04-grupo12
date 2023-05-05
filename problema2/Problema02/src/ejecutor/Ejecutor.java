/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;
import metodos.Profesores;
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
        
        Profesores profe = new Profesores(600);
        Profesores profe2 = new Profesores("Juan", "Perez", 650, 110299530);
        
        profe.establecerNombre("Maria");
        profe.establecerApellido("Garcia");
        profe.establecerCedula(1102659646);
        profe.calcularSueldoTotal();
        profe2.calcularSueldoTotal();
        System.out.println("Imprimir Consturctor Uno");
        System.out.println(profe);
        System.out.println("------------------------------------------");
        System.out.println("Imprimir Consturctor  Dos");
        System.out.println(profe2);
        
    }
    
}
