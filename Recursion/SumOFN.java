package Recursion;

import java.util.Scanner;

public class SumOFN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
    }
    public static void sum(int n){
        if(n==0) {
            System.out.print(0);
        }
        System.out.print(n*(n+1)/2);
    }
}
