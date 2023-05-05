/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author darav
 */
public class Automotores {

    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotores(String ced) {
        cedula = ced;
    }

    public Automotores(String ced, String m, int a, double valorV) {
        cedula = ced;
        marca = m;
        anio = a;
        valorVehiculo = valorV;
    }

// Establecer de cda variable 
    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerAnio(int a) {
        anio = a;
    }

    public void establecerValorVehiculo(double valorV) {
        valorVehiculo = valorV;
    }

    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo) * (2023 - anio);
    }
// Obtener de cada variable

    public String obtenerCedDuenio() {
        return cedula;
    }

    public String obtenertMarcaVehiculo() {
        return marca;
    }

    public int obtenerAnioFabricacion() {
        return anio;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                                      Cedula: %s
                                      Marca del Vehiculo: %s
                                      Año de Fabricacion: %d
                                      Valor del Vehiculo: %.2f
                                      Valor de la Matricula: %.2f
                                      """,
                cedula,
                marca,
                anio,
                valorVehiculo,
                valorMatricula);
        return cadena;

    }
}
