/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Clases.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author jonathan.mata
 */
public class Transacciones extends javax.swing.JInternalFrame {
    
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
    
    private TableRowSorter TRSFiltro;
    TableRowSorter trs = null;
    Connection con = null;
    public static Connection conn;
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql://localhost:3306/bank_data";
    PreparedStatement ps;
    ResultSet rs;
    
    double aux=0,nuevo_valor=0;
    int y=0;
    String[][] cuentas = new String[20][4];
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

    /**
     * Creates new form Transacciones
     */
    public Transacciones() {
        initComponents();
        transparencia();
    }
    
    public void limpiar_cajas(){
        txt_saldo_nuevo.setText("");
        aux=0;
        nuevo_valor=0;
    }

    public void transparencia() {
        btn_10.setOpaque(false);
        btn_10.setContentAreaFilled(false);
        btn_10.setBorderPainted(false);
        btn_20.setOpaque(false);
        btn_20.setContentAreaFilled(false);
        btn_20.setBorderPainted(false);
        btn_40.setOpaque(false);
        btn_40.setContentAreaFilled(false);
        btn_40.setBorderPainted(false);
        btn_60.setOpaque(false);
        btn_60.setContentAreaFilled(false);
        btn_60.setBorderPainted(false);
        btn_80.setOpaque(false);
        btn_80.setContentAreaFilled(false);
        btn_80.setBorderPainted(false);
        btn_100.setOpaque(false);
        btn_100.setContentAreaFilled(false);
        btn_100.setBorderPainted(false);
        btn_buscar.setOpaque(false);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setBorderPainted(false);
        btn_retirar.setOpaque(false);
        btn_retirar.setContentAreaFilled(false);
        btn_retirar.setBorderPainted(false);
        btn_depositar.setOpaque(false);
        btn_depositar.setContentAreaFilled(false);
        btn_depositar.setBorderPainted(false);
        btn_limpiar.setOpaque(false);
        btn_limpiar.setContentAreaFilled(false);
        btn_limpiar.setBorderPainted(false);
        btn_pdf.setOpaque(false);
        btn_pdf.setContentAreaFilled(false);
        btn_pdf.setBorderPainted(false);
    }
    
    public void Cargar_Datos(){
        Connection conn = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM clientes WHERE dni=?");
            ps.setInt(1, Integer.parseInt(txt_cedula.getText()));
            rs = ps.executeQuery();
            if (rs.next()) {
                txt_cedula.setText(rs.getString("dni"));
                txt_nombre.setText(rs.getString("Nombres"));
                txt_apellido.setText(rs.getString("Apellidos"));
                txt_saldo.setText(rs.getString("Saldo"));
            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE EL NUMERO DE CEDULA");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void Nuevo_Valor(int valor){
        nuevo_valor+=valor;
        txt_saldo_nuevo.setText(String.valueOf(nuevo_valor));
    }
    
    public void Datos_Pdf(String tipo){
        cuentas[y][0]=txt_saldo.getText();
        cuentas[y][1]=tipo;
        cuentas[y][2]=txt_saldo_nuevo.getText();
        cuentas[y][3]=String.valueOf(nuevo_valor);
        y++;
    }
    
    public void Actualizar_Saldo(){
        
        Connection conn = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("UPDATE clientes SET Saldo=? WHERE dni=?");
            
            ps.setString(1, String.valueOf(nuevo_valor));
            ps.setString(2, txt_cedula.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "SU SALDO SE HA CARGADO");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR VERIFIQUE");
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        btn_10 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();
        btn_40 = new javax.swing.JButton();
        btn_80 = new javax.swing.JButton();
        btn_100 = new javax.swing.JButton();
        btn_60 = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_saldo = new javax.swing.JTextField();
        btn_retirar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_saldo_nuevo = new javax.swing.JTextField();
        btn_depositar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_pdf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/General_1.png"))); // NOI18N
        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 90));

