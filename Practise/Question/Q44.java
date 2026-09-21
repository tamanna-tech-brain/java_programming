package Question;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size: ");
        int n = sc.nextInt();
        System.out.println("ELements: ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length-1; i++){
                if(arr[i] <arr[i+1]){
                System.out.println("true");
                }
                else{
                    System .out.println("false");
                }
        }

    }
}
