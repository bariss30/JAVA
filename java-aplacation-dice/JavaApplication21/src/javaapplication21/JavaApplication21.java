
package javaapplication21;

import java.util.Scanner;

public class JavaApplication21 {

    public static void main(String[] args) {
        
        Scanner klavye =new Scanner(System.in);
        int kacKere,zar1,zar2;
           System.out.print("kac kere atmak istersin :");
        kacKere = klavye.nextInt();
        
        for(int i=0;i<kacKere;i++)
        {
        zar1= ((int)(Math.random()*6)+1);
        zar2= ((int)(Math.random()*6)+1);

        System.out.println(i+1+". atis  " +zar1+" -"+zar2);
        
        
        
        switch(zar1){
            case 1 :System.out.println("[.]");     break;
        case 2: System.out.println("[: ]"); break;
case 3: System.out.println("[:. ]"); break;
case 4: System.out.println("[:: ]"); break;
case 5: System.out.println("[::. ]"); break;
case 6: System.out.println("[::: ]"); break;

         
        }
        
        switch (zar2)
{
case 1: System.out.println("[. ]"); break;
case 2: System.out.println("[: ]"); break;
case 3: System.out.println("[:. ]"); break;
case 4: System.out.println("[:: ]"); break;
case 5: System.out.println("[::. ]"); break;
case 6: System.out.println("[::: ]"); break;

        }
        
        }
        
        
    }
    
}
