/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package vista;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Josue_Rosales
 */
public class Calculadora extends JFrame  {

    
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Panel para botones numéricos y de operación
        JPanel panelBotones = new JPanel(new GridLayout(4, 4));
        btn_numero_uno = new JButton("1");
        btn_numero_dos = new JButton("2");
        btn_numero_tres = new JButton("3");
        btn_suma = new JButton("+");
        btn_numero_cuatro = new JButton("4");
        btn_numero_cinco = new JButton("5");
        btn_numero_seis = new JButton("6");
        btn_resta = new JButton("-");
        btn_numero_siete = new JButton("7");
        btn_numero_ocho = new JButton("8");
        btn_numero_nueve = new JButton("9");
        btn_multiplicacion = new JButton("*");
        btn_numero_cero = new JButton("0");
        btn_punto = new JButton(".");
        btn_igual = new JButton("=");
        btn_division = new JButton("/");

        panelBotones.add(btn_numero_uno);
        panelBotones.add(btn_numero_dos);
        panelBotones.add(btn_numero_tres);
        panelBotones.add(btn_suma);
        panelBotones.add(btn_numero_cuatro);
        panelBotones.add(btn_numero_cinco);
        panelBotones.add(btn_numero_seis);
        panelBotones.add(btn_resta);
        panelBotones.add(btn_numero_siete);
        panelBotones.add(btn_numero_ocho);
        panelBotones.add(btn_numero_nueve);
        panelBotones.add(btn_multiplicacion);
        panelBotones.add(btn_numero_cero);
        panelBotones.add(btn_punto);
        panelBotones.add(btn_igual);
        panelBotones.add(btn_division);

        // Campo de texto para mostrar la operación
        txt_operacion = new JTextField();
        add(txt_operacion, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        
        // Menú de opciones
        menu_principal = new JMenuBar();
        JMenu menuArchivo = new JMenu("Opciones");
        menu_opcion_nuevo = new JMenuItem("Nuevo");
        menu_opcion_historial = new JMenuItem("Historial");
        menu_opcion_ayuda = new JMenuItem("Ayuda");
        
        menuArchivo.add(menu_opcion_nuevo);
        menuArchivo.add(menu_opcion_historial);
        menuArchivo.add(menu_opcion_ayuda);
        
        menu_principal.add(menuArchivo);
        setJMenuBar(menu_principal);       
    }

    // Métodos getter y setter para los componentes
    public javax.swing.JButton getBtn_division() {
        return btn_division;
    }

    public void setBtn_division(javax.swing.JButton btn_division) {
        this.btn_division = btn_division;
    }

    public javax.swing.JButton getBtn_igual() {
        return btn_igual;
    }

    public void setBtn_igual(javax.swing.JButton btn_igual) {
        this.btn_igual = btn_igual;
    }

    public javax.swing.JButton getBtn_multiplicacion() {
        return btn_multiplicacion;
    }

    public void setBtn_multiplicacion(javax.swing.JButton btn_multiplicacion) {
        this.btn_multiplicacion = btn_multiplicacion;
    }

    public javax.swing.JButton getBtn_numero_cero() {
        return btn_numero_cero;
    }

    public void setBtn_numero_cero(javax.swing.JButton btn_numero_cero) {
        this.btn_numero_cero = btn_numero_cero;
    }

    public javax.swing.JButton getBtn_numero_cinco() {
        return btn_numero_cinco;
    }

    public void setBtn_numero_cinco(javax.swing.JButton btn_numero_cinco) {
        this.btn_numero_cinco = btn_numero_cinco;
    }

    public javax.swing.JButton getBtn_numero_cuatro() {
        return btn_numero_cuatro;
    }

    public void setBtn_numero_cuatro(javax.swing.JButton btn_numero_cuatro) {
        this.btn_numero_cuatro = btn_numero_cuatro;
    }

    public javax.swing.JButton getBtn_numero_dos() {
        return btn_numero_dos;
    }

    public void setBtn_numero_dos(javax.swing.JButton btn_numero_dos) {
        this.btn_numero_dos = btn_numero_dos;
    }

    public javax.swing.JButton getBtn_numero_nueve() {
        return btn_numero_nueve;
    }

    public void setBtn_numero_nueve(javax.swing.JButton btn_numero_nueve) {
        this.btn_numero_nueve = btn_numero_nueve;
    }

