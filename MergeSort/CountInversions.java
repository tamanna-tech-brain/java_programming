package MergeSort;

import java.util.Scanner;

public class CountInversions {
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i =0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
        int count =0;
        for(int i=0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                if(arr[i] > arr[j]) 
                    count++;
            }
        }
        for(int i =0; i<n; i++){
            System.out.print(count+ " ");
        }

    }
}
