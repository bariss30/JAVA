/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev2;

/**
 *
 * @author Barış
 */






public class Odev2 {

    public static void main(String[] args) {
    
        fraction kesir1 =new fraction();
        fraction kesir2 =new fraction();
        fraction toplam=new fraction();
        kesir1.setpay(3);
        kesir2.setpay(3);
     if( kesir1.kontr1(kesir1.setpayda(5))==true  &&kesir2.kontr1(kesir2.setpayda(4))==true  ){
         if(kesir1.getPayda()==kesir2.getPayda()){
       double sonuc=  toplam.topla(kesir1.kesirolustur(kesir1.getPay(), kesir1.getPayda()),kesir2.kesirolustur(kesir2.getPay(), kesir2.getPayda()) );
             System.out.println("toplam:"+sonuc);
         }
             else{
                     System.out.println("paydalar aynı olmak zorunda");
                     }
         
    
     }
 

        
    }
}
