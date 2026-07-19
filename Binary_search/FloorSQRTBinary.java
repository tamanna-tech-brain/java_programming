import java.util.Scanner;

public class FloorSQRTBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of arr : ");
        int n = sc.nextInt();
        System.out.print("values of arr : " );
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long lower = 0;
        long higher = n;
        int result = -1;
        while(lower<=higher){
                long mid = (lower + higher) / 2;
                if(mid*mid == n) {
                    result = (int)mid;
                    break;
                }
                else if (mid*mid>n) {
                    higher = (int)mid-1;
                }
                else {
                    lower = mid+1;
                }
        }
        if(result != -1) {
            System.out.println("found"+" "+ " "+result);
        }
        else{
            System.out.println("Not found");
        }
    }
}
