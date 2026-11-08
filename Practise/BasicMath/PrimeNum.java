package Practise.BasicMath;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
           System.out.print("false");
          }
          int count =0;
          for(int i=1; i*i<=n; i++){
            if(n%i==0){
                count++;
                if((n/i)!=i)
                count++;
            }
          }
          if(count == 2) System.out.print("true");
          else System.out.print("false");
    }
}
