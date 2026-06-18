import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array i: ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int i =0, j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr [j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        
    }

}
