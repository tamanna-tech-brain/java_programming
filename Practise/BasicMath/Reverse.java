package Practise.BasicMath;

import java.util.Scanner;

public class Reverse {
     public static void main(String[] args) { 
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int T = 0;
      while(n>0){
        int lastdigit = n%10;
        T = (T*10)+lastdigit;
        n = n/10; 
      }
      System.out.print(T);
     }
}
