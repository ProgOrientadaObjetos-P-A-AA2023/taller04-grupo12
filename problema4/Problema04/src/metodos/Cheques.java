/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author darav
 */
public class Cheques {
    
    private String cliente;
    private String banco;
    private double valor;
    private double comision;

    public Cheques(String c) {
        cliente = c;
    }

    public Cheques(String c, String b, double v) {
        cliente = c;
        banco = b;
        valor = v;
    }
    // 

    public void establecerCliente(String c) {
        cliente = c;
    }

    public void establecerBanco(String b) {
        banco = b;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public void calcularComision() {
        comision = valor * 0.00003;
    }

    // Obtener
    public String obtenerCliente() {
        return cliente;
    }

    public String obtenertBanco() {
        return banco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                                      Nombre de cliente: %s
                                      Nombre del Banco: %s
                                      Valor del cheque: %.2f
                                      Comision: %.2f
                                      """, cliente,
                banco,
                valor,
                comision);

        return cadena;
    }
}
