/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;
import metodos.Estudiantes; 
/**
 *
 * @author darav
 */
public class Ejecutor {
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes estudiante1 = new Estudiantes();
        Estudiantes estudiante2 = new Estudiantes("Dara Van Gijsel", 7.5, 9.5, 8);
       estudiante1.establecerNombre("Sofia Vire");
       estudiante1.establecerMateria1(9.3);
       estudiante1.establecerMateria2(9);
       estudiante1.establecerMateria3(9.8);
       estudiante1.calcularPromedio();
       estudiante2.calcularPromedio();
       System.out.println("Imprimir Consturctor Uno");
       System.out.println(estudiante1);
       System.out.println("------------------------------------------");
       System.out.println("Imprimir Consturctor  Dos");
      System.out.println(estudiante2);
        
    }
    
}
