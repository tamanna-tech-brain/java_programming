import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of arr : ");
        int n = sc.nextInt();
        System.out.print("values of arr : " );
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("x: ");
        int x = sc.nextInt();
        int lower = 0;
        int higher = n-1;
        int ans = -1;
        while(lower<=higher){
                int mid = (lower + higher) / 2;
                if(arr[mid]>x) {
                    higher = mid-1;
                }
                else {
                    ans = arr[mid];
                    lower = mid+1;
                }
                
        if(ans != -1) {
            System.out.println("found"+" "+ans+" ");
        }
        else{
            System.out.println("Not found");
        }
    }
    }
}
