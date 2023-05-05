/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author darav
 */
public class Estudiantes {

    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;


    public Estudiantes(){
        nombre = "Dara Van Gijsel";
    }
    
    public Estudiantes(String nom, double mat1, double mat2, double mat3){
         nombre = nom;
         materia1 = mat1;
         materia2 = mat2;
         materia3 = mat3;
    }
    
    public void establecerNombre(String nom){
        this.nombre = nom;
    }
    public void establecerMateria1(double mat1){
        this.materia1 = mat1;
    }
    public void establecerMateria2(double mat2){
        this.materia2 = mat2;
    }
    public void establecerMateria3(double mat3){
        this.materia3 = mat3;
    }
    public void calcularPromedio(){
        promedio = (materia1 + materia2 + materia3)/3;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    public double obtenerMateria1(){
        return materia1;
    }
    public double obtenerMateria2(){
        return materia2;
    }
    public double obtenerMateria3(){
        return materia3;
    }
    public double obtenerPromomedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("""
                                      Nombre: %s
                                      Materia Uno: %.2f
                                      Materia Dos: %.2f
                                      Materia Tres: %.2f
                                      Promedio Total: %.2f
                                      """, 
                                            nombre, 
                                            materia1, 
                                            materia2, 
                                            materia3, 
                                            promedio);
        return cadena;
    }
}