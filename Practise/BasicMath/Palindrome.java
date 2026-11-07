package Practise.BasicMath;

import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.print("false");
        }
     int dup =n;
     int T =0;
     while(n>0){
        int lastdigit = n%10;
        T = (10*T)+ lastdigit;
        n= n/10;
     }
     System.out.print(T== dup);
     }
}
