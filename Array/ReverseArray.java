import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array i: ");
        int[] arr = new int[n];
        int i;
        for(i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for( i =0; i<n/2; i++){
                int temp = arr[i];
                arr[i] = arr[n-1-i];
                arr[n-1-i] = temp;
            }
            for( i =0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
        }
        
    }