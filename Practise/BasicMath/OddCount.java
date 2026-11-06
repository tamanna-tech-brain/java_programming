package Practise.BasicMath;

import java.util.Scanner;

public class OddCount {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
      while(n>0){
        int lastdigit = n%10;
        if(lastdigit%2!=0){
            count++;
        }
        n=n/10;
      }
      return count;
    }
}
