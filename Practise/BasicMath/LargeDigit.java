package Practise.BasicMath;

import java.util.Scanner;

public class LargeDigit {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.print(0);
        }
        int max =0;
         while(n>0){
         int lastDigit = n%10;
         if(lastDigit>max){
            max = lastDigit;
         }
         n=n/10;
         }
         System.out.print(max);
    }
}