        btn_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/General-1.png"))); // NOI18N
        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 90));

        btn_40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/General-2.png"))); // NOI18N
        btn_40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_40ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 90));

        btn_80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/General-3.png"))); // NOI18N
        btn_80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_80ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_80, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 120, 90));

        btn_100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/General-4.png"))); // NOI18N
        btn_100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_100ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_100, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 120, 90));

        btn_60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/General-5.png"))); // NOI18N
        btn_60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_60ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_60, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 120, 90));

        txt_nombre.setEditable(false);
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 260, -1));
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 260, -1));

        txt_apellido.setEditable(false);
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 260, -1));

        txt_saldo.setEditable(false);
        jPanel1.add(txt_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 260, -1));

        btn_retirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 60.png"))); // NOI18N
        btn_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 160, 50));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Component 1.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 170, 50));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SALDO EN CUENTA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TRANSACCIONES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 150, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C.I");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C.I");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("VALOR A CALCULAR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        txt_saldo_nuevo.setEditable(false);
        jPanel1.add(txt_saldo_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 260, 30));

        btn_depositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 59.png"))); // NOI18N
        btn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 170, 50));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 47.png"))); // NOI18N
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, 70));

        btn_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 63 (1).png"))); // NOI18N
        btn_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pdfActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 200, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 50.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 0, 1150, 600));

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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Cargar_Datos();
        aux=Double.parseDouble(txt_saldo.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        // TODO add your handling code here:
        Nuevo_Valor(10);
    }//GEN-LAST:event_btn_10ActionPerformed

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        // TODO add your handling code here:
        Nuevo_Valor(20);
    }//GEN-LAST:event_btn_20ActionPerformed

    private void btn_40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_40ActionPerformed
        // TODO add your handling code here:
        Nuevo_Valor(40);

    }//GEN-LAST:event_btn_40ActionPerformed

    private void btn_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_60ActionPerformed
        // TODO add your handling code here:
        Nuevo_Valor(60);
    }//GEN-LAST:event_btn_60ActionPerformed

    private void btn_80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_80ActionPerformed
        // TODO add your handling code here:
        Nuevo_Valor(80);

    }//GEN-LAST:event_btn_80ActionPerformed

    private void btn_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_100ActionPerformed
        // TODO add your handling code here:
        Nuevo_Valor(100);
    }//GEN-LAST:event_btn_100ActionPerformed

    private void btn_retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirarActionPerformed
        // TODO add your handling code here:
        /*Connection conn = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("UPDATE clientes SET Nombres=?,Apellidos=?,Saldo=? WHERE dni=?");

            ps.setString(1, txt_nombre.getText());
            ps.setString(2, txt_apellido.getText());
            ps.setString(3, txt_saldo.getText());
            ps.setString(4, txt_cedula.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "SU SALDO SE HA CARGADO");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR VERIFIQUE");
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }*/
        
        nuevo_valor=Double.parseDouble(txt_saldo.getText())-nuevo_valor;
        Datos_Pdf("Retiro");
        Actualizar_Saldo();
        Cargar_Datos();
        limpiar_cajas();
    }//GEN-LAST:event_btn_retirarActionPerformed

    private void btn_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositarActionPerformed
        // TODO add your handling code here:
        nuevo_valor+=Double.parseDouble(txt_saldo.getText());
        Datos_Pdf("Deposito");
        Actualizar_Saldo();
        Cargar_Datos();
        limpiar_cajas();
    }//GEN-LAST:event_btn_depositarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar_cajas();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pdfActionPerformed
        // TODO add your handling code here:
        Document documento = new Document();
       
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Proyecto_Final/Reporte_De_"+txt_nombre.getText()+".pdf"));
            documento.open();
            
            Chunk chunk = new Chunk("Reporte De Movimientos", chapterFont);
            //chunk.setBackground(BaseColor.GRAY);
            Chapter chapter = new Chapter(new Paragraph(chunk), 1);
            chapter.setNumberDepth(0);
            chapter.add(new Paragraph("Cliente: "+txt_nombre.getText()+" "+txt_apellido.getText(), paragraphFont));
            
            //documento.add(chapter);
            chapter.add(new Paragraph(" ", paragraphFont));
            documento.add(chapter);
            PdfPTable tabla = new PdfPTable(4);
            
            tabla.addCell("Saldo Anterior");
            tabla.addCell("Retiro/Depósito");
            tabla.addCell("V. Movimiento");
            tabla.addCell("Saldo Posterior");
            
            try {
                int i=0;
                while(i<=y){
                        tabla.addCell(cuentas[i][0]);
                        tabla.addCell(cuentas[i][1]);
                        tabla.addCell(cuentas[i][2]);
                        tabla.addCell(cuentas[i][3]);
                        i++;
                }
                    documento.add(tabla);     
                
            } catch (DocumentException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_btn_pdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_100;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_40;
    private javax.swing.JButton btn_60;
    private javax.swing.JButton btn_80;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_depositar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_pdf;
    private javax.swing.JButton btn_retirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_saldo_nuevo;
    // End of variables declaration//GEN-END:variables
}
