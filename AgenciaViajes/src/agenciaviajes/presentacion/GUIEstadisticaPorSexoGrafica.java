/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.presentacion;


import agenciaviajes.negocio.GestorClientes;
import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import mvcf.AModel;
import mvcf.AView;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano Cuarto observador
 */
public class GUIEstadisticaPorSexoGrafica extends javax.swing.JFrame implements AView {

    /**
     * Constructor
     *
     * @param h horizontal position
     * @param v vertical position
     */
    public GUIEstadisticaPorSexoGrafica(int h, int v) {
        initComponents();
        this.setSize(320, 300);
        this.setLocation(h, v);
        this.setVisible(true);
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estadísticas");

        pnlTablero.setBackground(java.awt.Color.white);
        getContentPane().add(pnlTablero, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlTablero;
    // End of variables declaration//GEN-END:variables



    @Override
    public void actualizar(AModel amodel) {
        //Completar
    }
    
    //Completar
}
