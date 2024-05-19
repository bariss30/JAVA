
package palindrom;

import java.util.Scanner;


public class Palindrom {

   
    public static void main(String[] args) {
      Scanner klavye=new Scanner (System.in);
     String ileti;
     char a,k;
     int n;
     boolean sonuc=true;
        System.out.println("lütfen bir cümle veya kelime giriniz ");
     ileti=klavye.nextLine();
     n=ileti.length()-1;
       for(int i=0;i<ileti.length()/2;i++){
       a=ileti.charAt(i);
       k=ileti.charAt(n);
        n--;
       if(a==k){
       sonuc=true;
continue ;
       }else
          sonuc=false;
       break;
           
       
       
       }
     if(sonuc==true){
         System.out.println("palindrom dur");
         
     
     }else System.out.println("palindrom DEGİLDİR");
   
        
        
        
    }
    
}
