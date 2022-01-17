/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.Calculo_Credito;
import Clases.Datos_Credito;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Levi_V
 */
public class Simulador_Credito extends javax.swing.JInternalFrame {

    /**
     * Creates new form Simulador_Crédito
     */
    
    DefaultTableModel model=new DefaultTableModel();
    public Simulador_Credito() {
        initComponents();
        model = (DefaultTableModel) jtb_tabla.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_meses = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbx_pago = new javax.swing.JComboBox<>();
        btn_calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_tabla = new javax.swing.JTable();
        lbl_nominal = new javax.swing.JLabel();
        lbl_efectiva = new javax.swing.JLabel();
        lbl_valorfinal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("INGRESE EL MONTO A SOLICITAR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setText("SIMULADOR DE CRÉDITO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_monto.setBackground(new java.awt.Color(51, 51, 0));
        txt_monto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("$");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CUOTA A Nº MESES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cbx_meses.setBackground(new java.awt.Color(51, 51, 0));
        cbx_meses.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbx_meses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "24", "36", "48" }));
        getContentPane().add(cbx_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("VALOR FINAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("TASA EFECTIVA(%)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("TASA NOMINAL (%)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Pago");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        cbx_pago.setBackground(new java.awt.Color(51, 51, 0));
        cbx_pago.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbx_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuota Fija", "Cuota Decreciente" }));
        getContentPane().add(cbx_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 150, -1));

        btn_calcular.setBackground(new java.awt.Color(51, 51, 0));
        btn_calcular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_calcular.setText("CALCULAR");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 130, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA CUOTAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jScrollPane1.setOpaque(false);

        jtb_tabla.setBackground(new java.awt.Color(240, 240, 240));
        jtb_tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jtb_tabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtb_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PERIODO", "SALDO", "CAPITAL", "INTERÉS", "CUOTA"
            }
        ));
        jtb_tabla.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jtb_tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 320));

        lbl_nominal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nominal.setText("0");
        getContentPane().add(lbl_nominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lbl_efectiva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_efectiva.setText("0");
        getContentPane().add(lbl_efectiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        lbl_valorfinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_valorfinal.setText("0");
        getContentPane().add(lbl_valorfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "INTERESES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 420, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Group 50.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-560, -440, 1490, 840));
        jLabel1.getAccessibleContext().setAccessibleDescription("");
        jLabel1.getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        DecimalFormat formateador = new DecimalFormat("############.##");
        
        if(!txt_monto.getText().isEmpty()){
            Datos_Credito dat=new Datos_Credito(Double.parseDouble(txt_monto.getText()), 
                    Integer.parseInt(cbx_meses.getSelectedItem().toString()), cbx_pago.getSelectedItem().toString());
            dat.Forma_Pago();
            
            model.setRowCount(0);
            if(cbx_pago.getSelectedIndex()==0){
                dat.Mostrar_Tabla_F(model);
            }else if(cbx_pago.getSelectedIndex()==1){
                dat.Mostrar_Tabla_D(model);
            }
            lbl_nominal.setText(String.valueOf((formateador.format(dat.getTasa_Nominal()))));
            lbl_efectiva.setText(String.valueOf((formateador.format(dat.getTasa_Efectiva()))));
            lbl_valorfinal.setText(String.valueOf(formateador.format(dat.getMonto_F())));
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un valor en el monto");
        }
        
        
    }//GEN-LAST:event_btn_calcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JComboBox<String> cbx_meses;
    private javax.swing.JComboBox<String> cbx_pago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_tabla;
    private javax.swing.JLabel lbl_efectiva;
    private javax.swing.JLabel lbl_nominal;
    private javax.swing.JLabel lbl_valorfinal;
    private javax.swing.JTextField txt_monto;
    // End of variables declaration//GEN-END:variables
}