    public javax.swing.JButton getBtn_numero_ocho() {
        return btn_numero_ocho;
    }

    public void setBtn_numero_ocho(javax.swing.JButton btn_numero_ocho) {
        this.btn_numero_ocho = btn_numero_ocho;
    }

    public javax.swing.JButton getBtn_numero_seis() {
        return btn_numero_seis;
    }

    public void setBtn_numero_seis(javax.swing.JButton btn_numero_seis) {
        this.btn_numero_seis = btn_numero_seis;
    }

    public javax.swing.JButton getBtn_numero_siete() {
        return btn_numero_siete;
    }

    public void setBtn_numero_siete(javax.swing.JButton btn_numero_siete) {
        this.btn_numero_siete = btn_numero_siete;
    }

    public javax.swing.JButton getBtn_numero_tres() {
        return btn_numero_tres;
    }

    public void setBtn_numero_tres(javax.swing.JButton btn_numero_tres) {
        this.btn_numero_tres = btn_numero_tres;
    }

    public javax.swing.JButton getBtn_numero_uno() {
        return btn_numero_uno;
    }

    public void setBtn_numero_uno(javax.swing.JButton btn_numero_uno) {
        this.btn_numero_uno = btn_numero_uno;
    }

    public javax.swing.JButton getBtn_punto() {
        return btn_punto;
    }

    public void setBtn_punto(javax.swing.JButton btn_punto) {
        this.btn_punto = btn_punto;
    }

    public javax.swing.JButton getBtn_resta() {
        return btn_resta;
    }

    public void setBtn_resta(javax.swing.JButton btn_resta) {
        this.btn_resta = btn_resta;
    }

    public javax.swing.JButton getBtn_suma() {
        return btn_suma;
    }

    public void setBtn_suma(javax.swing.JButton btn_suma) {
        this.btn_suma = btn_suma;
    }

    public javax.swing.JMenu getMenu_ayuda() {
        return menu_ayuda;
    }

    public void setMenu_ayuda(javax.swing.JMenu menu_ayuda) {
        this.menu_ayuda = menu_ayuda;
    }
    public javax.swing.JMenuItem getMenu_opcion_ayuda() {
        return menu_opcion_ayuda;
    }
    public javax.swing.JMenuItem getMenu_opcion_historial() {
        return menu_opcion_historial;
    }

    public void setMenu_opcion_historial(javax.swing.JMenuItem menu_opcion_historial) {
        this.menu_opcion_historial = menu_opcion_historial;
    }

    public javax.swing.JMenuItem getMenu_opcion_nuevo() {
        return menu_opcion_nuevo;
    }

    public void setMenu_opcion_nuevo(javax.swing.JMenuItem menu_opcion_nuevo) {
        this.menu_opcion_nuevo = menu_opcion_nuevo;
    }

    public javax.swing.JMenu getMenu_opciones() {
        return menu_opciones;
    }

    public void setMenu_opciones(javax.swing.JMenu menu_opciones) {
        this.menu_opciones = menu_opciones;
    }

    public javax.swing.JMenuBar getMenu_principal() {
        return menu_principal;
    }

    public void setMenu_principal(javax.swing.JMenuBar menu_principal) {
        this.menu_principal = menu_principal;
    }
    public void setMenu_opcion_ayuda(javax.swing.JMenuItem menu_opcion_ayuda) {
        this.menu_opcion_ayuda = menu_opcion_ayuda;
    }
    public javax.swing.JTextField getTxt_operacion() {
        return txt_operacion;
    }

    public void setTxt_operacion(javax.swing.JTextField txt_operacion) {
        this.txt_operacion = txt_operacion;
    }
    public JTextField getTxtOperacion() {
        return txt_operacion;
    }

    public JButton getBtnNumeroUno() {
        return btn_numero_uno;
    }

    public JButton getBtnNumeroDos() {
        return btn_numero_dos;
    }

    public JButton getBtnNumeroTres() {
        return btn_numero_tres;
    }

    public JButton getBtnSuma() {
        return btn_suma;
    }

    public JButton getBtnNumeroCuatro() {
        return btn_numero_cuatro;
    }

    public JButton getBtnNumeroCinco() {
        return btn_numero_cinco;
    }

    public JButton getBtnNumeroSeis() {
        return btn_numero_seis;
    }

