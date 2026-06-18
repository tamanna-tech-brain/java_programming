import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    System.out.println("After segregation : "+ Arrays.toString(arr));
    }

}
