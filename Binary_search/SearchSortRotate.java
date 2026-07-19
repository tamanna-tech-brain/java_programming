import java.util.Scanner;

public class SearchSortRotate {
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
        int tar = sc.nextInt();
        int lo = 0, hi = arr.length -1;
        while(lo<=hi){
            int mid = lo + (hi-lo) /2;
             if(arr[mid]==tar) { System.out.println(mid);
             return;
             }
             else if(arr[lo]<= arr[mid]){
             if(arr[lo]<=tar && tar<arr[mid]) hi = mid-1;
             else lo = mid+1;
             }
             else{
                if(arr[mid]<tar && tar<=arr[hi]) lo = mid+1;
                else hi = mid - 1;
             }
        }
        System.out.println( -1);
    }
}
