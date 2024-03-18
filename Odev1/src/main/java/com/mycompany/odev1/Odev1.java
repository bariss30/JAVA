/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev1;

/**
 *
 * @author Barış
 */
import java.util.Scanner;


public class Odev1 { 
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        char devam;
        
      stok CikolataStok = new stok(100, 0, 15,10,"Cikolata");
            stok makarnaStok = new stok(100, 0, 15,10,"makarna");
            stok MeyveSuyuStok = new stok(100, 0, 15,10,"meyvesuyu");
           
          
           
         
           
   
    
    
do{

    
      System.out.print("Satılan " + CikolataStok.geturunAdi() + " adedi: ");
            int satisAdedi = scanner.nextInt();
            CikolataStok.urunSatildi(satisAdedi);
     
     
    
     System.out.print("Satılan " + makarnaStok.geturunAdi() + " adedi: ");
            int satisAded2 = scanner.nextInt();
            makarnaStok.urunSatildi(satisAded2);
    
    
     System.out.print("Satılan " + MeyveSuyuStok.geturunAdi() + " adedi: ");
            int satisAded3 = scanner.nextInt();
            MeyveSuyuStok.urunSatildi(satisAded3);
    
    
    
    
    
    
    
    
     System.out.print("Devam etmek istiyor musunuz? (Evet için 'E' veya 'e' girin): ");
    
    devam = scanner.next().charAt(0);

}while (devam == 'E' || devam == 'e');
    
    
    
    
     makarnaStok.info(); 
    
    MeyveSuyuStok.info();
        CikolataStok.info();
    
    
    
    
    
    
      scanner.close();
    
    
    }
}
