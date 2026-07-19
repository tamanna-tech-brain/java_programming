import java.util.Scanner;

public class KthMissing {
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
        int lo =0, hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int correctNo = mid +1;
            int missing = arr[mid] - correctNo;
            if(missing>=target) hi = mid-1;
            else lo = mid +1;
        }
        System.out.println(hi+1+target);
    }
}
