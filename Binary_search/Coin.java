// import java.util.Scanner;

// public class Coin {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("length of arr : ");
//         int n = sc.nextInt();
//         System.out.print(arrangeCoins(n));
//     }
//     public static int arrangeCoins(int n){
//        long m = (long)n;
//        return (int) ((Math.sqrt(8*m+1) - 1) / 2);
//     }
// }

import java.util.Scanner;

public class Coin {
    public int sqrt(long n) {
        if(n==0) return 0;
        long lo =1, hi =n;
        while(lo<hi){
            long mid = lo + (hi -lo)/2;
            if(mid == n /mid) return (int)mid;
            else if(mid > n/mid) hi = mid -1;
            else lo = mid +1;
        }
        return (int)hi;
    }
    public static void main(String[] args){
        long n = 25;
        long m = (long)n;
        int result =  sqrt(8*m+1)- 1;
        System.out.println(result);
    }
}
