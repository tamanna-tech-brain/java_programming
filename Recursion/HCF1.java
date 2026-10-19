package Recursion;

import java.util.Scanner;

public class HCF1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println(HCF(a,b));      
    }
    public static int HCF(int a, int b){
        if(a==0) return b;
        return HCF(b%a,a);
    }
}
