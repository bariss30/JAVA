
package prime.numbers;

import java.util.Scanner;


public class PrimeNumbers {

  
    public static void main(String[] args) {
       Scanner klavye =new Scanner(System.in);
      int n;
      int knt=1;
      System.out.print("n e deger giriniz :");
  n= klavye.nextInt();
      
  int i=2;
  while(i<=n){
int j=2;
knt=1;
while(j<i){
if(i%j ==0){
knt =0;
break;
}
j++;
}      
  if(knt == 0) System.out.println(i+"  :asal degil");
  else System.out.println(i+"  :asal ");
  i++;
  }
    }
    
}
