package Question;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int n = sc.nextInt();
        System.out.println("element of array : ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
