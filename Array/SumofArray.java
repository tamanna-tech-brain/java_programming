import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.println("elements of array: ");
        int[] arr = new int[n];
        int sum =0;
        for(int i =1 ; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
            System.out.print(sum);
    }
}
