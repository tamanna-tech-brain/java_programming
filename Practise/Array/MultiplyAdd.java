package Array;
import java.util.Scanner;
public class MultiplyAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.println("Elements of array: ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            if(arr[i]%2==0){
                System.out.println(2*arr[i]);
            }
            else{
                System.out.println(10+arr[i]);
            }
        }
    }
}
