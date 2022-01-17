/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.lang.Error;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Frames.Register;
import Frames.Welcome_bs;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author jonathan.mata
 */
public class Sentences extends Conexion {

    public void registro(Data env) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO acceso (user,psswd) VALUES(?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, env.getUser());
            ps.setString(2, env.getPsswd());

            ps.execute(); //ejecutar la sentencia

        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }

    public void login(Data_log da) {
        try {
            // Conexion de base de datos
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_data", "root", "");
            //Llegar a la tabla -->ps
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM acceso");
            ResultSet rs = ps.executeQuery();
            ResultSet r = ps.executeQuery("SELECT * FROM acceso where user=\"" + da.getUser() + "\" and psswd=\"" + da.getPsswd() + "\" ");
            boolean found = false;
            while (r.next()) {
                found = true;
            }
            if (found) {
                Welcome_bs wel = new Welcome_bs();
                wel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ACCESO DENEGADO");
                JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void envio_cliente(Data_clien dclien) {
        try {
            //conexion a bd
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_data", "root", "");
            //datos y transformo a valores correspondientes
            //consuta a la tabla
            PreparedStatement ps = null;
            ps = conn.prepareStatement("INSERT INTO `clientes`(`dni`, `Nombres`,`Apellidos`, `Telefono`, `Direccion`, `Razon`, `Saldo`)" + "VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1, dclien.getCedula());
            ps.setString(2, dclien.getNombres());
            ps.setString(3, dclien.getApellidos());
            ps.setInt(4, dclien.getNumero());
            ps.setString(5, dclien.getDireccion());
            ps.setInt(6, dclien.getCodigo_postal());
            ps.setDouble(7, dclien.getSaldo());

            //ejecute consulta y valores
            //execute accion de incerscion 
            //res envia msg
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "VALORES ALMACENADOS");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ALMACENAR LOS DATOS...");
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
