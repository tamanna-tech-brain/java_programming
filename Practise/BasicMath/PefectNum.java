package Practise.BasicMath;

import java.util.Scanner;

public class PefectNum {
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.print("false");
        }
        int sum =1; 
        for(int i =2; i*i<=n; i++){
            if(n%i==0){
                sum +=i;
                if(i*i !=n){
                    sum+=n/i;
                }
            }
        }
        System.out.print(sum==n);
     }
}
