package Recursion;
import java.util.Scanner;
public class 1Occur {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int result = Search(arr, tar, 0, n-1);
        System.out.print(result);
    }
    public static int Search(int[] nums, int tar, int lo, int hi){
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] == tar) {
            int first = Search(nums, tar, lo, mid-1);
            if(first != -1){
                return first;
            }
            return  mid;
        }
        else if (nums[mid] > tar) return Search(nums, tar, lo, mid - 1);
        else return Search(nums, tar, mid + 1, hi);
    }
}
