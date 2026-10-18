package Recursion;
import java.util.Scanner;
public class SequenceToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    // public static void print(int x,int n){
    //     if(x>n) return;
    //     System.out.println(x);
    //     print(x+1, n);
    // }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1) System.out.print(n+" ");
    }
}
