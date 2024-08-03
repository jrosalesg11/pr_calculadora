/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.calculadoraModelo;
import vista.Calculadora;
import controlador.calculadoraControlador;
/**
 *
 * @author Josue_Rosales
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculadoraModelo modelo = new calculadoraModelo();
        Calculadora vista = new Calculadora();
        calculadoraControlador controlador = new calculadoraControlador(modelo, vista);
        
        vista.setVisible(true);
    }
    
}
