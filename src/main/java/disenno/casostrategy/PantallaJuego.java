/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disenno.casostrategy;

import Logica.*;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author monic
 */
public class PantallaJuego extends javax.swing.JFrame {
    
    JugadorPrincipal jugador1 = new JugadorPrincipal("Jugador 1", 200);
    JugadorNPC jugador2 = new JugadorNPC("Jugador 2", 200);
    Juego juego = new Juego(jugador1,jugador2);
    String arteMarcialElegido;
    String comboGeneradoJ1;
    String comboGeneradoJ2;

    /**
     * Creates new form PantallaJuego
     */
    public PantallaJuego() {
        initComponents();
        juego.setJugador(jugador1);
        juego.setJugadorNPC(jugador2);
        juego.crearArtes();
        juego.cambiarArtesJugador(jugador1);
        juego.cambiarArtesJugador(jugador2);
        actualizarEtiquetas();
        
         //Display image on jlable
        ImageIcon ii = new ImageIcon(jugador2.getArtesMarciales().get(0).getImagen()); //Imagen del ARTE MARCIAL
        //            Resize image to fit jlabel
        Image image = ii.getImage().getScaledInstance(lbl_Imagen1J2.getWidth(), lbl_Imagen1J2.getHeight(), Image.SCALE_SMOOTH);
        lbl_Imagen1J2.setIcon(new ImageIcon(image));
        
        //Display image on jlable
        ii = new ImageIcon(jugador2.getArtesMarciales().get(1).getImagen());
        //            Resize image to fit jlabel
        image = ii.getImage().getScaledInstance(lbl_Imagen2J2.getWidth(), lbl_Imagen2J2.getHeight(), Image.SCALE_SMOOTH);
        lbl_Imagen2J2.setIcon(new ImageIcon(image));
        
        //Display image on jlable
        ii = new ImageIcon(jugador2.getArtesMarciales().get(2).getImagen());
        //            Resize image to fit jlabel
        image = ii.getImage().getScaledInstance(lbl_Imagen3J2.getWidth(), lbl_Imagen3J2.getHeight(), Image.SCALE_SMOOTH);
        lbl_Imagen3J2.setIcon(new ImageIcon(image));
       
    }
    
