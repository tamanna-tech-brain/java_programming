package Practise.Array;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of numbers: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }        
        System.out.println("The elements of the array are:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[5]);
        arr[3] = 10;
        System.out.println(arr[3]);
    }
}
