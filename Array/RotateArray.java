import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();

        System.out.print("Elements of array i: ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter number of rotation: ");
        int d = sc.nextInt();
        d %= n;
        reverse(arr ,0, d-1);
        reverse(arr ,d, n-1);
        reverse(arr ,0, n-1);

        System.out.println("Rotated array: ");
        for (int val : arr){
            System.out.println(val +" ");
        } 
    }
}
        public static void reverse(int[] arr, int i, int j){
           while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        }