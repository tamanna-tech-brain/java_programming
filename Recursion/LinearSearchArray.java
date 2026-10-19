package Recursion;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int ele = 5;
        System.out.print(Search(arr,ele,0));
    }
    public static boolean Search(int[] arr, int ele, int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == ele) return true;
        return Search(arr,ele,idx+1 );
    }
}
