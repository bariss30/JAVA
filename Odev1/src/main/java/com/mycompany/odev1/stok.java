/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev1;

/**
 *
 * @author Barış
 */
public class stok {
    
    private int gelenAdet;
    private int satilanAdet;
    private double satisFiyati;
    private double gelisFiyati;
    private String urun;
     
    public stok(int gelenAdet ,int satilanAdet ,double satisFiyati,double gelisFiyati,String urun){
    this.gelenAdet=gelenAdet;
    this.satilanAdet=satilanAdet;
    this.satisFiyati=satisFiyati;
    this.gelisFiyati=gelisFiyati;
    this.urun=urun;
    }
       public double karOraniHesapla() {
       return ((satisFiyati - gelisFiyati) / gelisFiyati) * 100;
        }    
        public double urunFiyatiHesapla() {
        return gelisFiyati + (satisFiyati - gelisFiyati) ;
    }
        
        public void urunSatildi(int adet){
               if(adet<=gelenAdet -satilanAdet){
               satilanAdet=satilanAdet+adet;    
               }else{
               System.out.println("yetersiz ürün miktarı");}
           }
        public int getGelenAdet(){
        return gelenAdet;
   }
        public int getSatilanAdet(){
        return satilanAdet;
   }  
        public double getSatisFiyati(){
        return satisFiyati;
   }
        public double getGelisFiyati(){
        return gelisFiyati;      
   }
       public String geturunAdi(){
       return urun;
    }
       public void info(){
        System.out.println("ÜRÜN İSMİ :"+geturunAdi());
        System.out.println("GELEN ADET :"+getGelenAdet());
        System.out.println("SATİLAN ADET "+getSatilanAdet());
        System.out.println("GELİŞ FİYATI :"+getGelisFiyati());
        System.out.println("SATIŞ FİYATI :"+getSatisFiyati());
        System.out.println("KAR ORANI :%"+ karOraniHesapla());
    }
}
