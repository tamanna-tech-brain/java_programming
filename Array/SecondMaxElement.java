import java.util.Scanner;
public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array i: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]> max)
            max = arr[i];
        }
        for(int i =0; i<n; i++){
            if(arr[i] > smax && arr[i]!=max)
            smax = arr[i];
            }
        System.out.println(max + " ");
        System.out.println(smax+ " ");
        }
    }

