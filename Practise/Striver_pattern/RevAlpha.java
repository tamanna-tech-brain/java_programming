package Striver_pattern;

import java.util.Scanner;

public class RevAlpha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for(int i =1; i<=n; i++){
         for(int j=n-i; j<n; j++){
            char ch = (char)(j+65);
            System.out.print(ch+" ");
        }
        System.out.println();
       }
    }
}
