import java.util.Scanner;

public class LargestElmentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.println("Elements of array: ");
        int[] arr = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max)
            max=arr[i];
        }   
            System.out.print(max);
    }
}
