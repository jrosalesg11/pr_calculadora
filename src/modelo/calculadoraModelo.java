/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue_Rosales
 */
public class calculadoraModelo {
    private double resultado;
    private String operacion;
    private double ultimoNumero;
    private List<String> historial;

    public calculadoraModelo() {
        this.resultado = 0;
        this.operacion = "";
        this.ultimoNumero = 0;
        this.historial = new ArrayList<>();
    }

    public void calcular(double numero) {
        switch (this.operacion) {
            case "+":
                this.resultado += numero;
                break;
            case "-":
                this.resultado -= numero;
                break;
            case "*":
                this.resultado *= numero;
                break;
            case "/":
                if (numero != 0) {
                    this.resultado /= numero;
                } else {
                    this.resultado = 0; // Manejar la división por cero
                }
                break;
            default:
                this.resultado = numero;
        }
        this.historial.add(this.ultimoNumero + " " + this.operacion + " " + numero + " = " + this.resultado);
        this.ultimoNumero = numero;
        
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void reiniciar() {
        this.resultado = 0;
        this.operacion = "";
        this.ultimoNumero = 0;
        this.historial.clear();
    }

    public String getBitacora() {
        StringBuilder bitacora = new StringBuilder();
        for (String registro : this.historial) {
            bitacora.append(registro).append("\n");
        }
        return bitacora.toString();
    }
}
