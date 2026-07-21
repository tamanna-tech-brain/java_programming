
import java.util.Scanner;

public class OutputIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0; i<n; i++){
            for(int j =0; j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println(arr.length+" "+arr[0].length);
        for(int i =0; i<n; i++){
            for(int j =0; j<m;j++){
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];
            }
            System.out.println("");
        }
        System.out.println(sum);
    }
}
