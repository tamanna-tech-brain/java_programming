import java.util.Scanner;
public class RowWithMaxSum {
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
        int row = -1;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            int sum =0;
            for(int j = 0; j<m; j++){
                sum +=arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(row + " "+maxSum);
        
    }
}
