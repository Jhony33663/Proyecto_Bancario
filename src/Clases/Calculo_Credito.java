/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static java.lang.Math.pow;
import javax.swing.JOptionPane;

/**
 *
 * @author Levi_V
 */
public class Calculo_Credito{
   
    
    public Calculo_Credito(){
        
    }
    
    public double Calculo_Amortización_D(Double Monto,int Meses){
        double Amortizacion=Monto/Meses;
        return Amortizacion;
    }
    
    public double Calculo_Interes_F(double Monto,double IPV){
        double Interes=Monto*IPV;
        return Interes;
    }
    
    public double Calculo_IPV(double Tasa_Nominal,int Meses){
        double IPV=(Tasa_Nominal/100)/Meses;
        return IPV;
    }
    
    public double Calculo_Tasa_Anual(double IPV,int Meses){
        double Tasa_Efectiva=((pow((1+IPV),Meses))-1)*100;
        return Tasa_Efectiva;
    }
    
    public double Calculo_MV(double Tasa_Efectiva){
        double MV=(pow((1+(Tasa_Efectiva/100)),(0.08333333333333)))-1;
        return MV;
    }
    
    public double Calculo_Cuota_F(double Monto,double MV,int Meses){
        double Cuota=(Monto*(MV*(pow((1+MV),Meses))))/((pow((1+MV),Meses))-1);
        return Cuota;
    }
    
    public double Calculo_Monto_Final(double Cuota,int Meses){
        double Monto_F=Cuota*Meses;
        return Monto_F;
    }
    
    
}
