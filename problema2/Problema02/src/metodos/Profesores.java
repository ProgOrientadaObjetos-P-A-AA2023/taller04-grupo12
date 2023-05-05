/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author darav
 */
public class Profesores {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;
    
    public Profesores(double sueldob){
        sueldoBasico = sueldob;
    }
    
    public Profesores(String n, String a, double sb, int c){
        nombre = n;
        apellido = a;
        sueldoBasico = sb;
        cedula = c;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerApellido(String a) {
        nombre = a;
    }
    public void establecerSueldoBasico(double sb) {
        sueldoBasico = sb;
    }
    public void establecerCedula(int c) {
        cedula = c;
    }
    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public int obtenerCedula(){
        return cedula;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Nombre: %s\nApellido: %s\nSueldo Básico: %.2f\n"
                                                 +"Sueldo Total: %.2f\nCédula: %d\n", 
                                            nombre, 
                                            apellido, 
                                            sueldoBasico, 
                                            sueldoTotal, 
                                            cedula );
        return cadena;
    }
}

