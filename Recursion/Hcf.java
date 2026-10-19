package Recursion;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println(HCF(a,b));      
    }
    public static int HCF(int a, int b){
        int hcfv = 1;
        if(b==0) return a;
        for(int i = 1; i<=a; i++){
            if(a%i==0 && b%i==0){
                hcfv = i;
            }
        }
        return hcfv;
    }
}
