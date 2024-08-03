/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.calculadoraModelo;
import vista.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class calculadoraControlador  {
    private final calculadoraModelo modelo;
    private final Calculadora vista;

    public calculadoraControlador(calculadoraModelo modelo, Calculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.getBtn_numero_uno().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_dos().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_tres().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_cuatro().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_cinco().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_seis().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_siete().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_ocho().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_nueve().addActionListener(new NumeroListener());
        this.vista.getBtn_numero_cero().addActionListener(new NumeroListener());
        this.vista.getBtn_punto().addActionListener(new NumeroListener());
        this.vista.getBtn_suma().addActionListener(new OperacionListener());
        this.vista.getBtn_resta().addActionListener(new OperacionListener());
        this.vista.getBtn_multiplicacion().addActionListener(new OperacionListener());
        this.vista.getBtn_division().addActionListener(new OperacionListener());
        this.vista.getBtn_igual().addActionListener(new IgualListener());
        this.vista.getMenu_opcion_nuevo().addActionListener(new NuevoListener());
        this.vista.getMenu_opcion_historial().addActionListener(new HistorialListener());
        this.vista.getMenu_opcion_ayuda().addActionListener(new AyudaListener());
        
    }

     class NumeroListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            vista.getTxt_operacion().setText(vista.getTxt_operacion().getText() + source.getText());
        }
    }

    class OperacionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            if (!vista.getTxt_operacion().getText().isEmpty()) {
                modelo.calcular(Double.parseDouble(vista.getTxt_operacion().getText()));
                modelo.setOperacion(source.getText());
                vista.getTxt_operacion().setText("");
            }
        }
    }

    class IgualListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!vista.getTxt_operacion().getText().isEmpty()) {
                modelo.calcular(Double.parseDouble(vista.getTxt_operacion().getText()));
                vista.getTxt_operacion().setText(String.valueOf(modelo.getResultado()));
                modelo.setOperacion(""); // Reiniciar la operación para la próxima vez
            }
        }
    }

    class NuevoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            modelo.reiniciar();
            vista.getTxt_operacion().setText("");
        }
    }

    class HistorialListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextArea areaHistorial = new JTextArea(modelo.getBitacora());
            JScrollPane scrollPane = new JScrollPane(areaHistorial);
            JFrame historialFrame = new JFrame("Historial");
            historialFrame.setSize(300, 200);
            historialFrame.add(scrollPane);
            historialFrame.setVisible(true);
            
            // Guardar el historial en un archivo de texto
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("historial.txt"))) {
                writer.write(modelo.getBitacora());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    class AyudaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextArea areaAyuda = new JTextArea();
            JScrollPane scrollPane = new JScrollPane(areaAyuda);
            JFrame ayudaFrame = new JFrame("Ayuda");
            ayudaFrame.setSize(300, 200);
            ayudaFrame.add(scrollPane);
            ayudaFrame.setVisible(true);

            // Leer el archivo de ayuda y mostrarlo en el área de texto
            try {
                java.nio.file.Path path = java.nio.file.Paths.get("ayuda.txt");
                String ayudaTexto = java.nio.file.Files.readString(path);
                areaAyuda.setText(ayudaTexto);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
