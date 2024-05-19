
package tas.kagit.makas;
import java.util.Scanner;

public class TasKagitMakas {

    
    public static void main(String[] args) {
    Scanner klavye =new Scanner(System.in);
int sayi, n,ev=0,dep=0;
int  player1,computer;
        System.out.print("kac el oynamak istersiniz   :");
        n=klavye.nextInt();
        
for(int i=0;i<n;i++){
sayi = (int) (Math.random()*3);
    //0 tas  1 kagit 2 makas
    System.out.println();
System.out.println("yapmak istediginiz sembolu tuslayiniz   ------> tas (0)  , kagit (1), makas  (2)");    
    player1=klavye.nextInt();
computer=sayi;

 

if(player1==0 && computer ==1){
System.out.println("computer  :  kagit ");
    System.out.println("player1   : tas");
    dep++;
    System.out.println("player1  : "+ev+"  computer   :"+dep);


}
else if(player1==0 && computer ==2){
System.out.println("computer  :  makas ");
    System.out.println("player1   : tas");
ev++;
    System.out.println("player1  : "+ ev +"  computer   :"+dep);


}
else if(player1==1 && computer ==0){
System.out.println("computer  :  tas ");
    System.out.println("player1   : kagit");
    ev++;
    System.out.println("player1  : "+ ev +"  computer   :"+dep);




}
else if(player1==1 && computer ==2){
System.out.println("computer  :  makas ");
    System.out.println("player1   : kagit");
dep++;
    System.out.println("player1  : "+ev+"  computer   :"+dep);



}
else if(player1==2 && computer ==0){
System.out.println("computer  :  tas ");
    System.out.println("player1   : makas");
dep++;
    System.out.println("player1  : "+ev+"  computer   :"+dep);



}
else if(player1==2 && computer ==1){
System.out.println("computer  :  kagit ");
    System.out.println("player1   : makas");
ev++;
    System.out.println("player1  : "+ ev +"  computer   :"+dep);




}
else{
   
    System.out.println("BERABERE");
  System.out.println("player1  : "+ ev +"  computer   :"+dep);


}













}    
    
        System.out.println();
     
        System.out.println();
    


    if(ev > dep){
    
        System.out.println("player1 WIIIIN !!!!");
    }else if(dep>ev){
    
        System.out.println("computer WIIIIN !!! ");
    }else System.out.println("DRAW");

    
    
    



    
        
        
        
        
        
        
        
        
        
        
    }
    
}
