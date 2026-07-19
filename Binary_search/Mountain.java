
import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-1 ,0 ,1, 4,34,54,13,6,7,5 ,2 ,1};
        int lo =0, hi = arr.length-2;
        int result = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                result =  mid;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                lo= mid+1;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                hi = mid -1;
            }
        }
            if(result != -1){
                System.out.println("found"+" "+result);
            }
            else{
                System.out.println("not found");
            }
    }
}
