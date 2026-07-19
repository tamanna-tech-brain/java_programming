import java.util.Scanner;

public class OnceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of arr : ");
        int n = sc.nextInt();
        System.out.print("values of arr : " );
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)  arr[i] = sc.nextInt();
        if(n==1) System.out.println(arr[0]);
        if(arr[0] != arr[1]) System.out.println(arr[n-1]);
        if(arr[n-1] != arr[n-2]) System.out.println(arr[n-1]);
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) System.out.println(arr[mid]);
            int f = mid , s = mid;
            if(arr[mid-1] == arr[mid]) f = mid -1;
            else s = mid + 1;
            int leftcount = f-lo;
            int rightcount = hi -s;
            if(leftcount % 2 == 0 ) lo = s+1;
            else hi = f-1;
        }
    }
}
