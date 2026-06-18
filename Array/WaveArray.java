import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr.length; i+=2){
            if(i==arr.length-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.print(java.util.Arrays.toString(arr));
    }
}
