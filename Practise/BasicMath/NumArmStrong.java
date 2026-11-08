package Practise.BasicMath;

import java.util.Scanner;

public class NumArmStrong {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        if(n<0) System.out.print("false");
        int dup =n;
        int sum =0; 
      while(n>0){
        int lastDigit = n%10;
        sum  = sum + (lastDigit+lastDigit+lastDigit);
        rev = (rev*10)+ sum;
        n= n/10;
      }
      System.out.print(dup == n) ;
    }
}
