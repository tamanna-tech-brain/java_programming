package Practise.BasicMath;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 78;
        int b = 45;
        for(int i = 1; i<=a*b; i++){
        if(i%a==0 && i%b==0){
            System.out.print(i);
        }
     }
     System.out.print(a*b);
    }
}
