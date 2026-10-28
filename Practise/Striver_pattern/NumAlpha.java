package Striver_pattern;

import java.util.Scanner;

public class NumAlpha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for(int i =0; i<n; i++){
    for(int j =0; j<=i; j++){
            char ch = (char) (65+i);
            System.out.print(ch);
        }
        System.out.println();
      }
    }
}
