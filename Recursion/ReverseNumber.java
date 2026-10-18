package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n,0);
    }
    public static void reverse(int n, int rev){
        if(n==0) {
            System.out.print(rev);
            return;
        }
        System.out.print(rev+" ");
        int digit = n%10;
        rev = rev*10+digit;
        reverse(n/10, rev);
        }
}
