package Practise.BasicArray;

import java.util.Scanner;

public class CountArray {
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
    int  count =0;
       for(int i =0; i<n; i++){
    // int i =0;
    // while(n>i){
         if(arr[i]%2!=0){
            count++;
         }
         //i++;
       }
       System.out.print(count);
    }
}
