package Recursion;

import java.util.Scanner;

public class RecursionOnArryas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter values of n : ");
        int[] arr = new int[n];
        for(int i= 0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        recArray(arr,0);
    }
        public static void recArray(int[] arr, int idx ){
        int n = arr.length;
        if(idx == n) return;
        System.out.print(arr[idx]+ " ");
        recArray(arr, idx+1);
    }
}
