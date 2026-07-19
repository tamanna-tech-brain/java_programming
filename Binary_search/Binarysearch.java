
import java.util.Scanner;

public interface Binarysearch {
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
        boolean found = false;
        while(lower<=higher){
                int mid = (lower + higher) / 2;
                if(arr[mid]>target) {
                    higher = mid-1;
                }
                else if (arr[mid]<target) {
                    lower = mid+1;
                }
                else {
                    found =  true;
                    break;
                }
        }
        if(found) {
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