    public JButton getBtnResta() {
        return btn_resta;
    }

    public JButton getBtnNumeroSiete() {
        return btn_numero_siete;
    }

    public JButton getBtnNumeroOcho() {
        return btn_numero_ocho;
    }

    public JButton getBtnNumeroNueve() {
        return btn_numero_nueve;
    }

    public JButton getBtnMultiplicacion() {
        return btn_multiplicacion;
    }

    public JButton getBtnNumeroCero() {
        return btn_numero_cero;
    }

    public JButton getBtnPunto() {
        return btn_punto;
    }

    public JButton getBtnIgual() {
        return btn_igual;
    }

    public JButton getBtnDivision() {
        return btn_division;
    }

    public JMenuItem getMenuNuevo() {
        return menu_opcion_nuevo;
    }
    
    public JMenuItem getMenuHistorial() {
        return menu_opcion_historial;
    }
    public JMenuItem getMenuAyuda() {
        return menu_ayuda;
    }
    public JMenuItem getMenuOpcionAyuda() {
        return menu_opcion_ayuda;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_operacion = new javax.swing.JTextField();
        btn_numero_uno = new javax.swing.JButton();
        btn_numero_dos = new javax.swing.JButton();
        btn_numero_tres = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_numero_cuatro = new javax.swing.JButton();
        btn_numero_cinco = new javax.swing.JButton();
        btn_numero_seis = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_numero_siete = new javax.swing.JButton();
        btn_numero_ocho = new javax.swing.JButton();
        btn_numero_nueve = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_numero_cero = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        menu_principal = new javax.swing.JMenuBar();
        menu_opciones = new javax.swing.JMenu();
        menu_opcion_nuevo = new javax.swing.JMenuItem();
        menu_opcion_historial = new javax.swing.JMenuItem();
        menu_ayuda = new javax.swing.JMenu();
        menu_opcion_ayuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_numero_uno.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_uno.setText("1");

        btn_numero_dos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_dos.setText("2");

        btn_numero_tres.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_tres.setText("3");

        btn_suma.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_suma.setText("+");

        btn_numero_cuatro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_cuatro.setText("4");

        btn_numero_cinco.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_cinco.setText("5");

        btn_numero_seis.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_seis.setText("6");

        btn_resta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_resta.setText("-");

        btn_numero_siete.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_siete.setText("7");

        btn_numero_ocho.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_ocho.setText("8");

        btn_numero_nueve.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_nueve.setText("9");

        btn_multiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_multiplicacion.setText("*");

        btn_numero_cero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_numero_cero.setText("0");

        btn_punto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_punto.setText(".");

        btn_igual.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_igual.setText("=");

        btn_division.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_division.setText("/");

        menu_opciones.setText("Opciones");

        menu_opcion_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        menu_opcion_nuevo.setText("Nuevo");
        menu_opciones.add(menu_opcion_nuevo);

        menu_opcion_historial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, 0));
        menu_opcion_historial.setText("Historial");
        menu_opciones.add(menu_opcion_historial);

        menu_principal.add(menu_opciones);

        menu_ayuda.setText("Ayuda");
        menu_ayuda.setToolTipText("");

        menu_opcion_ayuda.setText("Ayuda");
        menu_ayuda.add(menu_opcion_ayuda);

        menu_principal.add(menu_ayuda);

        setJMenuBar(menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_numero_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_numero_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_numero_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_numero_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_numero_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_numero_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_numero_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_numero_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_numero_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_numero_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_numero_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_numero_cero;
    private javax.swing.JButton btn_numero_cinco;
    private javax.swing.JButton btn_numero_cuatro;
    private javax.swing.JButton btn_numero_dos;
    private javax.swing.JButton btn_numero_nueve;
    private javax.swing.JButton btn_numero_ocho;
    private javax.swing.JButton btn_numero_seis;
    private javax.swing.JButton btn_numero_siete;
    private javax.swing.JButton btn_numero_tres;
    private javax.swing.JButton btn_numero_uno;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenuItem menu_opcion_ayuda;
    private javax.swing.JMenuItem menu_opcion_historial;
    private javax.swing.JMenuItem menu_opcion_nuevo;
    private javax.swing.JMenu menu_opciones;
    private javax.swing.JMenuBar menu_principal;
    private javax.swing.JTextField txt_operacion;
    // End of variables declaration//GEN-END:variables
    
}