    public void revisarGanador(){
        if(jugador1.getVida()<=0){
            lbl_VidaJ1.setText("200/"+0);
            JOptionPane.showMessageDialog(this, jugador2.getNombre()+" HA GANADO!!!");
            this.setVisible(false);
        }
         if(jugador2.getVida()<=0){
             lbl_VidaJ1.setText("200/"+0);
            JOptionPane.showMessageDialog(this, jugador1.getNombre()+" HA GANADO!!!");
              this.setVisible(false);
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Fondo = new javax.swing.JPanel();
        panel_Jugador1 = new javax.swing.JPanel();
        btn_Jugador1AM1 = new javax.swing.JButton();
        btn_Jugador1AM2 = new javax.swing.JButton();
        btn_Jugador1AM3 = new javax.swing.JButton();
        btn_SeleccionarAMJ1 = new javax.swing.JButton();
        lbl_Jugador3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_BitacoraJ1 = new javax.swing.JTextArea();
        lbl_ImagenJ1 = new javax.swing.JLabel();
        btn_GenerarComboJ1 = new javax.swing.JButton();
        lbl_VidaJ1 = new javax.swing.JLabel();
        btn_AtacarJ1 = new javax.swing.JButton();
        btn_ActualizarJ1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_Jugador1AM1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbl_Jugador1AM2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        lbl_Jugador1AM3 = new javax.swing.JTextArea();
        panel_Jugador2 = new javax.swing.JPanel();
        lbl_Jugador2 = new javax.swing.JLabel();
        btn_Jugador2AM2 = new javax.swing.JButton();
        btn_Jugador2AM3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_BitacoraJ2 = new javax.swing.JTextArea();
        lbl_Imagen3J2 = new javax.swing.JLabel();
        lbl_Imagen1J2 = new javax.swing.JLabel();
        lbl_Imagen2J2 = new javax.swing.JLabel();
        btn_GenerarGolpesJ2 = new javax.swing.JButton();
        lbl_VIdaJ2 = new javax.swing.JLabel();
        btn_AtacarJ2 = new javax.swing.JButton();
        btn_ActualizarJ2 = new javax.swing.JButton();
        btn_Jugador2AM1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        lbl_Jugador2AM1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        lbl_Jugador2AM3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        lbl_Jugador2AM2 = new javax.swing.JTextArea();
        btn_ReasignarJ2 = new javax.swing.JButton();
        btn_Atacarse2 = new javax.swing.JButton();
        btn_ReasignarJ1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de artes marciales");

        panel_Fondo.setBackground(new java.awt.Color(255, 153, 51));
        panel_Fondo.setLayout(null);

        panel_Jugador1.setBackground(new java.awt.Color(255, 255, 255));
        panel_Jugador1.setLayout(null);

        btn_Jugador1AM1.setBackground(new java.awt.Color(255, 153, 0));
        btn_Jugador1AM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Jugador1AM1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Jugador1AM1.setText("AM");
        btn_Jugador1AM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Jugador1AM1ActionPerformed(evt);
            }
        });
        panel_Jugador1.add(btn_Jugador1AM1);
        btn_Jugador1AM1.setBounds(15, 43, 100, 26);

        btn_Jugador1AM2.setBackground(new java.awt.Color(255, 153, 0));
        btn_Jugador1AM2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Jugador1AM2.setForeground(new java.awt.Color(255, 255, 255));
        btn_Jugador1AM2.setText("AM");
        btn_Jugador1AM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Jugador1AM2ActionPerformed(evt);
            }
        });
        panel_Jugador1.add(btn_Jugador1AM2);
        btn_Jugador1AM2.setBounds(143, 43, 100, 26);

        btn_Jugador1AM3.setBackground(new java.awt.Color(255, 153, 0));
        btn_Jugador1AM3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Jugador1AM3.setForeground(new java.awt.Color(255, 255, 255));
        btn_Jugador1AM3.setText("AM");
        btn_Jugador1AM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Jugador1AM3ActionPerformed(evt);
            }
        });
        panel_Jugador1.add(btn_Jugador1AM3);
        btn_Jugador1AM3.setBounds(260, 43, 100, 26);

        btn_SeleccionarAMJ1.setBackground(new java.awt.Color(255, 153, 0));
        btn_SeleccionarAMJ1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_SeleccionarAMJ1.setForeground(new java.awt.Color(255, 255, 255));
        btn_SeleccionarAMJ1.setText("Seleccionar arte marcial");
        btn_SeleccionarAMJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeleccionarAMJ1ActionPerformed(evt);
            }
        });
        panel_Jugador1.add(btn_SeleccionarAMJ1);
        btn_SeleccionarAMJ1.setBounds(20, 200, 230, 20);

        lbl_Jugador3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Jugador3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador3.setText("Jugador 1");
        panel_Jugador1.add(lbl_Jugador3);
        lbl_Jugador3.setBounds(142, 6, 84, 25);

        txtA_BitacoraJ1.setEditable(false);
        txtA_BitacoraJ1.setBackground(new java.awt.Color(255, 255, 255));
        txtA_BitacoraJ1.setColumns(20);
        txtA_BitacoraJ1.setRows(5);
        jScrollPane3.setViewportView(txtA_BitacoraJ1);

        panel_Jugador1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 360, 350, 120);

        lbl_ImagenJ1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ImagenJ1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ImagenJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_ImagenJ1.setOpaque(true);
        panel_Jugador1.add(lbl_ImagenJ1);
        lbl_ImagenJ1.setBounds(260, 200, 100, 112);

        btn_GenerarComboJ1.setBackground(new java.awt.Color(255, 153, 0));
        btn_GenerarComboJ1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_GenerarComboJ1.setForeground(new java.awt.Color(255, 255, 255));
        btn_GenerarComboJ1.setText("Generar combo 3-6 golpes");
        btn_GenerarComboJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarComboJ1ActionPerformed(evt);
            }
        });
        panel_Jugador1.add(btn_GenerarComboJ1);
        btn_GenerarComboJ1.setBounds(20, 230, 230, 20);

        lbl_VidaJ1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_VidaJ1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_VidaJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_VidaJ1.setText("VIDA");
        lbl_VidaJ1.setBorder(new javax.swing.border.MatteBorder(null));
        panel_Jugador1.add(lbl_VidaJ1);
        lbl_VidaJ1.setBounds(130, 330, 120, 27);

        btn_AtacarJ1.setBackground(new java.awt.Color(255, 153, 0));
        btn_AtacarJ1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AtacarJ1.setForeground(new java.awt.Color(255, 255, 255));
        btn_AtacarJ1.setText("Atacar");
        btn_AtacarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtacarJ1ActionPerformed(evt);
            }
        });
        panel_Jugador1.add(btn_AtacarJ1);
        btn_AtacarJ1.setBounds(20, 260, 230, 20);

        btn_ActualizarJ1.setBackground(new java.awt.Color(255, 153, 0));
        btn_ActualizarJ1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ActualizarJ1.setForeground(new java.awt.Color(255, 255, 255));
        btn_ActualizarJ1.setText("Actualizar vida y golpes");
        btn_ActualizarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarJ1ActionPerformed(evt);
            }
        });
        panel_Jugador1.add(btn_ActualizarJ1);
        btn_ActualizarJ1.setBounds(20, 290, 230, 20);

        lbl_Jugador1AM1.setEditable(false);
        lbl_Jugador1AM1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Jugador1AM1.setColumns(20);
        lbl_Jugador1AM1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_Jugador1AM1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador1AM1.setRows(5);
        jScrollPane1.setViewportView(lbl_Jugador1AM1);

        panel_Jugador1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 90, 110);

        lbl_Jugador1AM2.setEditable(false);
        lbl_Jugador1AM2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Jugador1AM2.setColumns(20);
        lbl_Jugador1AM2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_Jugador1AM2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador1AM2.setRows(5);
        jScrollPane4.setViewportView(lbl_Jugador1AM2);

        panel_Jugador1.add(jScrollPane4);
        jScrollPane4.setBounds(150, 80, 90, 110);

        lbl_Jugador1AM3.setEditable(false);
        lbl_Jugador1AM3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Jugador1AM3.setColumns(20);
        lbl_Jugador1AM3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_Jugador1AM3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador1AM3.setRows(5);
        jScrollPane5.setViewportView(lbl_Jugador1AM3);

        panel_Jugador1.add(jScrollPane5);
        jScrollPane5.setBounds(270, 80, 90, 110);

        panel_Fondo.add(panel_Jugador1);
        panel_Jugador1.setBounds(10, 30, 380, 490);

        panel_Jugador2.setBackground(new java.awt.Color(255, 255, 255));
        panel_Jugador2.setLayout(null);

        lbl_Jugador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Jugador2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador2.setText("Jugador 2");
        panel_Jugador2.add(lbl_Jugador2);
        lbl_Jugador2.setBounds(149, 6, 84, 25);

        btn_Jugador2AM2.setBackground(new java.awt.Color(255, 153, 0));
        btn_Jugador2AM2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Jugador2AM2.setForeground(new java.awt.Color(255, 255, 255));
        btn_Jugador2AM2.setText("AM");
        panel_Jugador2.add(btn_Jugador2AM2);
        btn_Jugador2AM2.setBounds(141, 43, 100, 26);

        btn_Jugador2AM3.setBackground(new java.awt.Color(255, 153, 0));
        btn_Jugador2AM3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Jugador2AM3.setForeground(new java.awt.Color(255, 255, 255));
        btn_Jugador2AM3.setText("AM");
        panel_Jugador2.add(btn_Jugador2AM3);
        btn_Jugador2AM3.setBounds(259, 43, 100, 26);

        txtA_BitacoraJ2.setEditable(false);
        txtA_BitacoraJ2.setBackground(new java.awt.Color(255, 255, 255));
        txtA_BitacoraJ2.setColumns(20);
        txtA_BitacoraJ2.setRows(5);
        jScrollPane2.setViewportView(txtA_BitacoraJ2);

        panel_Jugador2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 360, 350, 120);

        lbl_Imagen3J2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Imagen3J2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Imagen3J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_Imagen3J2.setOpaque(true);
        panel_Jugador2.add(lbl_Imagen3J2);
        lbl_Imagen3J2.setBounds(280, 200, 60, 60);

        lbl_Imagen1J2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Imagen1J2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Imagen1J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_Imagen1J2.setOpaque(true);
        panel_Jugador2.add(lbl_Imagen1J2);
        lbl_Imagen1J2.setBounds(40, 200, 60, 60);

        lbl_Imagen2J2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Imagen2J2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Imagen2J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_Imagen2J2.setOpaque(true);
        panel_Jugador2.add(lbl_Imagen2J2);
        lbl_Imagen2J2.setBounds(160, 200, 60, 60);

        btn_GenerarGolpesJ2.setBackground(new java.awt.Color(255, 153, 0));
        btn_GenerarGolpesJ2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_GenerarGolpesJ2.setForeground(new java.awt.Color(255, 255, 255));
        btn_GenerarGolpesJ2.setText("Generar de 3-6 golpes de cualquier AM");
        btn_GenerarGolpesJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarGolpesJ2ActionPerformed(evt);
            }
        });
        panel_Jugador2.add(btn_GenerarGolpesJ2);
        btn_GenerarGolpesJ2.setBounds(40, 270, 300, 20);

        lbl_VIdaJ2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_VIdaJ2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_VIdaJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_VIdaJ2.setText("VIDA");
        lbl_VIdaJ2.setBorder(new javax.swing.border.MatteBorder(null));
        panel_Jugador2.add(lbl_VIdaJ2);
        lbl_VIdaJ2.setBounds(120, 330, 120, 25);

        btn_AtacarJ2.setBackground(new java.awt.Color(255, 153, 0));
        btn_AtacarJ2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AtacarJ2.setForeground(new java.awt.Color(255, 255, 255));
        btn_AtacarJ2.setText("Atacar");
        btn_AtacarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtacarJ2ActionPerformed(evt);
            }
        });
        panel_Jugador2.add(btn_AtacarJ2);
        btn_AtacarJ2.setBounds(40, 300, 90, 20);

        btn_ActualizarJ2.setBackground(new java.awt.Color(255, 153, 0));
        btn_ActualizarJ2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ActualizarJ2.setForeground(new java.awt.Color(255, 255, 255));
        btn_ActualizarJ2.setText("Actualizar vida y golpes");
        btn_ActualizarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarJ2ActionPerformed(evt);
            }
        });
        panel_Jugador2.add(btn_ActualizarJ2);
        btn_ActualizarJ2.setBounds(140, 300, 200, 20);

        btn_Jugador2AM1.setBackground(new java.awt.Color(255, 153, 0));
        btn_Jugador2AM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Jugador2AM1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Jugador2AM1.setText("AM");
        btn_Jugador2AM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Jugador2AM1ActionPerformed(evt);
            }
        });
        panel_Jugador2.add(btn_Jugador2AM1);
        btn_Jugador2AM1.setBounds(23, 43, 100, 26);

        lbl_Jugador2AM1.setEditable(false);
        lbl_Jugador2AM1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Jugador2AM1.setColumns(20);
        lbl_Jugador2AM1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_Jugador2AM1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador2AM1.setRows(5);
        jScrollPane6.setViewportView(lbl_Jugador2AM1);

        panel_Jugador2.add(jScrollPane6);
        jScrollPane6.setBounds(30, 80, 90, 110);

        lbl_Jugador2AM3.setEditable(false);
        lbl_Jugador2AM3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Jugador2AM3.setColumns(20);
        lbl_Jugador2AM3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_Jugador2AM3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador2AM3.setRows(5);
        jScrollPane7.setViewportView(lbl_Jugador2AM3);

        panel_Jugador2.add(jScrollPane7);
        jScrollPane7.setBounds(270, 80, 90, 110);

        lbl_Jugador2AM2.setEditable(false);
        lbl_Jugador2AM2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Jugador2AM2.setColumns(20);
        lbl_Jugador2AM2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_Jugador2AM2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Jugador2AM2.setRows(5);
        jScrollPane8.setViewportView(lbl_Jugador2AM2);

        panel_Jugador2.add(jScrollPane8);
        jScrollPane8.setBounds(150, 80, 90, 110);

        panel_Fondo.add(panel_Jugador2);
        panel_Jugador2.setBounds(500, 30, 380, 490);

        btn_ReasignarJ2.setBackground(new java.awt.Color(255, 255, 255));
        btn_ReasignarJ2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_ReasignarJ2.setForeground(new java.awt.Color(255, 153, 0));
        btn_ReasignarJ2.setText("Reasignar J2");
        btn_ReasignarJ2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ReasignarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReasignarJ2ActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_ReasignarJ2);
        btn_ReasignarJ2.setBounds(390, 300, 110, 60);

        btn_Atacarse2.setBackground(new java.awt.Color(255, 255, 255));
        btn_Atacarse2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Atacarse2.setForeground(new java.awt.Color(255, 153, 0));
        btn_Atacarse2.setText("Atacarse");
        btn_Atacarse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Atacarse2ActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_Atacarse2);
        btn_Atacarse2.setBounds(390, 180, 110, 26);

        btn_ReasignarJ1.setBackground(new java.awt.Color(255, 255, 255));
        btn_ReasignarJ1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_ReasignarJ1.setForeground(new java.awt.Color(255, 153, 0));
        btn_ReasignarJ1.setFocusable(false);
        btn_ReasignarJ1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ReasignarJ1.setLabel("Reasignar J1");
        btn_ReasignarJ1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ReasignarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReasignarJ1ActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_ReasignarJ1);
        btn_ReasignarJ1.setBounds(390, 220, 110, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarEtiquetas(){ //Esta función se encarga de actualizar los nombres de las AM de los botones y dado del label
        ArrayList<ArteMarcial> jugador1AM = jugador1.getArtesMarciales();
        btn_Jugador1AM1.setText(jugador1AM.get(0).getNombre());
        btn_Jugador1AM2.setText(jugador1AM.get(1).getNombre());
        btn_Jugador1AM3.setText(jugador1AM.get(2).getNombre());
        
        ArrayList<Ataque> jugador1Ataques1 = jugador1AM.get(0).getAtaques2();
        lbl_Jugador1AM1.setText(jugador1Ataques1.get(0).getNombre()+" |> "+ jugador1Ataques1.get(0).getDamage()+
                "\n"+jugador1Ataques1.get(1).getNombre()+" |> "+ jugador1Ataques1.get(1).getDamage()+
                "\n"+jugador1Ataques1.get(2).getNombre()+" |> "+ jugador1Ataques1.get(2).getDamage());
        
       ArrayList<Ataque> jugador1Ataques2 = jugador1AM.get(1).getAtaques2();
       System.out.println(jugador1AM.get(1).getAtaques2().size());
        lbl_Jugador1AM2.setText(jugador1Ataques2.get(0).getNombre()+" |> "+ jugador1Ataques2.get(0).getDamage()+ 
                "\n"+jugador1Ataques2.get(1).getNombre()+" |> "+ jugador1Ataques2.get(1).getDamage()+
                "\n"+jugador1Ataques2.get(2).getNombre()+" |> "+ jugador1Ataques2.get(2).getDamage());
        
        ArrayList<Ataque> jugador1Ataques3 = jugador1AM.get(2).getAtaques2();
        lbl_Jugador1AM3.setText(jugador1Ataques3.get(0).getNombre()+" |> "+ jugador1Ataques3.get(0).getDamage()+ 
                "\n"+jugador1Ataques3.get(1).getNombre()+" |> "+ jugador1Ataques3.get(1).getDamage()+
                "\n"+jugador1Ataques3.get(2).getNombre()+" |> "+ jugador1Ataques3.get(2).getDamage()); 
        
        //-----------------------------------------------------------------------------------------------
        
        ArrayList<ArteMarcial> jugador2AM = jugador2.getArtesMarciales();
        btn_Jugador2AM1.setText(jugador2AM.get(0).getNombre());
        btn_Jugador2AM2.setText(jugador2AM.get(1).getNombre());
        btn_Jugador2AM3.setText(jugador2AM.get(2).getNombre());
        ArrayList<Ataque> jugador2Ataques = jugador2AM.get(0).getAtaques2();
        lbl_Jugador2AM1.setText(jugador2Ataques.get(0).getNombre()+" |> "+ jugador2Ataques.get(0).getDamage()+ 
                "\n"+jugador2Ataques.get(1).getNombre()+" |> "+ jugador2Ataques.get(1).getDamage()+
                "\n"+jugador2Ataques.get(2).getNombre()+" |> "+ jugador2Ataques.get(2).getDamage());
        
        ArrayList<Ataque> jugador2Ataques2 = jugador2AM.get(1).getAtaques2();
        lbl_Jugador2AM2.setText(jugador2Ataques2.get(0).getNombre()+" |> "+ jugador2Ataques2.get(0).getDamage()+ 
                "\n"+jugador2Ataques2.get(1).getNombre()+" |> "+ jugador2Ataques2.get(1).getDamage()+
                "\n"+jugador2Ataques2.get(2).getNombre()+" |> "+ jugador2Ataques2.get(2).getDamage());
        
        ArrayList<Ataque> jugador2Ataques3 = jugador2AM.get(2).getAtaques2();
        lbl_Jugador2AM3.setText(jugador2Ataques3.get(0).getNombre()+" |> "+ jugador2Ataques3.get(0).getDamage()+ 
                "\n"+jugador2Ataques3.get(1).getNombre()+" |> "+ jugador2Ataques3.get(1).getDamage()+
                "\n"+jugador2Ataques3.get(2).getNombre()+" |> "+ jugador2Ataques3.get(2).getDamage()); 
        
    }
    private void btn_ActualizarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarJ2ActionPerformed
        // TODO add your handling code here:
        txtA_BitacoraJ2.append(comboGeneradoJ2 + "\n");
        lbl_VIdaJ2.setText("200/"+jugador2.getVida());
        comboGeneradoJ2 = "";
        
        revisarGanador();
        
    }//GEN-LAST:event_btn_ActualizarJ2ActionPerformed

    private void btn_SeleccionarAMJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeleccionarAMJ1ActionPerformed
        // TODO add your handling code here:
        for(int i=0; i<jugador1.getArtesMarciales().size(); i++){
            if(jugador1.getArtesMarciales().get(i).getNombre().equalsIgnoreCase(arteMarcialElegido.trim())){
                System.out.println("Sip");
                jugador1.setArteMarcialSelec(jugador1.getArtesMarciales().get(i));
                //Display image on jlable
                ImageIcon ii = new ImageIcon(jugador1.getArtesMarciales().get(i).getImagen());
                //            Resize image to fit jlabel
                Image image = ii.getImage().getScaledInstance(lbl_ImagenJ1.getWidth(), lbl_ImagenJ1.getHeight(), Image.SCALE_SMOOTH);
                lbl_ImagenJ1.setIcon(new ImageIcon(image));
            }
        }
    }//GEN-LAST:event_btn_SeleccionarAMJ1ActionPerformed

    private void btn_GenerarGolpesJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarGolpesJ2ActionPerformed
        // TODO add your handling code here:
        juego.generarCombo(jugador2);
                   
    }//GEN-LAST:event_btn_GenerarGolpesJ2ActionPerformed

    private void btn_AtacarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtacarJ2ActionPerformed
        // TODO add your handling code here:
        comboGeneradoJ2 = juego.attackNPC();
        
    }//GEN-LAST:event_btn_AtacarJ2ActionPerformed

    private void btn_GenerarComboJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarComboJ1ActionPerformed
        // TODO add your handling code here:
        juego.generarCombo(jugador1);
    }//GEN-LAST:event_btn_GenerarComboJ1ActionPerformed

    private void btn_AtacarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtacarJ1ActionPerformed
        // TODO add your handling code here:
        comboGeneradoJ1 = juego.attackJugador();
        
    }//GEN-LAST:event_btn_AtacarJ1ActionPerformed

    private void btn_ActualizarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarJ1ActionPerformed
        // TODO add your handling code here:
        txtA_BitacoraJ1.append(comboGeneradoJ1 + "\n");
        lbl_VidaJ1.setText("200/"+jugador1.getVida());
        comboGeneradoJ1 = "";
        
        revisarGanador();
    }//GEN-LAST:event_btn_ActualizarJ1ActionPerformed

    private void btn_Jugador2AM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Jugador2AM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Jugador2AM1ActionPerformed

    private void btn_ReasignarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReasignarJ2ActionPerformed
        // TODO add your handling code here:
        juego.cambiarArtesJugador(jugador2);
        actualizarEtiquetas();
        
         //Display image on jlable
        ImageIcon ii = new ImageIcon(jugador2.getArtesMarciales().get(0).getImagen()); //Imagen del ARTE MARCIAL
        //            Resize image to fit jlabel
        Image image = ii.getImage().getScaledInstance(lbl_Imagen1J2.getWidth(), lbl_Imagen1J2.getHeight(), Image.SCALE_SMOOTH);
        lbl_Imagen1J2.setIcon(new ImageIcon(image));
        
        //Display image on jlable
        ii = new ImageIcon(jugador2.getArtesMarciales().get(1).getImagen());
        //            Resize image to fit jlabel
        image = ii.getImage().getScaledInstance(lbl_Imagen2J2.getWidth(), lbl_Imagen2J2.getHeight(), Image.SCALE_SMOOTH);
        lbl_Imagen2J2.setIcon(new ImageIcon(image));
        
        //Display image on jlable
        ii = new ImageIcon(jugador2.getArtesMarciales().get(2).getImagen());
        //            Resize image to fit jlabel
        image = ii.getImage().getScaledInstance(lbl_Imagen3J2.getWidth(), lbl_Imagen3J2.getHeight(), Image.SCALE_SMOOTH);
        lbl_Imagen3J2.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_btn_ReasignarJ2ActionPerformed

    private void btn_Atacarse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Atacarse2ActionPerformed
        // TODO add your handling code here:
        juego.attackJugador();
        juego.attackNPC();
        
        
    }//GEN-LAST:event_btn_Atacarse2ActionPerformed

    private void btn_ReasignarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReasignarJ1ActionPerformed
        // TODO add your handling code here:
        juego.cambiarArtesJugador(jugador1);
        actualizarEtiquetas();
    }//GEN-LAST:event_btn_ReasignarJ1ActionPerformed

    private void btn_Jugador1AM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Jugador1AM1ActionPerformed
        // TODO add your handling code here:
        arteMarcialElegido = btn_Jugador1AM1.getText();
    }//GEN-LAST:event_btn_Jugador1AM1ActionPerformed

    private void btn_Jugador1AM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Jugador1AM2ActionPerformed
        // TODO add your handling code here:
        arteMarcialElegido = btn_Jugador1AM2.getText();
    }//GEN-LAST:event_btn_Jugador1AM2ActionPerformed

    private void btn_Jugador1AM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Jugador1AM3ActionPerformed
        // TODO add your handling code here:
        arteMarcialElegido = btn_Jugador1AM3.getText();
        System.out.println(arteMarcialElegido);
    }//GEN-LAST:event_btn_Jugador1AM3ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ActualizarJ1;
    private javax.swing.JButton btn_ActualizarJ2;
    private javax.swing.JButton btn_AtacarJ1;
    private javax.swing.JButton btn_AtacarJ2;
    private javax.swing.JButton btn_Atacarse2;
    private javax.swing.JButton btn_GenerarComboJ1;
    private javax.swing.JButton btn_GenerarGolpesJ2;
    private javax.swing.JButton btn_Jugador1AM1;
    private javax.swing.JButton btn_Jugador1AM2;
    private javax.swing.JButton btn_Jugador1AM3;
    private javax.swing.JButton btn_Jugador2AM1;
    private javax.swing.JButton btn_Jugador2AM2;
    private javax.swing.JButton btn_Jugador2AM3;
    private javax.swing.JButton btn_ReasignarJ1;
    private javax.swing.JButton btn_ReasignarJ2;
    private javax.swing.JButton btn_SeleccionarAMJ1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lbl_Imagen1J2;
    private javax.swing.JLabel lbl_Imagen2J2;
    private javax.swing.JLabel lbl_Imagen3J2;
    private javax.swing.JLabel lbl_ImagenJ1;
    private javax.swing.JTextArea lbl_Jugador1AM1;
    private javax.swing.JTextArea lbl_Jugador1AM2;
    private javax.swing.JTextArea lbl_Jugador1AM3;
    private javax.swing.JLabel lbl_Jugador2;
    private javax.swing.JTextArea lbl_Jugador2AM1;
    private javax.swing.JTextArea lbl_Jugador2AM2;
    private javax.swing.JTextArea lbl_Jugador2AM3;
    private javax.swing.JLabel lbl_Jugador3;
    private javax.swing.JLabel lbl_VIdaJ2;
    private javax.swing.JLabel lbl_VidaJ1;
    private javax.swing.JPanel panel_Fondo;
    private javax.swing.JPanel panel_Jugador1;
    private javax.swing.JPanel panel_Jugador2;
    private javax.swing.JTextArea txtA_BitacoraJ1;
    private javax.swing.JTextArea txtA_BitacoraJ2;
    // End of variables declaration//GEN-END:variables
}
