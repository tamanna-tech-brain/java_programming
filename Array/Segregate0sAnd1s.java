import java.util.Arrays;
import java.util.Scanner;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int countZero = 0;
        for (int num : arr) {
            if (num == 0) {
                countZero++;
            }
        }
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }
        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println("Array after segregation: " + Arrays.toString(arr));
    }
}
