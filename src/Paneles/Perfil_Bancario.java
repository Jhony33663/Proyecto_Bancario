/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.Data_clien;
import Clases.Sentences;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan.mata
 */
public class Perfil_Bancario extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form Perfil_Bancario
     */
    public Perfil_Bancario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_razon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_aviso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pefil");
        setToolTipText("");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("VALIDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 90, -1));

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 90, -1));
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 160, -1));
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 160, -1));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, -1));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, -1));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 150, -1));
        jPanel1.add(txt_razon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 150, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C.I:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombres:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Codigo Postal:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_signing_a_document_48px.png"))); // NOI18N
        jLabel2.setText("Perfil");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        lbl_aviso.setForeground(new java.awt.Color(255, 0, 51));
        lbl_aviso.setText("*CAMPO OBLIGATORIO");
        jPanel1.add(lbl_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 50.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 0, 1180, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiar(){
        txt_cedula.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_razon.setText("");
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txt_cedula.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor verifique los campos obligatorios", "ERROR", JOptionPane.WARNING_MESSAGE);
            lbl_aviso.setVisible(true);
        }
        if (txt_cedula.getText().length() == 10) {
            int c, suma = 0, acum, resta = 0;
            String lec;
            lec = txt_cedula.getText();
            String cedula = lec;
            for (int i = 0; i < cedula.length() - 1; i++) {
                c = Integer.parseInt(cedula.charAt(i) + "");
                if (i % 2 == 0) {
                    c = c * 2;
                    if (c > 9) {
                        c = c - 9;
                    }

                }
                suma = suma + c;
            }
            if (suma % 10 != 0) {
                acum = ((suma / 10) + 1) * 10;
                resta = acum - suma;
            }
            int ultimo = Integer.parseInt(cedula.charAt(9) + "");
            if (ultimo == resta) {

                JOptionPane.showMessageDialog(null, "CEDULA CORRECTA");
                if (txt_nombres.getText().isEmpty() && txt_direccion.getText().isEmpty() && txt_telefono.getText().isEmpty() && txt_razon.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor verifique los campos obligatorios", "ERROR", JOptionPane.WARNING_MESSAGE);
              
                } else {
                Sentences sen = new Sentences();
                Data_clien dat = new Data_clien();
                dat.setCedula(Integer.parseInt(txt_cedula.getText()));
                dat.setNombres(txt_nombres.getText());
                dat.setApellidos(txt_apellidos.getText());
                dat.setNumero(Integer.parseInt(txt_telefono.getText()));
                dat.setDireccion(txt_direccion.getText());
                dat.setCodigo_postal(Integer.parseInt(txt_razon.getText()));
                sen.envio_cliente(dat);
                
                }
            } else {
                JOptionPane.showMessageDialog(null, "CEDULA INCORRECTA");
            }
        } else {
            JOptionPane.showMessageDialog(null, "VERIFIQUE LOS DIGITOS DE LA CEDULA");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_aviso;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_razon;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}