package Recursion;

import java.util.Scanner;

public class NStair {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print(F(a));
    }
    public static int F(int a){
        if(a==1) return 1;
        if(a==2) return 2;
        return F(a-1) + F(a-2) ;
    }
}
