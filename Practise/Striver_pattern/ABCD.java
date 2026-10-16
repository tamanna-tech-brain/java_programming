package Practise.Striver_pattern;

import java.util.Scanner;

public class ABCD {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for(int i =1; i<=n; i++){
        for(int j =1; j<=i; j++){
            char ch = (char) (65+j-1);
            System.out.print(ch);
            if(j<i){
                System.out.print("");
            }
        }
        System.out.println();
      }
     }
}
