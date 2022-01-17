/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Levi_V
 */
public class Datos_Credito extends Calculo_Credito{
    double Monto,Monto_F,MV,Tasa_Nominal=15.2,Tasa_Efectiva,IPV,Cuota;
    double Interes_Mensual,Amortización;
    int Meses;
    String Tipo_Pago;
    double aux=0;
    
    DecimalFormat formateador = new DecimalFormat("############.##");
    
    public Datos_Credito(){
        
    }
    
    public void Forma_Pago(){
        IPV=Calculo_IPV(Tasa_Nominal,Meses);
        Tasa_Efectiva=Calculo_Tasa_Anual(IPV,Meses);
        MV=Calculo_MV(Tasa_Efectiva);
        if(Tipo_Pago.equals("Cuota Fija")){
            Cuota=(Calculo_Cuota_F(Monto,MV,Meses));
            Monto_F=Calculo_Monto_Final(Cuota,Meses);
            
        }else if(Tipo_Pago.equals("Cuota Decreciente")){
            Amortización=Calculo_Amortización_D(Monto, Meses);
        }
    }
    
    public void Mostrar_Tabla_F(DefaultTableModel model){
        
        for(int i=0;i<=Meses;i++){
            if(i==0){
                model.insertRow(model.getRowCount(), new Object[]{
                i,Monto,"-","-","-"});
            }else{
            model.insertRow(model.getRowCount(), new Object[]{
                i,formateador.format(Monto),formateador.format(Amortización),formateador.format(Interes_Mensual),formateador.format(Cuota)});
            }
            Interes_Mensual=Calculo_Interes_F(Monto, MV);
            Amortización=Cuota-Interes_Mensual;
            Monto-=Amortización;
        }
    }
    
    public void Mostrar_Tabla_D(DefaultTableModel model){
        
        for(int i=0;i<=Meses;i++){
            if(i==0){
                model.insertRow(model.getRowCount(), new Object[]{
                i,Monto,"-","-","-"});
            }else{
            model.insertRow(model.getRowCount(), new Object[]{
                i,formateador.format(Monto),formateador.format(Amortización),formateador.format(Interes_Mensual),formateador.format(Cuota)});
            }
            aux+=Cuota;
            Interes_Mensual=Calculo_Interes_F(Monto, MV);
            Cuota=Amortización+Interes_Mensual;
            Monto-=Amortización;
            
        }
        
        Monto_F=aux;
        aux=0;
    }

    public Datos_Credito(double Monto, int Meses, String Tipo_Pago) {
        this.Monto = Monto;
        this.Meses = Meses;
        this.Tipo_Pago = Tipo_Pago;
    }

    public double getMonto_F() {
        return Monto_F;
    }

    public void setMonto_F(double Monto_F) {
        this.Monto_F = Monto_F;
    }
    
    public String getTipo_Pago() {
        return Tipo_Pago;
    }

    public void setTipo_Pago(String Tipo_Pago) {
        this.Tipo_Pago = Tipo_Pago;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public double getMV() {
        return MV;
    }

    public void setMV(double MV) {
        this.MV = MV;
    }

    public double getTasa_Nominal() {
        return Tasa_Nominal;
    }

    public void setTasa_Nominal(double Tasa_Nominal) {
        this.Tasa_Nominal = Tasa_Nominal;
    }

    public double getTasa_Efectiva() {
        return Tasa_Efectiva;
    }

    public void setTasa_Efectiva(double Tasa_Efectiva) {
        this.Tasa_Efectiva = Tasa_Efectiva;
    }

    public double getIPV() {
        return IPV;
    }

    public void setIPV(double IPV) {
        this.IPV = IPV;
    }

    public double getCuota() {
        return Cuota;
    }

    public void setCuota(double Cuota) {
        this.Cuota = Cuota;
    }

    public double getInteres_Mensual() {
        return Interes_Mensual;
    }

    public void setInteres_Mensual(double Interes_Mensual) {
        this.Interes_Mensual = Interes_Mensual;
    }

    public double getAmortización() {
        return Amortización;
    }

    public void setAmortización(double Amortización) {
        this.Amortización = Amortización;
    }

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int Meses) {
        this.Meses = Meses;
    }
    
    public void Prueba(){
        JOptionPane.showMessageDialog(null, Tipo_Pago);
    }
    
}
