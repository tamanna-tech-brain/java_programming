import java.util.Scanner;

public class Searchsortmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row : ");
        int rows = sc.nextInt();
        System.out.print("col : " );
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
    }
        System.out.print("target: ");
        int target = sc.nextInt();
        int lo = 0, hi = rows*cols-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midRow = mid/cols, midcol = mid%cols;
            if(arr[midRow][midcol]==target){
                System.out.println("Target found : true");
            return;
            }
            else if(arr[midRow][midcol]>target) hi = mid -1;
            else lo = mid +1;
        }
        System.out.println("false");

    }
}
