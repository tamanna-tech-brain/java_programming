
import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array: ");
        int[] arr  = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            product *= arr[i];
        }
        System.out.println(product);
    }
}
