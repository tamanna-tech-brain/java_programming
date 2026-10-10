package Hash;

import java.util.Scanner;

public class Precomputation {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for(int i=0; i<n-1; i++){
            hash[arr[i]] += 1;
        }
        System.out.print("num of q: " + " ");
        int q= sc.nextInt();
        System.out.print("val og q"+ " ");
        while(q--){
            int number;
            number =  sc.nextInt();
                System.out.print(hash[number] + " ");

    }
}
}
