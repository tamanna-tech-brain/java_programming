package Question;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter size of array");
        // int n = sc.nextInt();
        for(int i =0; i<=100; i++){
            System.out.print(i+ " ");
            // arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        for(int i =0; i<100; i++){
            if(i%2 ==0)
            System.out.print(i+ " ");
        }
    }
}
