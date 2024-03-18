/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev2;

/**
 *
 * @author Barış
 */
public class fraction {
    
    private double   pay;
    private  double  payda;
    
    
    
    public  double topla(double kesir1,double kesir2 ){
    
    return kesir1+kesir2;
    }
    
    
    public double kesirolustur(double pay,double payda ){
    
            double  x = (pay/payda);
    return x;
    }
    
        public double  getPay() {
        return this.pay;
    }

    public double  getPayda() {
        return this.payda;
    }
    
    
    public double   setpay(int pay){
    return this.pay=pay;
    
    }
    
     public double  setpayda(int payda){
   return  this.payda=payda;
    
    }
    
     
     
     public boolean kontr1(double payda ){
     boolean kontrol=true;
     
     
     if(payda ==0){
     kontrol=false;
         System.out.println("Payda 0 olamaz ");
     
     }
     
     return kontrol;
     
     }
     
     
      
     public boolean kontr2(double payda1,double payda2 ){
     boolean kontrol=true;
     
     
     if(payda1 ==payda2 ){
     kontrol=true;
     }
     else{
     kontrol=false;
     }
     
     return kontrol;
     
     }
     
     
    
    
    
    
    
    
    
}
