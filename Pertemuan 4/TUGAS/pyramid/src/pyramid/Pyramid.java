/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pyramid;
import java.util.Scanner;

/**
 *
 * @author rizki
 */


public class Pyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
          Scanner in = new Scanner (System.in);
        int cetak;
        
//        System.out.print("Pilihan : \n"
//                + "1. Cetak 1 \n"
//                + "2. Cetak 2 \n"
//                + "3. cetak 3 \n"
//                + "4. Cetak 4 \n"
//                + "5. Cetak 5 \n"
//                + " Masukan pilihan :");
        
        System.out.println("Pilihan :");
        System.out.println("1.Cetak 1");
        System.out.println("2.Cetak 2");
        System.out.println("3.Cetak 3");
        System.out.println("4.Cetak 4");
        System.out.println("5.Cetak 5");
        System.out.println("6.Cetak 6");
            System.out.print("Masukan Pilihan :");
            cetak = in.nextInt();
        
        
        
        switch(cetak)
        {
            
            case 1:
            
        System.out.println("Cetak 1");

         int a,b;
    for(a = 1; a <= 5; a++) 
    {
       for(b = 1; b <= 5; b++)
       {
          System.out.print("*"+" ");
       }
       System.out.println();
    }
  break;
    
  
            case 2:
        System.out.println("\nCetak 2");
    
     int c,d;
      for(c = 1; c <= 5; c++)
      {
         for(d = 0;d < c; d++)
         {
            System.out.print("*"+" ");
         }
         System.out.println();
      }
      break;
      
      
      
            case 3:
        System.out.println("\ncetak 3");
      
      int e = 5;
        int count = e - 1;
        for (int k = 1; k <= e; k++) {
            for (int i = 1; i <= count; i++)
               System.out.print(" ");
               count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
                System.out.println();
        }
        break;
    
        
            case 4:
        System.out.println("\n Cetak 4");
        
        int n = 5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
      if((j==1 || j==n) || (i==1 || i==n))
      {
         System.out.print(" *");//1 space
      }else
      {
          System.out.print("  ");//2 spaces
      }
      }
      System.out.println();
    }
        break;
        
        
            case 5:
        System.out.println("\ncetak 5");
           
         int number = 5;
        for (int i = 0; i < number; ++i){
            for (int j = 0; j <= i; ++j){
                System.out.print("*");
            }
 
            if (i != number - 1) {
                System.out.print(" ");
            } else {
                System.out.print(" *");
            }
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
 
            System.out.println();
        }
    
        break;
        
            case 6:
                
                
                break;
        
            default:
                System.out.println("Salah Pilih ,mas");
        
}
    }
    
}

