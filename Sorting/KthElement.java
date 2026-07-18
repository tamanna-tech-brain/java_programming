
import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 8,4,1,9,-3,6,5};
        int n = arr.length;
        System.out.print(" value of k: ");
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i< n-1; i++){
            int min  =  arr[i];
            int mindx = i;
            for(int j = i; j < n; j++){
               if(arr[j]<min){
                min = arr[j];
                mindx = j;
               }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
    }
    if(k>0 && k<=arr.length) {
    System.out.print(arr[k-1]);
    }else {
        System.out.print("error");
    }
    }
}
