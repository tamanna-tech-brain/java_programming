package Recursion;

import java.util.Scanner;

public class UniquePath {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print(path(n,m));
    }
    public static int path(int n, int m){
        // if(n==1 || m==1) return 1;
        // return path(m-1,n) + (path(n-1,m));
        if(n==1 || m==1) return 1;
        if(n==0 || m==0) return 1;
        return path(m-1,n) + (path(n-1,m));
    }
}
