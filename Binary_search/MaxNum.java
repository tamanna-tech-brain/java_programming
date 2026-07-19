import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of arr : ");
        int n = sc.nextInt();
        System.out.print("values of arr : " );
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("target: ");
        int target = sc.nextInt();
        int lower = 0;
        int higher = n-1;
        for (int i = 0; i < n; i++) {
            for(int j =0; j<n; j++){
                 if(arr[i]==arr[j] ){
                
                 }
            }
        }
    }
}
