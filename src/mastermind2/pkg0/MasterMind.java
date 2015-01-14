/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind2.pkg0;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.time.StopWatch;

/**
 *
 * @author Manuel Cañamaque
 */
public class MasterMind extends javax.swing.JFrame {

    Color color = Color.white;
    String contraseña;
    JLabel[] secuencia_Contraseña = new JLabel[8];
    Random rnd = new Random();
    int dificultad;
    int fila = 0;
    long puntuacion;
    
    //Clases para el contar el tiempo transcurrido
    StopWatch reloj = new StopWatch();
    DurationFormatUtils formato = new DurationFormatUtils();
    
    //Declaramos los arrays
    JLabel[] secuencia;
    JLabel[] fila1, fila2, fila3, fila4, fila5, fila6, fila7,
            fila8, fila9, fila10, fila11, fila12;
    JCheckBox[] comprobar1, comprobar2, comprobar3, comprobar4,
            comprobar5, comprobar6, comprobar7, comprobar8,
            comprobar9, comprobar10, comprobar11, comprobar12;

    /**
     * Creates new form MasterMindHardcore
     *
     * @param dificultad
     */
    public MasterMind(int dificultad) {
        initComponents();

        //Definimos todos los arrays
        JLabel[] secuencia = {c1, c2, c3, c4, c5, c6, c7, c8};

        this.secuencia = secuencia;

        JLabel[] fila1 = {f1c1, f1c2, f1c3, f1c4, f1c5, f1c6, f1c7, f1c8};
        JLabel[] fila2 = {f2c1, f2c2, f2c3, f2c4, f2c5, f2c6, f2c7, f2c8};
        JLabel[] fila3 = {f3c1, f3c2, f3c3, f3c4, f3c5, f3c6, f3c7, f3c8};
        JLabel[] fila4 = {f4c1, f4c2, f4c3, f4c4, f4c5, f4c6, f4c7, f4c8};
        JLabel[] fila5 = {f5c1, f5c2, f5c3, f5c4, f5c5, f5c6, f5c7, f5c8};
        JLabel[] fila6 = {f6c1, f6c2, f6c3, f6c4, f6c5, f6c6, f6c7, f6c8};
        JLabel[] fila7 = {f7c1, f7c2, f7c3, f7c4, f7c5, f7c6, f7c7, f7c8};
        JLabel[] fila8 = {f8c1, f8c2, f8c3, f8c4, f8c5, f8c6, f8c7, f8c8};
        JLabel[] fila9 = {f9c1, f9c2, f9c3, f9c4, f9c5, f9c6, f9c7, f9c8};
        JLabel[] fila10 = {f10c1, f10c2, f10c3, f10c4, f10c5, f10c6, f10c7, f10c8};
        JLabel[] fila11 = {f11c1, f11c2, f11c3, f11c4, f11c5, f11c6, f11c7, f11c8};
        JLabel[] fila12 = {f12c1, f12c2, f12c3, f12c4, f12c5, f12c6, f12c7, f12c8};

        this.fila1 = fila1;
        this.fila2 = fila2;
        this.fila3 = fila3;
        this.fila4 = fila4;
        this.fila5 = fila5;
        this.fila6 = fila6;
        this.fila7 = fila7;
        this.fila8 = fila8;
        this.fila9 = fila9;
        this.fila10 = fila10;
        this.fila11 = fila11;
        this.fila12 = fila12;

        JCheckBox[] comprobar1 = {cbf1c1, cbf1c2, cbf1c3, cbf1c4, cbf1c5, cbf1c6, cbf1c7, cbf1c8};
        JCheckBox[] comprobar2 = {cbf2c1, cbf2c2, cbf2c3, cbf2c4, cbf2c5, cbf2c6, cbf2c7, cbf2c8};
        JCheckBox[] comprobar3 = {cbf3c1, cbf3c2, cbf3c3, cbf3c4, cbf3c5, cbf3c6, cbf3c7, cbf3c8};
        JCheckBox[] comprobar4 = {cbf4c1, cbf4c2, cbf4c3, cbf4c4, cbf4c5, cbf4c6, cbf4c7, cbf4c8};
        JCheckBox[] comprobar5 = {cbf5c1, cbf5c2, cbf5c3, cbf5c4, cbf5c5, cbf5c6, cbf5c7, cbf5c8};
        JCheckBox[] comprobar6 = {cbf6c1, cbf6c2, cbf6c3, cbf6c4, cbf6c5, cbf6c6, cbf6c7, cbf6c8};
        JCheckBox[] comprobar7 = {cbf7c1, cbf7c2, cbf7c3, cbf7c4, cbf7c5, cbf7c6, cbf7c7, cbf7c8};
        JCheckBox[] comprobar8 = {cbf8c1, cbf8c2, cbf8c3, cbf8c4, cbf8c5, cbf8c6, cbf8c7, cbf8c8};
        JCheckBox[] comprobar9 = {cbf9c1, cbf9c2, cbf9c3, cbf9c4, cbf9c5, cbf9c6, cbf9c7, cbf9c8};
        JCheckBox[] comprobar10 = {cbf10c1, cbf10c2, cbf10c3, cbf10c4, cbf10c5, cbf10c6, cbf10c7, cbf10c8};
        JCheckBox[] comprobar11 = {cbf11c1, cbf11c2, cbf11c3, cbf11c4, cbf11c5, cbf11c6, cbf11c7, cbf11c8};
        JCheckBox[] comprobar12 = {cbf12c1, cbf12c2, cbf12c3, cbf12c4, cbf12c5, cbf12c6, cbf12c7, cbf12c8};

        this.comprobar1 = comprobar1;
        this.comprobar2 = comprobar2;
        this.comprobar3 = comprobar3;
        this.comprobar4 = comprobar4;
        this.comprobar5 = comprobar5;
        this.comprobar6 = comprobar6;
        this.comprobar7 = comprobar7;
        this.comprobar8 = comprobar8;
        this.comprobar9 = comprobar9;
        this.comprobar10 = comprobar10;
        this.comprobar11 = comprobar11;
        this.comprobar12 = comprobar12;

        //Obtenemos la dificultad y iniciamos la ventana       
        for (int i = 0; i < 8; i++) {
            secuencia[i].setVisible(false);
        }
        this.dificultad = dificultad;
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icon.png")).getImage());
        if (dificultad == 4) {
            this.setSize(382, 600);
        }
        iniciarPartida();
        setInvisibles(dificultad);
        deshabilitarTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        f1c1 = new javax.swing.JLabel();
        f1c2 = new javax.swing.JLabel();
        f1c3 = new javax.swing.JLabel();
        f1c4 = new javax.swing.JLabel();
        f1c5 = new javax.swing.JLabel();
        f1c6 = new javax.swing.JLabel();
        f1c7 = new javax.swing.JLabel();
        f1c8 = new javax.swing.JLabel();
        cbf1c1 = new javax.swing.JCheckBox();
        cbf1c3 = new javax.swing.JCheckBox();
        cbf1c5 = new javax.swing.JCheckBox();
        cbf1c7 = new javax.swing.JCheckBox();
        cbf1c2 = new javax.swing.JCheckBox();
        cbf1c4 = new javax.swing.JCheckBox();
        cbf1c6 = new javax.swing.JCheckBox();
        cbf1c8 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        cyan = new javax.swing.JToggleButton();
        magenta = new javax.swing.JToggleButton();
        naranja = new javax.swing.JToggleButton();
        rosa = new javax.swing.JToggleButton();
        rojo = new javax.swing.JToggleButton();
        amarillo = new javax.swing.JToggleButton();
        verde = new javax.swing.JToggleButton();
        azul = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        boton_Iniciar = new javax.swing.JButton();
        boton_Reiniciar = new javax.swing.JButton();
        boton_Comprobar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        f2c2 = new javax.swing.JLabel();
        f2c1 = new javax.swing.JLabel();
        f2c3 = new javax.swing.JLabel();
        f2c4 = new javax.swing.JLabel();
        f2c5 = new javax.swing.JLabel();
        f2c6 = new javax.swing.JLabel();
        f2c7 = new javax.swing.JLabel();
        f2c8 = new javax.swing.JLabel();
        cbf2c1 = new javax.swing.JCheckBox();
        cbf2c3 = new javax.swing.JCheckBox();
        cbf2c5 = new javax.swing.JCheckBox();
        cbf2c7 = new javax.swing.JCheckBox();
        cbf2c8 = new javax.swing.JCheckBox();
        cbf2c6 = new javax.swing.JCheckBox();
        cbf2c4 = new javax.swing.JCheckBox();
        cbf2c2 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        f3c1 = new javax.swing.JLabel();
        f3c2 = new javax.swing.JLabel();
        f3c3 = new javax.swing.JLabel();
        f3c4 = new javax.swing.JLabel();
        f3c5 = new javax.swing.JLabel();
        f3c6 = new javax.swing.JLabel();
        f3c7 = new javax.swing.JLabel();
        f3c8 = new javax.swing.JLabel();
        cbf3c1 = new javax.swing.JCheckBox();
        cbf3c2 = new javax.swing.JCheckBox();
        cbf3c4 = new javax.swing.JCheckBox();
        cbf3c3 = new javax.swing.JCheckBox();
        cbf3c5 = new javax.swing.JCheckBox();
        cbf3c6 = new javax.swing.JCheckBox();
        cbf3c8 = new javax.swing.JCheckBox();
        cbf3c7 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        f4c8 = new javax.swing.JLabel();
        f4c7 = new javax.swing.JLabel();
        f4c6 = new javax.swing.JLabel();
        f4c5 = new javax.swing.JLabel();
        f4c4 = new javax.swing.JLabel();
        f4c3 = new javax.swing.JLabel();
        f4c2 = new javax.swing.JLabel();
        f4c1 = new javax.swing.JLabel();
        cbf4c1 = new javax.swing.JCheckBox();
        cbf4c2 = new javax.swing.JCheckBox();
        cbf4c4 = new javax.swing.JCheckBox();
        cbf4c3 = new javax.swing.JCheckBox();
        cbf4c5 = new javax.swing.JCheckBox();
        cbf4c6 = new javax.swing.JCheckBox();
        cbf4c8 = new javax.swing.JCheckBox();
        cbf4c7 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        f5c1 = new javax.swing.JLabel();
        f5c2 = new javax.swing.JLabel();
        f5c3 = new javax.swing.JLabel();
        f5c4 = new javax.swing.JLabel();
        f5c5 = new javax.swing.JLabel();
        f5c6 = new javax.swing.JLabel();
        f5c7 = new javax.swing.JLabel();
        f5c8 = new javax.swing.JLabel();
        cbf5c1 = new javax.swing.JCheckBox();
        cbf5c2 = new javax.swing.JCheckBox();
        cbf5c4 = new javax.swing.JCheckBox();
        cbf5c3 = new javax.swing.JCheckBox();
        cbf5c5 = new javax.swing.JCheckBox();
        cbf5c6 = new javax.swing.JCheckBox();
        cbf5c8 = new javax.swing.JCheckBox();
        cbf5c7 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        f6c1 = new javax.swing.JLabel();
        f6c2 = new javax.swing.JLabel();
        f6c3 = new javax.swing.JLabel();
        f6c4 = new javax.swing.JLabel();
        f6c5 = new javax.swing.JLabel();
        f6c6 = new javax.swing.JLabel();
        f6c7 = new javax.swing.JLabel();
        f6c8 = new javax.swing.JLabel();
        cbf6c1 = new javax.swing.JCheckBox();
        cbf6c2 = new javax.swing.JCheckBox();
        cbf6c4 = new javax.swing.JCheckBox();
        cbf6c3 = new javax.swing.JCheckBox();
        cbf6c5 = new javax.swing.JCheckBox();
        cbf6c6 = new javax.swing.JCheckBox();
        cbf6c8 = new javax.swing.JCheckBox();
        cbf6c7 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        f7c2 = new javax.swing.JLabel();
        f7c3 = new javax.swing.JLabel();
        f7c4 = new javax.swing.JLabel();
        f7c5 = new javax.swing.JLabel();
        f7c6 = new javax.swing.JLabel();
        f7c7 = new javax.swing.JLabel();
        f7c8 = new javax.swing.JLabel();
        cbf7c1 = new javax.swing.JCheckBox();
        cbf7c2 = new javax.swing.JCheckBox();
        cbf7c4 = new javax.swing.JCheckBox();
        cbf7c3 = new javax.swing.JCheckBox();
        cbf7c5 = new javax.swing.JCheckBox();
        cbf7c6 = new javax.swing.JCheckBox();
        cbf7c8 = new javax.swing.JCheckBox();
        cbf7c7 = new javax.swing.JCheckBox();
        f7c1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        f8c1 = new javax.swing.JLabel();
        f8c2 = new javax.swing.JLabel();
        f8c3 = new javax.swing.JLabel();
        f8c4 = new javax.swing.JLabel();
        f8c5 = new javax.swing.JLabel();
        f8c6 = new javax.swing.JLabel();
        f8c7 = new javax.swing.JLabel();
        f8c8 = new javax.swing.JLabel();
        cbf8c1 = new javax.swing.JCheckBox();
        cbf8c2 = new javax.swing.JCheckBox();
        cbf8c4 = new javax.swing.JCheckBox();
        cbf8c3 = new javax.swing.JCheckBox();
        cbf8c5 = new javax.swing.JCheckBox();
        cbf8c6 = new javax.swing.JCheckBox();
        cbf8c8 = new javax.swing.JCheckBox();
        cbf8c7 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        f9c1 = new javax.swing.JLabel();
        f9c2 = new javax.swing.JLabel();
        f9c3 = new javax.swing.JLabel();
        f9c4 = new javax.swing.JLabel();
        f9c5 = new javax.swing.JLabel();
        f9c6 = new javax.swing.JLabel();
        f9c7 = new javax.swing.JLabel();
        f9c8 = new javax.swing.JLabel();
        cbf9c1 = new javax.swing.JCheckBox();
        cbf9c2 = new javax.swing.JCheckBox();
        cbf9c4 = new javax.swing.JCheckBox();
        cbf9c3 = new javax.swing.JCheckBox();
        cbf9c5 = new javax.swing.JCheckBox();
        cbf9c6 = new javax.swing.JCheckBox();
        cbf9c8 = new javax.swing.JCheckBox();
        cbf9c7 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        f10c1 = new javax.swing.JLabel();
        f10c2 = new javax.swing.JLabel();
        f10c3 = new javax.swing.JLabel();
        f10c4 = new javax.swing.JLabel();
        f10c5 = new javax.swing.JLabel();
        f10c6 = new javax.swing.JLabel();
        f10c7 = new javax.swing.JLabel();
        f10c8 = new javax.swing.JLabel();
        cbf10c1 = new javax.swing.JCheckBox();
        cbf10c2 = new javax.swing.JCheckBox();
        cbf10c4 = new javax.swing.JCheckBox();
        cbf10c3 = new javax.swing.JCheckBox();
        cbf10c5 = new javax.swing.JCheckBox();
        cbf10c6 = new javax.swing.JCheckBox();
        cbf10c8 = new javax.swing.JCheckBox();
        cbf10c7 = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        f11c1 = new javax.swing.JLabel();
        f11c2 = new javax.swing.JLabel();
        f11c3 = new javax.swing.JLabel();
        f11c4 = new javax.swing.JLabel();
        f11c5 = new javax.swing.JLabel();
        f11c6 = new javax.swing.JLabel();
        f11c7 = new javax.swing.JLabel();
        f11c8 = new javax.swing.JLabel();
        cbf11c1 = new javax.swing.JCheckBox();
        cbf11c2 = new javax.swing.JCheckBox();
        cbf11c4 = new javax.swing.JCheckBox();
        cbf11c3 = new javax.swing.JCheckBox();
        cbf11c5 = new javax.swing.JCheckBox();
        cbf11c6 = new javax.swing.JCheckBox();
        cbf11c8 = new javax.swing.JCheckBox();
        cbf11c7 = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        f12c1 = new javax.swing.JLabel();
        f12c2 = new javax.swing.JLabel();
        f12c3 = new javax.swing.JLabel();
        f12c4 = new javax.swing.JLabel();
        f12c5 = new javax.swing.JLabel();
        f12c6 = new javax.swing.JLabel();
        f12c7 = new javax.swing.JLabel();
        f12c8 = new javax.swing.JLabel();
        cbf12c2 = new javax.swing.JCheckBox();
        cbf12c1 = new javax.swing.JCheckBox();
        cbf12c3 = new javax.swing.JCheckBox();
        cbf12c4 = new javax.swing.JCheckBox();
        cbf12c6 = new javax.swing.JCheckBox();
        cbf12c5 = new javax.swing.JCheckBox();
        cbf12c7 = new javax.swing.JCheckBox();
        cbf12c8 = new javax.swing.JCheckBox();
        jPanel17 = new javax.swing.JPanel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MasterMind");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        f1c1.setBackground(java.awt.Color.white);
        f1c1.setAlignmentX(0.5F);
        f1c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c1.setOpaque(true);
        f1c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c1MousePressed(evt);
            }
        });

        f1c2.setBackground(java.awt.Color.white);
        f1c2.setAlignmentX(0.5F);
        f1c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c2.setOpaque(true);
        f1c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c2MousePressed(evt);
            }
        });

        f1c3.setBackground(java.awt.Color.white);
        f1c3.setAlignmentX(0.5F);
        f1c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c3.setOpaque(true);
        f1c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c3MousePressed(evt);
            }
        });

        f1c4.setBackground(java.awt.Color.white);
        f1c4.setAlignmentX(0.5F);
        f1c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c4.setOpaque(true);
        f1c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c4MousePressed(evt);
            }
        });

        f1c5.setBackground(java.awt.Color.white);
        f1c5.setAlignmentX(0.5F);
        f1c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c5.setOpaque(true);
        f1c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c5MousePressed(evt);
            }
        });

        f1c6.setBackground(java.awt.Color.white);
        f1c6.setAlignmentX(0.5F);
        f1c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c6.setOpaque(true);
        f1c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c6MousePressed(evt);
            }
        });

        f1c7.setBackground(java.awt.Color.white);
        f1c7.setAlignmentX(0.5F);
        f1c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c7.setOpaque(true);
        f1c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c7MousePressed(evt);
            }
        });

        f1c8.setBackground(java.awt.Color.white);
        f1c8.setAlignmentX(0.5F);
        f1c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f1c8.setEnabled(false);
        f1c8.setOpaque(true);
        f1c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1c8MousePressed(evt);
            }
        });

        cbf1c1.setEnabled(false);

        cbf1c3.setEnabled(false);

        cbf1c5.setEnabled(false);

        cbf1c7.setEnabled(false);

        cbf1c2.setEnabled(false);

        cbf1c4.setEnabled(false);

        cbf1c6.setEnabled(false);

        cbf1c8.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(f1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbf1c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf1c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf1c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf1c7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbf1c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf1c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf1c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf1c8)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f1c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(cbf1c2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbf1c1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(cbf1c4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbf1c3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(cbf1c6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbf1c5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(cbf1c8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbf1c7))
        );

        cyan.setBackground(java.awt.Color.cyan);
        cyan.setBorder(new javax.swing.border.MatteBorder(null));
        cyan.setBorderPainted(false);
        cyan.setPreferredSize(new java.awt.Dimension(40, 40));
        cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanActionPerformed(evt);
            }
        });

        magenta.setBackground(java.awt.Color.magenta);
        magenta.setForeground(java.awt.Color.lightGray);
        magenta.setBorder(new javax.swing.border.MatteBorder(null));
        magenta.setBorderPainted(false);
        magenta.setPreferredSize(new java.awt.Dimension(40, 40));
        magenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magentaActionPerformed(evt);
            }
        });

        naranja.setBackground(java.awt.Color.orange);
        naranja.setForeground(java.awt.Color.lightGray);
        naranja.setBorder(new javax.swing.border.MatteBorder(null));
        naranja.setBorderPainted(false);
        naranja.setPreferredSize(new java.awt.Dimension(40, 40));
        naranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naranjaActionPerformed(evt);
            }
        });

        rosa.setBackground(java.awt.Color.pink);
        rosa.setForeground(java.awt.Color.lightGray);
        rosa.setBorder(new javax.swing.border.MatteBorder(null));
        rosa.setBorderPainted(false);
        rosa.setPreferredSize(new java.awt.Dimension(40, 40));
        rosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rosaActionPerformed(evt);
            }
        });

        rojo.setBackground(java.awt.Color.red);
        rojo.setForeground(java.awt.Color.lightGray);
        rojo.setBorder(new javax.swing.border.MatteBorder(null));
        rojo.setBorderPainted(false);
        rojo.setPreferredSize(new java.awt.Dimension(40, 40));
        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });

        amarillo.setBackground(java.awt.Color.yellow);
        amarillo.setForeground(java.awt.Color.lightGray);
        amarillo.setBorder(new javax.swing.border.MatteBorder(null));
        amarillo.setBorderPainted(false);
        amarillo.setPreferredSize(new java.awt.Dimension(40, 40));
        amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloActionPerformed(evt);
            }
        });

        verde.setBackground(java.awt.Color.green);
        verde.setForeground(java.awt.Color.lightGray);
        verde.setBorder(new javax.swing.border.MatteBorder(null));
        verde.setBorderPainted(false);
        verde.setPreferredSize(new java.awt.Dimension(40, 40));
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });

        azul.setBackground(java.awt.Color.blue);
        azul.setForeground(java.awt.Color.lightGray);
        azul.setBorder(new javax.swing.border.MatteBorder(null));
        azul.setBorderPainted(false);
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(azul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cyan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(magenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(naranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rosa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(magenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cyan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(azul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amarillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        boton_Iniciar.setText("Iniciar Juego");
        boton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_IniciarActionPerformed(evt);
            }
        });

        boton_Reiniciar.setText("Reiniciar Juego");
        boton_Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ReiniciarActionPerformed(evt);
            }
        });

        boton_Comprobar.setText("Comprobar");
        boton_Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ComprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_Comprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_Reiniciar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_Iniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_Comprobar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_Reiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_Iniciar)
                .addContainerGap())
        );

        f2c2.setBackground(java.awt.Color.white);
        f2c2.setAlignmentX(0.5F);
        f2c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c2.setOpaque(true);
        f2c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c2MousePressed(evt);
            }
        });

        f2c1.setBackground(java.awt.Color.white);
        f2c1.setAlignmentX(0.5F);
        f2c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c1.setOpaque(true);
        f2c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c1MousePressed(evt);
            }
        });

        f2c3.setBackground(java.awt.Color.white);
        f2c3.setAlignmentX(0.5F);
        f2c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c3.setOpaque(true);
        f2c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c3MousePressed(evt);
            }
        });

        f2c4.setBackground(java.awt.Color.white);
        f2c4.setAlignmentX(0.5F);
        f2c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c4.setOpaque(true);
        f2c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c4MousePressed(evt);
            }
        });

        f2c5.setBackground(java.awt.Color.white);
        f2c5.setAlignmentX(0.5F);
        f2c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c5.setOpaque(true);
        f2c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c5MousePressed(evt);
            }
        });

        f2c6.setBackground(java.awt.Color.white);
        f2c6.setAlignmentX(0.5F);
        f2c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c6.setOpaque(true);
        f2c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c6MousePressed(evt);
            }
        });

        f2c7.setBackground(java.awt.Color.white);
        f2c7.setAlignmentX(0.5F);
        f2c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c7.setOpaque(true);
        f2c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c7MousePressed(evt);
            }
        });

        f2c8.setBackground(java.awt.Color.white);
        f2c8.setAlignmentX(0.5F);
        f2c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f2c8.setOpaque(true);
        f2c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2c8MousePressed(evt);
            }
        });

        cbf2c1.setEnabled(false);

        cbf2c3.setEnabled(false);

        cbf2c5.setEnabled(false);

        cbf2c7.setEnabled(false);

        cbf2c8.setEnabled(false);

        cbf2c6.setEnabled(false);

        cbf2c4.setEnabled(false);

        cbf2c2.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(f2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cbf2c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf2c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf2c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf2c8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cbf2c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf2c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf2c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf2c7))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f2c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(cbf2c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf2c1))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(cbf2c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf2c3))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(cbf2c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf2c5))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(cbf2c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf2c7)))))
        );

        f3c1.setBackground(java.awt.Color.white);
        f3c1.setAlignmentX(0.5F);
        f3c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c1.setOpaque(true);
        f3c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c1MousePressed(evt);
            }
        });

        f3c2.setBackground(java.awt.Color.white);
        f3c2.setAlignmentX(0.5F);
        f3c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c2.setOpaque(true);
        f3c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c2MousePressed(evt);
            }
        });

        f3c3.setBackground(java.awt.Color.white);
        f3c3.setAlignmentX(0.5F);
        f3c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c3.setOpaque(true);
        f3c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c3MousePressed(evt);
            }
        });

        f3c4.setBackground(java.awt.Color.white);
        f3c4.setAlignmentX(0.5F);
        f3c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c4.setOpaque(true);
        f3c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c4MousePressed(evt);
            }
        });

        f3c5.setBackground(java.awt.Color.white);
        f3c5.setAlignmentX(0.5F);
        f3c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c5.setOpaque(true);
        f3c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c5MousePressed(evt);
            }
        });

        f3c6.setBackground(java.awt.Color.white);
        f3c6.setAlignmentX(0.5F);
        f3c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c6.setOpaque(true);
        f3c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c6MousePressed(evt);
            }
        });

        f3c7.setBackground(java.awt.Color.white);
        f3c7.setAlignmentX(0.5F);
        f3c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c7.setOpaque(true);
        f3c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c7MousePressed(evt);
            }
        });

        f3c8.setBackground(java.awt.Color.white);
        f3c8.setAlignmentX(0.5F);
        f3c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f3c8.setOpaque(true);
        f3c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3c8MousePressed(evt);
            }
        });

        cbf3c1.setEnabled(false);

        cbf3c2.setEnabled(false);

        cbf3c4.setEnabled(false);

        cbf3c3.setEnabled(false);

        cbf3c5.setEnabled(false);

        cbf3c6.setEnabled(false);

        cbf3c8.setEnabled(false);

        cbf3c7.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(f3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbf3c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf3c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf3c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf3c8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbf3c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf3c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf3c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf3c7))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f3c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f3c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(cbf3c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf3c1))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(cbf3c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf3c3))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(cbf3c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf3c5))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(cbf3c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf3c7)))))
        );

        f4c8.setBackground(java.awt.Color.white);
        f4c8.setAlignmentX(0.5F);
        f4c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c8.setOpaque(true);
        f4c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c8MousePressed(evt);
            }
        });

        f4c7.setBackground(java.awt.Color.white);
        f4c7.setAlignmentX(0.5F);
        f4c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c7.setOpaque(true);
        f4c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c7MousePressed(evt);
            }
        });

        f4c6.setBackground(java.awt.Color.white);
        f4c6.setAlignmentX(0.5F);
        f4c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c6.setOpaque(true);
        f4c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c6MousePressed(evt);
            }
        });

        f4c5.setBackground(java.awt.Color.white);
        f4c5.setAlignmentX(0.5F);
        f4c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c5.setOpaque(true);
        f4c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c5MousePressed(evt);
            }
        });

        f4c4.setBackground(java.awt.Color.white);
        f4c4.setAlignmentX(0.5F);
        f4c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c4.setOpaque(true);
        f4c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c4MousePressed(evt);
            }
        });

        f4c3.setBackground(java.awt.Color.white);
        f4c3.setAlignmentX(0.5F);
        f4c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c3.setOpaque(true);
        f4c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c3MousePressed(evt);
            }
        });

        f4c2.setBackground(java.awt.Color.white);
        f4c2.setAlignmentX(0.5F);
        f4c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c2.setOpaque(true);
        f4c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c2MousePressed(evt);
            }
        });

        f4c1.setBackground(java.awt.Color.white);
        f4c1.setAlignmentX(0.5F);
        f4c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f4c1.setOpaque(true);
        f4c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4c1MousePressed(evt);
            }
        });

        cbf4c1.setEnabled(false);

        cbf4c2.setEnabled(false);

        cbf4c4.setEnabled(false);

        cbf4c3.setEnabled(false);

        cbf4c5.setEnabled(false);

        cbf4c6.setEnabled(false);

        cbf4c8.setEnabled(false);

        cbf4c7.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(f4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cbf4c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf4c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf4c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf4c8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cbf4c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf4c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf4c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf4c7))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f4c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(cbf4c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf4c1))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(cbf4c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf4c3))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(cbf4c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf4c5))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(cbf4c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf4c7)))))
        );

        f5c1.setBackground(java.awt.Color.white);
        f5c1.setAlignmentX(0.5F);
        f5c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c1.setOpaque(true);
        f5c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c1MousePressed(evt);
            }
        });

        f5c2.setBackground(java.awt.Color.white);
        f5c2.setAlignmentX(0.5F);
        f5c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c2.setOpaque(true);
        f5c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c2MousePressed(evt);
            }
        });

        f5c3.setBackground(java.awt.Color.white);
        f5c3.setAlignmentX(0.5F);
        f5c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c3.setOpaque(true);
        f5c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c3MousePressed(evt);
            }
        });

        f5c4.setBackground(java.awt.Color.white);
        f5c4.setAlignmentX(0.5F);
        f5c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c4.setOpaque(true);
        f5c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c4MousePressed(evt);
            }
        });

        f5c5.setBackground(java.awt.Color.white);
        f5c5.setAlignmentX(0.5F);
        f5c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c5.setOpaque(true);
        f5c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c5MousePressed(evt);
            }
        });

        f5c6.setBackground(java.awt.Color.white);
        f5c6.setAlignmentX(0.5F);
        f5c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c6.setOpaque(true);
        f5c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c6MousePressed(evt);
            }
        });

        f5c7.setBackground(java.awt.Color.white);
        f5c7.setAlignmentX(0.5F);
        f5c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c7.setOpaque(true);
        f5c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c7MousePressed(evt);
            }
        });

        f5c8.setBackground(java.awt.Color.white);
        f5c8.setAlignmentX(0.5F);
        f5c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f5c8.setOpaque(true);
        f5c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5c8MousePressed(evt);
            }
        });

        cbf5c1.setEnabled(false);

        cbf5c2.setEnabled(false);

        cbf5c4.setEnabled(false);

        cbf5c3.setEnabled(false);

        cbf5c5.setEnabled(false);

        cbf5c6.setEnabled(false);

        cbf5c8.setEnabled(false);

        cbf5c7.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(f5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(cbf5c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf5c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf5c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf5c8))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(cbf5c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf5c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf5c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbf5c7))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f5c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(cbf5c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf5c7))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(cbf5c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf5c1))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(cbf5c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf5c3))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(cbf5c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf5c5)))))
        );

        f6c1.setBackground(java.awt.Color.white);
        f6c1.setAlignmentX(0.5F);
        f6c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c1.setOpaque(true);
        f6c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c1MousePressed(evt);
            }
        });

        f6c2.setBackground(java.awt.Color.white);
        f6c2.setAlignmentX(0.5F);
        f6c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c2.setOpaque(true);
        f6c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c2MousePressed(evt);
            }
        });

        f6c3.setBackground(java.awt.Color.white);
        f6c3.setAlignmentX(0.5F);
        f6c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c3.setOpaque(true);
        f6c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c3MousePressed(evt);
            }
        });

        f6c4.setBackground(java.awt.Color.white);
        f6c4.setAlignmentX(0.5F);
        f6c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c4.setOpaque(true);
        f6c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c4MousePressed(evt);
            }
        });

        f6c5.setBackground(java.awt.Color.white);
        f6c5.setAlignmentX(0.5F);
        f6c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c5.setOpaque(true);
        f6c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c5MousePressed(evt);
            }
        });

        f6c6.setBackground(java.awt.Color.white);
        f6c6.setAlignmentX(0.5F);
        f6c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c6.setOpaque(true);
        f6c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c6MousePressed(evt);
            }
        });

        f6c7.setBackground(java.awt.Color.white);
        f6c7.setAlignmentX(0.5F);
        f6c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c7.setOpaque(true);
        f6c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c7MousePressed(evt);
            }
        });

        f6c8.setBackground(java.awt.Color.white);
        f6c8.setAlignmentX(0.5F);
        f6c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f6c8.setOpaque(true);
        f6c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6c8MousePressed(evt);
            }
        });

        cbf6c1.setEnabled(false);

        cbf6c2.setEnabled(false);

        cbf6c4.setEnabled(false);

        cbf6c3.setEnabled(false);

        cbf6c5.setEnabled(false);

        cbf6c6.setEnabled(false);

        cbf6c8.setEnabled(false);

        cbf6c7.setEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(f6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(cbf6c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf6c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf6c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf6c8))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(cbf6c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf6c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf6c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf6c7))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f6c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(cbf6c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf6c1))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(cbf6c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf6c3))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(cbf6c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf6c5))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(cbf6c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf6c7)))))
        );

        f7c2.setBackground(java.awt.Color.white);
        f7c2.setAlignmentX(0.5F);
        f7c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c2.setOpaque(true);
        f7c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c2MousePressed(evt);
            }
        });

        f7c3.setBackground(java.awt.Color.white);
        f7c3.setAlignmentX(0.5F);
        f7c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c3.setOpaque(true);
        f7c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c3MousePressed(evt);
            }
        });

        f7c4.setBackground(java.awt.Color.white);
        f7c4.setAlignmentX(0.5F);
        f7c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c4.setOpaque(true);
        f7c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c4MousePressed(evt);
            }
        });

        f7c5.setBackground(java.awt.Color.white);
        f7c5.setAlignmentX(0.5F);
        f7c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c5.setOpaque(true);
        f7c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c5MousePressed(evt);
            }
        });

        f7c6.setBackground(java.awt.Color.white);
        f7c6.setAlignmentX(0.5F);
        f7c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c6.setOpaque(true);
        f7c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c6MousePressed(evt);
            }
        });

        f7c7.setBackground(java.awt.Color.white);
        f7c7.setAlignmentX(0.5F);
        f7c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c7.setOpaque(true);
        f7c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c7MousePressed(evt);
            }
        });

        f7c8.setBackground(java.awt.Color.white);
        f7c8.setAlignmentX(0.5F);
        f7c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c8.setOpaque(true);
        f7c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c8MousePressed(evt);
            }
        });

        cbf7c1.setEnabled(false);

        cbf7c2.setEnabled(false);

        cbf7c4.setEnabled(false);

        cbf7c3.setEnabled(false);

        cbf7c5.setEnabled(false);

        cbf7c6.setEnabled(false);

        cbf7c8.setEnabled(false);

        cbf7c7.setEnabled(false);

        f7c1.setBackground(java.awt.Color.white);
        f7c1.setAlignmentX(0.5F);
        f7c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f7c1.setOpaque(true);
        f7c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7c1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(f7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(cbf7c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf7c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf7c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf7c8))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(cbf7c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf7c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf7c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf7c7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(cbf7c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf7c1))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(cbf7c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf7c3))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(cbf7c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf7c5))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(cbf7c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf7c7)))
                    .addComponent(f7c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f7c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        f8c1.setBackground(java.awt.Color.white);
        f8c1.setAlignmentX(0.5F);
        f8c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c1.setOpaque(true);
        f8c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c1MousePressed(evt);
            }
        });

        f8c2.setBackground(java.awt.Color.white);
        f8c2.setAlignmentX(0.5F);
        f8c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c2.setOpaque(true);
        f8c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c2MousePressed(evt);
            }
        });

        f8c3.setBackground(java.awt.Color.white);
        f8c3.setAlignmentX(0.5F);
        f8c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c3.setOpaque(true);
        f8c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c3MousePressed(evt);
            }
        });

        f8c4.setBackground(java.awt.Color.white);
        f8c4.setAlignmentX(0.5F);
        f8c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c4.setOpaque(true);
        f8c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c4MousePressed(evt);
            }
        });

        f8c5.setBackground(java.awt.Color.white);
        f8c5.setAlignmentX(0.5F);
        f8c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c5.setOpaque(true);
        f8c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c5MousePressed(evt);
            }
        });

        f8c6.setBackground(java.awt.Color.white);
        f8c6.setAlignmentX(0.5F);
        f8c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c6.setOpaque(true);
        f8c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c6MousePressed(evt);
            }
        });

        f8c7.setBackground(java.awt.Color.white);
        f8c7.setAlignmentX(0.5F);
        f8c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c7.setOpaque(true);
        f8c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c7MousePressed(evt);
            }
        });

        f8c8.setBackground(java.awt.Color.white);
        f8c8.setAlignmentX(0.5F);
        f8c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f8c8.setOpaque(true);
        f8c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8c8MousePressed(evt);
            }
        });

        cbf8c1.setEnabled(false);

        cbf8c2.setEnabled(false);

        cbf8c4.setEnabled(false);

        cbf8c3.setEnabled(false);

        cbf8c5.setEnabled(false);

        cbf8c6.setEnabled(false);

        cbf8c8.setEnabled(false);

        cbf8c7.setEnabled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(f8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(cbf8c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf8c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf8c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf8c8))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(cbf8c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf8c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf8c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf8c7))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f8c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(cbf8c8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf8c7))
                    .addComponent(f8c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f8c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f8c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f8c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f8c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f8c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f8c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(cbf8c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf8c1))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(cbf8c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf8c3))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(cbf8c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf8c5)))))
        );

        f9c1.setBackground(java.awt.Color.white);
        f9c1.setAlignmentX(0.5F);
        f9c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c1.setOpaque(true);
        f9c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c1MousePressed(evt);
            }
        });

        f9c2.setBackground(java.awt.Color.white);
        f9c2.setAlignmentX(0.5F);
        f9c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c2.setOpaque(true);
        f9c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c2MousePressed(evt);
            }
        });

        f9c3.setBackground(java.awt.Color.white);
        f9c3.setAlignmentX(0.5F);
        f9c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c3.setOpaque(true);
        f9c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c3MousePressed(evt);
            }
        });

        f9c4.setBackground(java.awt.Color.white);
        f9c4.setAlignmentX(0.5F);
        f9c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c4.setOpaque(true);
        f9c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c4MousePressed(evt);
            }
        });

        f9c5.setBackground(java.awt.Color.white);
        f9c5.setAlignmentX(0.5F);
        f9c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c5.setOpaque(true);
        f9c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c5MousePressed(evt);
            }
        });

        f9c6.setBackground(java.awt.Color.white);
        f9c6.setAlignmentX(0.5F);
        f9c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c6.setOpaque(true);
        f9c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c6MousePressed(evt);
            }
        });

        f9c7.setBackground(java.awt.Color.white);
        f9c7.setAlignmentX(0.5F);
        f9c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c7.setOpaque(true);
        f9c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c7MousePressed(evt);
            }
        });

        f9c8.setBackground(java.awt.Color.white);
        f9c8.setAlignmentX(0.5F);
        f9c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f9c8.setOpaque(true);
        f9c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f9c8MousePressed(evt);
            }
        });

        cbf9c1.setEnabled(false);

        cbf9c2.setEnabled(false);

        cbf9c4.setEnabled(false);

        cbf9c3.setEnabled(false);

        cbf9c5.setEnabled(false);

        cbf9c6.setEnabled(false);

        cbf9c8.setEnabled(false);

        cbf9c7.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(f9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(cbf9c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf9c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf9c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf9c8))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(cbf9c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf9c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf9c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf9c7)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f9c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f9c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f9c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f9c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f9c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f9c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f9c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f9c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(cbf9c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf9c1))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(cbf9c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf9c3))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(cbf9c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf9c5))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(cbf9c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf9c7)))))
        );

        f10c1.setBackground(java.awt.Color.white);
        f10c1.setAlignmentX(0.5F);
        f10c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c1.setOpaque(true);
        f10c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c1MousePressed(evt);
            }
        });

        f10c2.setBackground(java.awt.Color.white);
        f10c2.setAlignmentX(0.5F);
        f10c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c2.setOpaque(true);
        f10c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c2MousePressed(evt);
            }
        });

        f10c3.setBackground(java.awt.Color.white);
        f10c3.setAlignmentX(0.5F);
        f10c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c3.setOpaque(true);
        f10c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c3MousePressed(evt);
            }
        });

        f10c4.setBackground(java.awt.Color.white);
        f10c4.setAlignmentX(0.5F);
        f10c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c4.setOpaque(true);
        f10c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c4MousePressed(evt);
            }
        });

        f10c5.setBackground(java.awt.Color.white);
        f10c5.setAlignmentX(0.5F);
        f10c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c5.setOpaque(true);
        f10c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c5MousePressed(evt);
            }
        });

        f10c6.setBackground(java.awt.Color.white);
        f10c6.setAlignmentX(0.5F);
        f10c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c6.setOpaque(true);
        f10c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c6MousePressed(evt);
            }
        });

        f10c7.setBackground(java.awt.Color.white);
        f10c7.setAlignmentX(0.5F);
        f10c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c7.setOpaque(true);
        f10c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c7MousePressed(evt);
            }
        });

        f10c8.setBackground(java.awt.Color.white);
        f10c8.setAlignmentX(0.5F);
        f10c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f10c8.setOpaque(true);
        f10c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f10c8MousePressed(evt);
            }
        });

        cbf10c1.setEnabled(false);

        cbf10c2.setEnabled(false);

        cbf10c4.setEnabled(false);

        cbf10c3.setEnabled(false);

        cbf10c5.setEnabled(false);

        cbf10c6.setEnabled(false);

        cbf10c8.setEnabled(false);

        cbf10c7.setEnabled(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(f10c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f10c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f10c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f10c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f10c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f10c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f10c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f10c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(cbf10c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf10c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf10c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf10c8))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(cbf10c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf10c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf10c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf10c7))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f10c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f10c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f10c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f10c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f10c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f10c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f10c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f10c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(cbf10c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf10c1))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(cbf10c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf10c3))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(cbf10c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf10c5))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(cbf10c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf10c7)))))
        );

        f11c1.setBackground(java.awt.Color.white);
        f11c1.setAlignmentX(0.5F);
        f11c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c1.setOpaque(true);
        f11c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c1MousePressed(evt);
            }
        });

        f11c2.setBackground(java.awt.Color.white);
        f11c2.setAlignmentX(0.5F);
        f11c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c2.setOpaque(true);
        f11c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c2MousePressed(evt);
            }
        });

        f11c3.setBackground(java.awt.Color.white);
        f11c3.setAlignmentX(0.5F);
        f11c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c3.setOpaque(true);
        f11c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c3MousePressed(evt);
            }
        });

        f11c4.setBackground(java.awt.Color.white);
        f11c4.setAlignmentX(0.5F);
        f11c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c4.setOpaque(true);
        f11c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c4MousePressed(evt);
            }
        });

        f11c5.setBackground(java.awt.Color.white);
        f11c5.setAlignmentX(0.5F);
        f11c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c5.setOpaque(true);
        f11c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c5MousePressed(evt);
            }
        });

        f11c6.setBackground(java.awt.Color.white);
        f11c6.setAlignmentX(0.5F);
        f11c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c6.setOpaque(true);
        f11c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c6MousePressed(evt);
            }
        });

        f11c7.setBackground(java.awt.Color.white);
        f11c7.setAlignmentX(0.5F);
        f11c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c7.setOpaque(true);
        f11c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c7MousePressed(evt);
            }
        });

        f11c8.setBackground(java.awt.Color.white);
        f11c8.setAlignmentX(0.5F);
        f11c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f11c8.setOpaque(true);
        f11c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f11c8MousePressed(evt);
            }
        });

        cbf11c1.setEnabled(false);

        cbf11c2.setEnabled(false);

        cbf11c4.setEnabled(false);

        cbf11c3.setEnabled(false);

        cbf11c5.setEnabled(false);

        cbf11c6.setEnabled(false);

        cbf11c8.setEnabled(false);

        cbf11c7.setEnabled(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(f11c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f11c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f11c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f11c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f11c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f11c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f11c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f11c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(cbf11c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf11c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf11c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf11c8))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(cbf11c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf11c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf11c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf11c7))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f11c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f11c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f11c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f11c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f11c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f11c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f11c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f11c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(cbf11c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf11c1))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(cbf11c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf11c3))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(cbf11c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf11c5))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(cbf11c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf11c7)))))
        );

        f12c1.setBackground(java.awt.Color.white);
        f12c1.setAlignmentX(0.5F);
        f12c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c1.setOpaque(true);
        f12c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c1MousePressed(evt);
            }
        });

        f12c2.setBackground(java.awt.Color.white);
        f12c2.setAlignmentX(0.5F);
        f12c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c2.setOpaque(true);
        f12c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c2MousePressed(evt);
            }
        });

        f12c3.setBackground(java.awt.Color.white);
        f12c3.setAlignmentX(0.5F);
        f12c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c3.setOpaque(true);
        f12c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c3MousePressed(evt);
            }
        });

        f12c4.setBackground(java.awt.Color.white);
        f12c4.setAlignmentX(0.5F);
        f12c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c4.setOpaque(true);
        f12c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c4MousePressed(evt);
            }
        });

        f12c5.setBackground(java.awt.Color.white);
        f12c5.setAlignmentX(0.5F);
        f12c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c5.setOpaque(true);
        f12c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c5MousePressed(evt);
            }
        });

        f12c6.setBackground(java.awt.Color.white);
        f12c6.setAlignmentX(0.5F);
        f12c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c6.setOpaque(true);
        f12c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c6MousePressed(evt);
            }
        });

        f12c7.setBackground(java.awt.Color.white);
        f12c7.setAlignmentX(0.5F);
        f12c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c7.setOpaque(true);
        f12c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c7MousePressed(evt);
            }
        });

        f12c8.setBackground(java.awt.Color.white);
        f12c8.setAlignmentX(0.5F);
        f12c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        f12c8.setOpaque(true);
        f12c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f12c8MousePressed(evt);
            }
        });

        cbf12c2.setEnabled(false);

        cbf12c1.setEnabled(false);

        cbf12c3.setEnabled(false);

        cbf12c4.setEnabled(false);

        cbf12c6.setEnabled(false);

        cbf12c5.setEnabled(false);

        cbf12c7.setEnabled(false);

        cbf12c8.setEnabled(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(f12c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f12c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f12c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f12c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f12c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f12c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f12c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f12c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(cbf12c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf12c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf12c6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf12c8))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(cbf12c1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf12c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf12c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbf12c7))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f12c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(cbf12c2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbf12c1))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(cbf12c4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf12c3))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(cbf12c6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf12c5))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(cbf12c8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbf12c7)))))
        );

        c1.setBackground(java.awt.Color.white);
        c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c1.setOpaque(true);

        c2.setBackground(java.awt.Color.white);
        c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c2.setOpaque(true);

        c3.setBackground(java.awt.Color.white);
        c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c3.setOpaque(true);

        c4.setBackground(java.awt.Color.white);
        c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c4.setOpaque(true);

        c5.setBackground(java.awt.Color.white);
        c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c5.setOpaque(true);

        c6.setBackground(java.awt.Color.white);
        c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c6.setOpaque(true);

        c7.setBackground(java.awt.Color.white);
        c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c7.setOpaque(true);

        c8.setBackground(java.awt.Color.white);
        c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        c8.setOpaque(true);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f8c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c8MousePressed
        if (f8c8.isEnabled()) {
            f8c8.setBackground(color);
        }
    }//GEN-LAST:event_f8c8MousePressed

    private void f8c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c7MousePressed
        if (f8c7.isEnabled()) {
            f8c7.setBackground(color);
        }
    }//GEN-LAST:event_f8c7MousePressed

    private void f8c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c6MousePressed
        if (f8c6.isEnabled()) {
            f8c6.setBackground(color);
        }
    }//GEN-LAST:event_f8c6MousePressed

    private void f8c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c5MousePressed
        if (f8c5.isEnabled()) {
            f8c5.setBackground(color);
        }
    }//GEN-LAST:event_f8c5MousePressed

    private void f8c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c4MousePressed
        if (f8c4.isEnabled()) {
            f8c4.setBackground(color);
        }
    }//GEN-LAST:event_f8c4MousePressed

    private void f8c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c3MousePressed
        if (f8c3.isEnabled()) {
            f8c3.setBackground(color);
        }
    }//GEN-LAST:event_f8c3MousePressed

    private void f8c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c2MousePressed
        if (f8c2.isEnabled()) {
            f8c2.setBackground(color);
        }
    }//GEN-LAST:event_f8c2MousePressed

    private void f8c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8c1MousePressed
        if (f8c1.isEnabled()) {
            f8c1.setBackground(color);
        }
    }//GEN-LAST:event_f8c1MousePressed

    private void f7c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c1MousePressed
        if (f7c1.isEnabled()) {
            f7c1.setBackground(color);
        }
    }//GEN-LAST:event_f7c1MousePressed

    private void f7c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c8MousePressed
        if (f7c8.isEnabled()) {
            f7c8.setBackground(color);
        }
    }//GEN-LAST:event_f7c8MousePressed

    private void f7c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c7MousePressed
        if (f7c7.isEnabled()) {
            f7c7.setBackground(color);
        }
    }//GEN-LAST:event_f7c7MousePressed

    private void f7c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c6MousePressed
        if (f7c6.isEnabled()) {
            f7c6.setBackground(color);
        }
    }//GEN-LAST:event_f7c6MousePressed

    private void f7c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c5MousePressed
        if (f7c5.isEnabled()) {
            f7c5.setBackground(color);
        }
    }//GEN-LAST:event_f7c5MousePressed

    private void f7c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c4MousePressed
        if (f7c4.isEnabled()) {
            f7c4.setBackground(color);
        }
    }//GEN-LAST:event_f7c4MousePressed

    private void f7c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c3MousePressed
        if (f7c3.isEnabled()) {
            f7c3.setBackground(color);
        }
    }//GEN-LAST:event_f7c3MousePressed

    private void f7c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7c2MousePressed
        if (f7c2.isEnabled()) {
            f7c2.setBackground(color);
        }
    }//GEN-LAST:event_f7c2MousePressed

    private void f6c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c8MousePressed
        if (f6c8.isEnabled()) {
            f6c8.setBackground(color);
        }
    }//GEN-LAST:event_f6c8MousePressed

    private void f6c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c7MousePressed
        if (f6c7.isEnabled()) {
            f6c7.setBackground(color);
        }
    }//GEN-LAST:event_f6c7MousePressed

    private void f6c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c6MousePressed
        if (f6c6.isEnabled()) {
            f6c6.setBackground(color);
        }
    }//GEN-LAST:event_f6c6MousePressed

    private void f6c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c5MousePressed
        if (f6c5.isEnabled()) {
            f6c5.setBackground(color);
        }
    }//GEN-LAST:event_f6c5MousePressed

    private void f6c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c4MousePressed
        if (f6c4.isEnabled()) {
            f6c4.setBackground(color);
        }
    }//GEN-LAST:event_f6c4MousePressed

    private void f6c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c3MousePressed
        if (f6c3.isEnabled()) {
            f6c3.setBackground(color);
        }
    }//GEN-LAST:event_f6c3MousePressed

    private void f6c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c2MousePressed
        if (f6c2.isEnabled()) {
            f6c2.setBackground(color);
        }
    }//GEN-LAST:event_f6c2MousePressed

    private void f6c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6c1MousePressed
        if (f6c1.isEnabled()) {
            f6c1.setBackground(color);
        }
    }//GEN-LAST:event_f6c1MousePressed

    private void f5c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c8MousePressed
        if (f5c8.isEnabled()) {
            f5c8.setBackground(color);
        }
    }//GEN-LAST:event_f5c8MousePressed

    private void f5c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c7MousePressed
        if (f5c7.isEnabled()) {
            f5c7.setBackground(color);
        }
    }//GEN-LAST:event_f5c7MousePressed

    private void f5c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c6MousePressed
        if (f5c6.isEnabled()) {
            f5c6.setBackground(color);
        }
    }//GEN-LAST:event_f5c6MousePressed

    private void f5c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c5MousePressed
        f5c5.setBackground(color);
    }//GEN-LAST:event_f5c5MousePressed

    private void f5c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c4MousePressed
        if (f5c4.isEnabled()) {
            f5c4.setBackground(color);
        }
    }//GEN-LAST:event_f5c4MousePressed

    private void f5c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c3MousePressed
        if (f5c3.isEnabled()) {
            f5c3.setBackground(color);
        }
    }//GEN-LAST:event_f5c3MousePressed

    private void f5c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c2MousePressed
        if (f5c2.isEnabled()) {
            f5c2.setBackground(color);
        }
    }//GEN-LAST:event_f5c2MousePressed

    private void f5c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5c1MousePressed
        if (f5c1.isEnabled()) {
            f5c1.setBackground(color);
        }
    }//GEN-LAST:event_f5c1MousePressed

    private void f4c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c1MousePressed
        if (f4c1.isEnabled()) {
            f4c1.setBackground(color);
        }
    }//GEN-LAST:event_f4c1MousePressed

    private void f4c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c2MousePressed
        if (f4c2.isEnabled()) {
            f4c2.setBackground(color);
        }
    }//GEN-LAST:event_f4c2MousePressed

    private void f4c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c3MousePressed
        if (f4c3.isEnabled()) {
            f4c3.setBackground(color);
        }
    }//GEN-LAST:event_f4c3MousePressed

    private void f4c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c4MousePressed
        if (f4c4.isEnabled()) {
            f4c4.setBackground(color);
        }
    }//GEN-LAST:event_f4c4MousePressed

    private void f4c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c5MousePressed
        if (f4c5.isEnabled()) {
            f4c5.setBackground(color);
        }
    }//GEN-LAST:event_f4c5MousePressed

    private void f4c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c6MousePressed
        if (f4c6.isEnabled()) {
            f4c6.setBackground(color);
        }
    }//GEN-LAST:event_f4c6MousePressed

    private void f4c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c7MousePressed
        if (f4c7.isEnabled()) {
            f4c7.setBackground(color);
        }
    }//GEN-LAST:event_f4c7MousePressed

    private void f4c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4c8MousePressed
        if (f4c8.isEnabled()) {
            f4c8.setBackground(color);
        }
    }//GEN-LAST:event_f4c8MousePressed

    private void f3c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c8MousePressed
        if (f3c8.isEnabled()) {
            f3c8.setBackground(color);
        }
    }//GEN-LAST:event_f3c8MousePressed

    private void f3c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c7MousePressed
        if (f3c7.isEnabled()) {
            f3c7.setBackground(color);
        }
    }//GEN-LAST:event_f3c7MousePressed

    private void f3c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c6MousePressed
        if (f3c6.isEnabled()) {
            f3c6.setBackground(color);
        }
    }//GEN-LAST:event_f3c6MousePressed

    private void f3c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c5MousePressed
        if (f3c5.isEnabled()) {
            f3c5.setBackground(color);
        }
    }//GEN-LAST:event_f3c5MousePressed

    private void f3c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c4MousePressed
        if (f3c4.isEnabled()) {
            f3c4.setBackground(color);
        }
    }//GEN-LAST:event_f3c4MousePressed

    private void f3c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c3MousePressed
        if (f3c3.isEnabled()) {
            f3c3.setBackground(color);
        }
    }//GEN-LAST:event_f3c3MousePressed

    private void f3c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c2MousePressed
        if (f3c2.isEnabled()) {
            f3c2.setBackground(color);
        }
    }//GEN-LAST:event_f3c2MousePressed

    private void f3c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3c1MousePressed
        if (f3c1.isEnabled()) {
            f3c1.setBackground(color);
        }
    }//GEN-LAST:event_f3c1MousePressed

    private void f2c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c8MousePressed
        if (f2c8.isEnabled()) {
            f2c8.setBackground(color);
        }
    }//GEN-LAST:event_f2c8MousePressed

    private void f2c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c7MousePressed
        if (f2c7.isEnabled()) {
            f2c7.setBackground(color);
        }
    }//GEN-LAST:event_f2c7MousePressed

    private void f2c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c6MousePressed
        if (f2c6.isEnabled()) {
            f2c6.setBackground(color);
        }
    }//GEN-LAST:event_f2c6MousePressed

    private void f2c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c5MousePressed
        if (f2c5.isEnabled()) {
            f2c5.setBackground(color);
        }
    }//GEN-LAST:event_f2c5MousePressed

    private void f2c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c4MousePressed
        if (f2c4.isEnabled()) {
            f2c4.setBackground(color);
        }
    }//GEN-LAST:event_f2c4MousePressed

    private void f2c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c3MousePressed
        if (f2c3.isEnabled()) {
            f2c3.setBackground(color);
        }
    }//GEN-LAST:event_f2c3MousePressed

    private void f2c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c1MousePressed
        if (f2c1.isEnabled()) {
            f2c1.setBackground(color);
        }
    }//GEN-LAST:event_f2c1MousePressed

    private void f2c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2c2MousePressed
        if (f2c2.isEnabled()) {
            f2c2.setBackground(color);
        }
    }//GEN-LAST:event_f2c2MousePressed

    private void boton_ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ComprobarActionPerformed
        int contador = 0;
        boolean blanco = true;
        fila++;

        switch (fila) {
            case 1:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila1[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila1[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar1[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila1[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }

            case 2:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila2[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila2[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar2[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila2[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 3:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila3[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila3[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar3[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila3[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 4:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila4[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila4[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar4[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila4[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 5:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila5[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila5[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar5[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila5[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 6:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila6[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila6[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar6[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila6[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 7:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila7[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila7[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar7[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila7[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 8:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila8[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila8[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar8[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila8[i].setEnabled(false);
                    }
                    //Fin de partida en la fila 8 si la dificultad es 4
                    if (contador != dificultad && dificultad == 4) {
                        for (int i = 0; i < dificultad; i++) {
                            secuencia_Contraseña[i].setVisible(true);
                        }
                        DurationFormatUtils.formatDuration(reloj.getTime(), "mm:ss");
                        JOptionPane.showMessageDialog(this, "Has llegado al número máximo de intentos. Prueba otra vez");
                        this.setVisible(false);
                        InicioMain menu = new InicioMain();
                        menu.setVisible(true);
                        menu.setLocationRelativeTo(null);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 9:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila9[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila9[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar9[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila9[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 10:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila10[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila10[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar10[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila10[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;
                    break;
                }
            case 11:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila11[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila11[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar11[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila11[i].setEnabled(false);
                    }

                    break;
                } else {
                    fila--;                    
                    break;
                }
            case 12:
                //Primero miramos que se haya modificado la linea
                for (int i = 0; i < dificultad; i++) {
                    if (fila12[i].getBackground() != Color.white) {
                        blanco = false;
                    }
                }
                if (blanco != true) {
                    //Contamos los aciertos
                    for (int i = 0; i < dificultad; i++) {
                        if (fila12[i].getBackground() == secuencia_Contraseña[i].getBackground()) {
                            contador++;
                        }
                    }
                    //Mostramos el numero de aciertos
                    for (int i = 0; i < contador; i++) {
                        comprobar12[i].setSelected(true);
                    }

                    //Deshabilitamos los botones ya comprobados
                    for (int i = 0; i < 8; i++) {
                        fila12[i].setEnabled(false);
                    }
                    //Mensaje de fin de partida y poner contraseña visible.
                    if (contador != dificultad) {
                        for (int i = 0; i < dificultad; i++) {
                            secuencia_Contraseña[i].setVisible(true);
                        }
                        JOptionPane.showMessageDialog(this, "Has llegado al número máximo de intentos. Prueba otra vez");
                        this.setVisible(false);
                        InicioMain menu = new InicioMain();
                        menu.setVisible(true);
                        menu.setLocationRelativeTo(null);
                    }

                    break;
                } else {
                    fila--;                    
                    break;
                }

        }
        //Si no se ha coloreado ningun recuadro mostramos un mensaje de aviso
        if(blanco==true){
            JOptionPane.showMessageDialog(this, "Debe colorear al menos un recuadro para poder comprobar la fila.");
        }
        //Comprobamos si finaliza la partida y mostramos la solución.
        if (contador == dificultad) {
            for (int i = 0; i < dificultad; i++) {
                secuencia_Contraseña[i].setVisible(true);
            }
            JOptionPane.showMessageDialog(this, "¡Enhorabuena! Mastermind completado en "
                    + DurationFormatUtils.formatDuration(reloj.getTime(), "mm:ss." + "\n")
                    + " Puntuación obtenida: " + (""+calcularPuntuacion()) + " puntos.");
            this.setVisible(false);
            InicioMain menu = new InicioMain();
            menu.setVisible(true);

        }
        System.out.println("Puntuación:" + this.calcularPuntuacion());
        
    }//GEN-LAST:event_boton_ComprobarActionPerformed
    
    //Metodo para reiniciar y volver al menu
    private void boton_ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ReiniciarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que quiere reiniciar el juego?", "Reiniciar", 0);
        if (opcion == 0) {
            this.setVisible(false);
            InicioMain menu = new InicioMain();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_boton_ReiniciarActionPerformed

    //Metodo para iniciar el juego
    private void boton_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_IniciarActionPerformed
        if (reloj.isStarted()) {
            reloj.stop();
        }
        reloj.reset();
        reloj.start();
        habilitarTodo();
    }//GEN-LAST:event_boton_IniciarActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        color = Color.BLUE;
    }//GEN-LAST:event_azulActionPerformed

    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        color = Color.GREEN;
    }//GEN-LAST:event_verdeActionPerformed

    private void amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloActionPerformed
        color = Color.YELLOW;
    }//GEN-LAST:event_amarilloActionPerformed

    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
        color = Color.RED;
    }//GEN-LAST:event_rojoActionPerformed

    private void rosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rosaActionPerformed
        color = Color.PINK;
    }//GEN-LAST:event_rosaActionPerformed

    private void naranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naranjaActionPerformed
        color = Color.ORANGE;
    }//GEN-LAST:event_naranjaActionPerformed

    private void magentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magentaActionPerformed
        color = Color.MAGENTA;
    }//GEN-LAST:event_magentaActionPerformed

    private void cyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyanActionPerformed
        color = Color.CYAN;
    }//GEN-LAST:event_cyanActionPerformed

    private void f1c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c8MousePressed
        if (f1c8.isEnabled()) {
            f1c8.setBackground(color);
        }
    }//GEN-LAST:event_f1c8MousePressed

    private void f1c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c7MousePressed
        if (f1c7.isEnabled()) {
            f1c7.setBackground(color);
        }
    }//GEN-LAST:event_f1c7MousePressed

    private void f1c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c6MousePressed
        if (f1c6.isEnabled()) {
            f1c6.setBackground(color);
        }
    }//GEN-LAST:event_f1c6MousePressed

    private void f1c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c5MousePressed
        if (f1c5.isEnabled()) {
            f1c5.setBackground(color);
        }
    }//GEN-LAST:event_f1c5MousePressed

    private void f1c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c4MousePressed
        if (f1c4.isEnabled()) {
            f1c4.setBackground(color);
        }
    }//GEN-LAST:event_f1c4MousePressed

    private void f1c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c3MousePressed
        if (f1c3.isEnabled()) {
            f1c3.setBackground(color);
        }
    }//GEN-LAST:event_f1c3MousePressed

    private void f1c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c2MousePressed
        if (f1c2.isEnabled()) {
            f1c2.setBackground(color);
        }
    }//GEN-LAST:event_f1c2MousePressed

    private void f1c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1c1MousePressed
        if (f1c1.isEnabled()) {
            f1c1.setBackground(color);
        }
    }//GEN-LAST:event_f1c1MousePressed

    private void f12c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c8MousePressed
        if (f12c8.isEnabled()) {
            f12c8.setBackground(color);
        }
    }//GEN-LAST:event_f12c8MousePressed

    private void f12c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c7MousePressed
        if (f12c7.isEnabled()) {
            f12c7.setBackground(color);
        }
    }//GEN-LAST:event_f12c7MousePressed

    private void f12c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c6MousePressed
        if (f12c6.isEnabled()) {
            f12c6.setBackground(color);
        }
    }//GEN-LAST:event_f12c6MousePressed

    private void f12c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c5MousePressed
        if (f12c5.isEnabled()) {
            f12c5.setBackground(color);
        }
    }//GEN-LAST:event_f12c5MousePressed

    private void f12c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c4MousePressed
        if (f12c4.isEnabled()) {
            f12c4.setBackground(color);
        }
    }//GEN-LAST:event_f12c4MousePressed

    private void f12c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c3MousePressed
        if (f12c3.isEnabled()) {
            f12c3.setBackground(color);
        }
    }//GEN-LAST:event_f12c3MousePressed

    private void f12c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c2MousePressed
        if (f12c2.isEnabled()) {
            f12c2.setBackground(color);
        }
    }//GEN-LAST:event_f12c2MousePressed

    private void f12c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f12c1MousePressed
        if (f12c1.isEnabled()) {
            f12c1.setBackground(color);
        }
    }//GEN-LAST:event_f12c1MousePressed

    private void f11c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c8MousePressed
        if (f11c8.isEnabled()) {
            f11c8.setBackground(color);
        }
    }//GEN-LAST:event_f11c8MousePressed

    private void f11c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c7MousePressed
        if (f11c7.isEnabled()) {
            f11c7.setBackground(color);
        }
    }//GEN-LAST:event_f11c7MousePressed

    private void f11c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c6MousePressed
        if (f11c6.isEnabled()) {
            f11c6.setBackground(color);
        }
    }//GEN-LAST:event_f11c6MousePressed

    private void f11c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c5MousePressed
        if (f11c5.isEnabled()) {
            f11c5.setBackground(color);
        }
    }//GEN-LAST:event_f11c5MousePressed

    private void f11c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c4MousePressed
        if (f11c4.isEnabled()) {
            f11c4.setBackground(color);
        }
    }//GEN-LAST:event_f11c4MousePressed

    private void f11c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c3MousePressed
        if (f11c3.isEnabled()) {
            f11c3.setBackground(color);
        }
    }//GEN-LAST:event_f11c3MousePressed

    private void f11c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c2MousePressed
        if (f11c2.isEnabled()) {
            f11c2.setBackground(color);
        }
    }//GEN-LAST:event_f11c2MousePressed

    private void f11c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f11c1MousePressed
        if (f11c1.isEnabled()) {
            f11c1.setBackground(color);
        }
    }//GEN-LAST:event_f11c1MousePressed

    private void f10c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c8MousePressed
        if (f10c8.isEnabled()) {
            f10c8.setBackground(color);
        }
    }//GEN-LAST:event_f10c8MousePressed

    private void f10c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c7MousePressed
        if (f10c7.isEnabled()) {
            f10c7.setBackground(color);
        }
    }//GEN-LAST:event_f10c7MousePressed

    private void f10c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c6MousePressed
        if (f10c6.isEnabled()) {
            f10c6.setBackground(color);
        }
    }//GEN-LAST:event_f10c6MousePressed

    private void f10c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c5MousePressed
        if (f10c5.isEnabled()) {
            f10c5.setBackground(color);
        }
    }//GEN-LAST:event_f10c5MousePressed

    private void f10c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c4MousePressed
        if (f10c4.isEnabled()) {
            f10c4.setBackground(color);
        }
    }//GEN-LAST:event_f10c4MousePressed

    private void f10c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c3MousePressed
        if (f10c3.isEnabled()) {
            f10c3.setBackground(color);
        }
    }//GEN-LAST:event_f10c3MousePressed

    private void f10c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c2MousePressed
        if (f10c2.isEnabled()) {
            f10c2.setBackground(color);
        }
    }//GEN-LAST:event_f10c2MousePressed

    private void f10c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f10c1MousePressed
        if (f10c1.isEnabled()) {
            f10c1.setBackground(color);
        }
    }//GEN-LAST:event_f10c1MousePressed

    private void f9c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c8MousePressed
        if (f9c8.isEnabled()) {
            f9c8.setBackground(color);
        }
    }//GEN-LAST:event_f9c8MousePressed

    private void f9c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c7MousePressed
        if (f9c7.isEnabled()) {
            f9c7.setBackground(color);
        }
    }//GEN-LAST:event_f9c7MousePressed

    private void f9c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c6MousePressed
        if (f9c6.isEnabled()) {
            f9c6.setBackground(color);
        }
    }//GEN-LAST:event_f9c6MousePressed

    private void f9c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c5MousePressed
        if (f9c5.isEnabled()) {
            f9c5.setBackground(color);
        }
    }//GEN-LAST:event_f9c5MousePressed

    private void f9c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c4MousePressed
        if (f9c4.isEnabled()) {
            f9c4.setBackground(color);
        }
    }//GEN-LAST:event_f9c4MousePressed

    private void f9c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c3MousePressed
        if (f9c3.isEnabled()) {
            f9c3.setBackground(color);
        }
    }//GEN-LAST:event_f9c3MousePressed

    private void f9c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c2MousePressed
        if (f9c2.isEnabled()) {
            f9c2.setBackground(color);
        }
    }//GEN-LAST:event_f9c2MousePressed

    private void f9c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f9c1MousePressed
        if (f9c1.isEnabled()) {
            f9c1.setBackground(color);
        }
    }//GEN-LAST:event_f9c1MousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.close();
    }//GEN-LAST:event_formWindowClosing

    //Metodo para habilitar todos los botones menos el boton inicio
    public void habilitarTodo() {
        boton_Iniciar.setEnabled(false);
        boton_Reiniciar.setEnabled(true);
        boton_Comprobar.setEnabled(true);
        azul.setEnabled(true);
        verde.setEnabled(true);
        amarillo.setEnabled(true);
        rojo.setEnabled(true);
        cyan.setEnabled(true);
        magenta.setEnabled(true);
        naranja.setEnabled(true);
        rosa.setEnabled(true);
        for (int i = 0; i < 8; i++) {
            secuencia[i].setEnabled(true);
            fila1[i].setEnabled(true);
            fila2[i].setEnabled(true);
            fila3[i].setEnabled(true);
            fila4[i].setEnabled(true);
            fila5[i].setEnabled(true);
            fila6[i].setEnabled(true);
            fila7[i].setEnabled(true);
            fila8[i].setEnabled(true);
            fila9[i].setEnabled(true);
            fila10[i].setEnabled(true);
            fila11[i].setEnabled(true);
            fila12[i].setEnabled(true);            
        }
    }

    
    //Metodo para deshabilitar todos los botones menos el boton inicio
    public void deshabilitarTodo() {
        boton_Iniciar.setEnabled(true);
        boton_Reiniciar.setEnabled(false);
        boton_Comprobar.setEnabled(false);
        azul.setEnabled(false);
        verde.setEnabled(false);
        amarillo.setEnabled(false);
        rojo.setEnabled(false);
        cyan.setEnabled(false);
        magenta.setEnabled(false);
        naranja.setEnabled(false);
        rosa.setEnabled(false);
        for (int i = 0; i < 8; i++) {
            secuencia[i].setEnabled(false);
            fila1[i].setEnabled(false);
            fila2[i].setEnabled(false);
            fila3[i].setEnabled(false);
            fila4[i].setEnabled(false);
            fila5[i].setEnabled(false);
            fila6[i].setEnabled(false);
            fila7[i].setEnabled(false);
            fila8[i].setEnabled(false);
            fila9[i].setEnabled(false);
            fila10[i].setEnabled(false);
            fila11[i].setEnabled(false);
            fila12[i].setEnabled(false);
            comprobar1[i].setEnabled(false);
            comprobar2[i].setEnabled(false);
            comprobar3[i].setEnabled(false);
            comprobar4[i].setEnabled(false);
            comprobar5[i].setEnabled(false);
            comprobar6[i].setEnabled(false);
            comprobar7[i].setEnabled(false);
            comprobar8[i].setEnabled(false);
            comprobar9[i].setEnabled(false);
            comprobar10[i].setEnabled(false);
            comprobar11[i].setEnabled(false);
            comprobar12[i].setEnabled(false);
        }
    }

    //Metodo que oculta los botones segun la dificultad elegida
    public void setInvisibles(int dificultad) {
        switch (dificultad) {
            case 4:
                //Ocultamos los botones y filas no usados en la dificultad 4
                cyan.setVisible(false);
                magenta.setVisible(false);
                naranja.setVisible(false);
                rosa.setVisible(false);
                for (int i = 0; i < 8; i++) {
                    fila9[i].setVisible(false);
                    fila10[i].setVisible(false);
                    fila11[i].setVisible(false);
                    fila12[i].setVisible(false);
                    comprobar9[i].setVisible(false);
                    comprobar10[i].setVisible(false);
                    comprobar11[i].setVisible(false);
                    comprobar12[i].setVisible(false);
                }
                //Ocultamos parte de las filas usadas para ajustar la dificultad 4
                for (int i = dificultad; i < 8; i++) {
                    fila1[i].setVisible(false);
                    fila2[i].setVisible(false);
                    fila3[i].setVisible(false);
                    fila4[i].setVisible(false);
                    fila5[i].setVisible(false);
                    fila6[i].setVisible(false);
                    fila7[i].setVisible(false);
                    fila8[i].setVisible(false);

                    comprobar1[i].setVisible(false);
                    comprobar2[i].setVisible(false);
                    comprobar3[i].setVisible(false);
                    comprobar4[i].setVisible(false);
                    comprobar5[i].setVisible(false);
                    comprobar6[i].setVisible(false);
                    comprobar7[i].setVisible(false);
                    comprobar8[i].setVisible(false);
                }
                break;
            case 6:
                //Ocultamos los botones no usados
                naranja.setVisible(false);
                rosa.setVisible(false);
                //Ocultamos parte de las filas usadas para ajustar la dificultad 6
                for (int i = dificultad; i < 8; i++) {
                    fila1[i].setVisible(false);
                    fila2[i].setVisible(false);
                    fila3[i].setVisible(false);
                    fila4[i].setVisible(false);
                    fila5[i].setVisible(false);
                    fila6[i].setVisible(false);
                    fila7[i].setVisible(false);
                    fila8[i].setVisible(false);
                    fila9[i].setVisible(false);
                    fila10[i].setVisible(false);
                    fila11[i].setVisible(false);
                    fila12[i].setVisible(false);
                    comprobar1[i].setVisible(false);
                    comprobar2[i].setVisible(false);
                    comprobar3[i].setVisible(false);
                    comprobar4[i].setVisible(false);
                    comprobar5[i].setVisible(false);
                    comprobar6[i].setVisible(false);
                    comprobar7[i].setVisible(false);
                    comprobar8[i].setVisible(false);
                    comprobar9[i].setVisible(false);
                    comprobar10[i].setVisible(false);
                    comprobar11[i].setVisible(false);
                    comprobar12[i].setVisible(false);
                }
                break;
            case 8:
                //Ocultamos parte de las filas usadas para ajustar la dificultad 8
                for (int i = dificultad; i < 8; i++) {
                    fila1[i].setVisible(false);
                    fila2[i].setVisible(false);
                    fila3[i].setVisible(false);
                    fila4[i].setVisible(false);
                    fila5[i].setVisible(false);
                    fila6[i].setVisible(false);
                    fila7[i].setVisible(false);
                    fila8[i].setVisible(false);
                    fila9[i].setVisible(false);
                    fila10[i].setVisible(false);
                    fila11[i].setVisible(false);
                    fila12[i].setVisible(false);
                    comprobar1[i].setVisible(false);
                    comprobar2[i].setVisible(false);
                    comprobar3[i].setVisible(false);
                    comprobar4[i].setVisible(false);
                    comprobar5[i].setVisible(false);
                    comprobar6[i].setVisible(false);
                    comprobar7[i].setVisible(false);
                    comprobar8[i].setVisible(false);
                    comprobar9[i].setVisible(false);
                    comprobar10[i].setVisible(false);
                    comprobar11[i].setVisible(false);
                    comprobar12[i].setVisible(false);
                }
                break;
        }
    }
    
    //Metodo para calcular la puntuacion segun el tiempo usado y las filas sobrantes
    public long calcularPuntuacion() {
        long puntuacion = 0;
        switch(dificultad){
            case 4:
                puntuacion = (300000 - reloj.getTime()) + ((9 - fila) * 50000);
                this.puntuacion=puntuacion;
                break;
            case 6:
                puntuacion = (600000 - reloj.getTime()) + ((13 - fila) * 100000);
                this.puntuacion=puntuacion;
                break;
            case 8:
                puntuacion = (1000000 - reloj.getTime()) + ((13 - fila) * 200000);
                this.puntuacion=puntuacion;
                break;
        }
        if(puntuacion<=0){
            puntuacion=0;
        }
        return puntuacion;
        

    }
    
    //Metodo para mostrar aviso al cerrar el programa
    private void close(){
        if (JOptionPane.showConfirmDialog(this, "¿Esta seguro de que desea cerrar Mastermind?",
                "Cerrar Mastermind", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }
    //Metodo para Iniciar la partida
    public void iniciarPartida() {
        //Generacion de secuencia secreta y coloreado de los labels 
        contraseña = "";

        for (int i = 0; i <= 7; i++) {
            secuencia_Contraseña[i] = secuencia[i];
        }
        while (contraseña.length() != dificultad) {
            for (int i = 0; i < (dificultad); i++) {
                int numeroAñadir = rnd.nextInt(dificultad) + 1;
                if (contraseña.contains("" + numeroAñadir)) {
                    --i;
                } else {
                    contraseña += numeroAñadir;
                    switch (numeroAñadir) {
                        case 1:
                            secuencia_Contraseña[i].setBackground(Color.BLUE);
                            break;
                        case 2:
                            secuencia_Contraseña[i].setBackground(Color.GREEN);
                            break;
                        case 3:
                            secuencia_Contraseña[i].setBackground(Color.YELLOW);
                            break;
                        case 4:
                            secuencia_Contraseña[i].setBackground(Color.RED);
                            break;
                        case 5:
                            secuencia_Contraseña[i].setBackground(Color.CYAN);
                            break;
                        case 6:
                            secuencia_Contraseña[i].setBackground(Color.MAGENTA);
                            break;
                        case 7:
                            secuencia_Contraseña[i].setBackground(Color.ORANGE);
                            break;
                        case 8:
                            secuencia_Contraseña[i].setBackground(Color.PINK);
                            break;
                    }
                }
            }
        }
        System.out.println("Contraseña:" + contraseña);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton amarillo;
    private javax.swing.JToggleButton azul;
    private javax.swing.JButton boton_Comprobar;
    private javax.swing.JButton boton_Iniciar;
    private javax.swing.JButton boton_Reiniciar;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JCheckBox cbf10c1;
    private javax.swing.JCheckBox cbf10c2;
    private javax.swing.JCheckBox cbf10c3;
    private javax.swing.JCheckBox cbf10c4;
    private javax.swing.JCheckBox cbf10c5;
    private javax.swing.JCheckBox cbf10c6;
    private javax.swing.JCheckBox cbf10c7;
    private javax.swing.JCheckBox cbf10c8;
    private javax.swing.JCheckBox cbf11c1;
    private javax.swing.JCheckBox cbf11c2;
    private javax.swing.JCheckBox cbf11c3;
    private javax.swing.JCheckBox cbf11c4;
    private javax.swing.JCheckBox cbf11c5;
    private javax.swing.JCheckBox cbf11c6;
    private javax.swing.JCheckBox cbf11c7;
    private javax.swing.JCheckBox cbf11c8;
    private javax.swing.JCheckBox cbf12c1;
    private javax.swing.JCheckBox cbf12c2;
    private javax.swing.JCheckBox cbf12c3;
    private javax.swing.JCheckBox cbf12c4;
    private javax.swing.JCheckBox cbf12c5;
    private javax.swing.JCheckBox cbf12c6;
    private javax.swing.JCheckBox cbf12c7;
    private javax.swing.JCheckBox cbf12c8;
    private javax.swing.JCheckBox cbf1c1;
    private javax.swing.JCheckBox cbf1c2;
    private javax.swing.JCheckBox cbf1c3;
    private javax.swing.JCheckBox cbf1c4;
    private javax.swing.JCheckBox cbf1c5;
    private javax.swing.JCheckBox cbf1c6;
    private javax.swing.JCheckBox cbf1c7;
    private javax.swing.JCheckBox cbf1c8;
    private javax.swing.JCheckBox cbf2c1;
    private javax.swing.JCheckBox cbf2c2;
    private javax.swing.JCheckBox cbf2c3;
    private javax.swing.JCheckBox cbf2c4;
    private javax.swing.JCheckBox cbf2c5;
    private javax.swing.JCheckBox cbf2c6;
    private javax.swing.JCheckBox cbf2c7;
    private javax.swing.JCheckBox cbf2c8;
    private javax.swing.JCheckBox cbf3c1;
    private javax.swing.JCheckBox cbf3c2;
    private javax.swing.JCheckBox cbf3c3;
    private javax.swing.JCheckBox cbf3c4;
    private javax.swing.JCheckBox cbf3c5;
    private javax.swing.JCheckBox cbf3c6;
    private javax.swing.JCheckBox cbf3c7;
    private javax.swing.JCheckBox cbf3c8;
    private javax.swing.JCheckBox cbf4c1;
    private javax.swing.JCheckBox cbf4c2;
    private javax.swing.JCheckBox cbf4c3;
    private javax.swing.JCheckBox cbf4c4;
    private javax.swing.JCheckBox cbf4c5;
    private javax.swing.JCheckBox cbf4c6;
    private javax.swing.JCheckBox cbf4c7;
    private javax.swing.JCheckBox cbf4c8;
    private javax.swing.JCheckBox cbf5c1;
    private javax.swing.JCheckBox cbf5c2;
    private javax.swing.JCheckBox cbf5c3;
    private javax.swing.JCheckBox cbf5c4;
    private javax.swing.JCheckBox cbf5c5;
    private javax.swing.JCheckBox cbf5c6;
    private javax.swing.JCheckBox cbf5c7;
    private javax.swing.JCheckBox cbf5c8;
    private javax.swing.JCheckBox cbf6c1;
    private javax.swing.JCheckBox cbf6c2;
    private javax.swing.JCheckBox cbf6c3;
    private javax.swing.JCheckBox cbf6c4;
    private javax.swing.JCheckBox cbf6c5;
    private javax.swing.JCheckBox cbf6c6;
    private javax.swing.JCheckBox cbf6c7;
    private javax.swing.JCheckBox cbf6c8;
    private javax.swing.JCheckBox cbf7c1;
    private javax.swing.JCheckBox cbf7c2;
    private javax.swing.JCheckBox cbf7c3;
    private javax.swing.JCheckBox cbf7c4;
    private javax.swing.JCheckBox cbf7c5;
    private javax.swing.JCheckBox cbf7c6;
    private javax.swing.JCheckBox cbf7c7;
    private javax.swing.JCheckBox cbf7c8;
    private javax.swing.JCheckBox cbf8c1;
    private javax.swing.JCheckBox cbf8c2;
    private javax.swing.JCheckBox cbf8c3;
    private javax.swing.JCheckBox cbf8c4;
    private javax.swing.JCheckBox cbf8c5;
    private javax.swing.JCheckBox cbf8c6;
    private javax.swing.JCheckBox cbf8c7;
    private javax.swing.JCheckBox cbf8c8;
    private javax.swing.JCheckBox cbf9c1;
    private javax.swing.JCheckBox cbf9c2;
    private javax.swing.JCheckBox cbf9c3;
    private javax.swing.JCheckBox cbf9c4;
    private javax.swing.JCheckBox cbf9c5;
    private javax.swing.JCheckBox cbf9c6;
    private javax.swing.JCheckBox cbf9c7;
    private javax.swing.JCheckBox cbf9c8;
    private javax.swing.JToggleButton cyan;
    private javax.swing.JLabel f10c1;
    private javax.swing.JLabel f10c2;
    private javax.swing.JLabel f10c3;
    private javax.swing.JLabel f10c4;
    private javax.swing.JLabel f10c5;
    private javax.swing.JLabel f10c6;
    private javax.swing.JLabel f10c7;
    private javax.swing.JLabel f10c8;
    private javax.swing.JLabel f11c1;
    private javax.swing.JLabel f11c2;
    private javax.swing.JLabel f11c3;
    private javax.swing.JLabel f11c4;
    private javax.swing.JLabel f11c5;
    private javax.swing.JLabel f11c6;
    private javax.swing.JLabel f11c7;
    private javax.swing.JLabel f11c8;
    private javax.swing.JLabel f12c1;
    private javax.swing.JLabel f12c2;
    private javax.swing.JLabel f12c3;
    private javax.swing.JLabel f12c4;
    private javax.swing.JLabel f12c5;
    private javax.swing.JLabel f12c6;
    private javax.swing.JLabel f12c7;
    private javax.swing.JLabel f12c8;
    private javax.swing.JLabel f1c1;
    private javax.swing.JLabel f1c2;
    private javax.swing.JLabel f1c3;
    private javax.swing.JLabel f1c4;
    private javax.swing.JLabel f1c5;
    private javax.swing.JLabel f1c6;
    private javax.swing.JLabel f1c7;
    private javax.swing.JLabel f1c8;
    private javax.swing.JLabel f2c1;
    private javax.swing.JLabel f2c2;
    private javax.swing.JLabel f2c3;
    private javax.swing.JLabel f2c4;
    private javax.swing.JLabel f2c5;
    private javax.swing.JLabel f2c6;
    private javax.swing.JLabel f2c7;
    private javax.swing.JLabel f2c8;
    private javax.swing.JLabel f3c1;
    private javax.swing.JLabel f3c2;
    private javax.swing.JLabel f3c3;
    private javax.swing.JLabel f3c4;
    private javax.swing.JLabel f3c5;
    private javax.swing.JLabel f3c6;
    private javax.swing.JLabel f3c7;
    private javax.swing.JLabel f3c8;
    private javax.swing.JLabel f4c1;
    private javax.swing.JLabel f4c2;
    private javax.swing.JLabel f4c3;
    private javax.swing.JLabel f4c4;
    private javax.swing.JLabel f4c5;
    private javax.swing.JLabel f4c6;
    private javax.swing.JLabel f4c7;
    private javax.swing.JLabel f4c8;
    private javax.swing.JLabel f5c1;
    private javax.swing.JLabel f5c2;
    private javax.swing.JLabel f5c3;
    private javax.swing.JLabel f5c4;
    private javax.swing.JLabel f5c5;
    private javax.swing.JLabel f5c6;
    private javax.swing.JLabel f5c7;
    private javax.swing.JLabel f5c8;
    private javax.swing.JLabel f6c1;
    private javax.swing.JLabel f6c2;
    private javax.swing.JLabel f6c3;
    private javax.swing.JLabel f6c4;
    private javax.swing.JLabel f6c5;
    private javax.swing.JLabel f6c6;
    private javax.swing.JLabel f6c7;
    private javax.swing.JLabel f6c8;
    private javax.swing.JLabel f7c1;
    private javax.swing.JLabel f7c2;
    private javax.swing.JLabel f7c3;
    private javax.swing.JLabel f7c4;
    private javax.swing.JLabel f7c5;
    private javax.swing.JLabel f7c6;
    private javax.swing.JLabel f7c7;
    private javax.swing.JLabel f7c8;
    private javax.swing.JLabel f8c1;
    private javax.swing.JLabel f8c2;
    private javax.swing.JLabel f8c3;
    private javax.swing.JLabel f8c4;
    private javax.swing.JLabel f8c5;
    private javax.swing.JLabel f8c6;
    private javax.swing.JLabel f8c7;
    private javax.swing.JLabel f8c8;
    private javax.swing.JLabel f9c1;
    private javax.swing.JLabel f9c2;
    private javax.swing.JLabel f9c3;
    private javax.swing.JLabel f9c4;
    private javax.swing.JLabel f9c5;
    private javax.swing.JLabel f9c6;
    private javax.swing.JLabel f9c7;
    private javax.swing.JLabel f9c8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton magenta;
    private javax.swing.JToggleButton naranja;
    private javax.swing.JToggleButton rojo;
    private javax.swing.JToggleButton rosa;
    private javax.swing.JToggleButton verde;
    // End of variables declaration//GEN-END:variables
}
