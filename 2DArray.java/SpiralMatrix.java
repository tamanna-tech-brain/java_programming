import java.util.*;

public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> ans = spirallyTraverse(arr, n, m);

        System.out.println(ans);
    }

    public static ArrayList<Integer> spirallyTraverse(int[][] arr, int n, int m){

        ArrayList<Integer> ans = new ArrayList<>();

        int firstRow = 0;
        int lastRow = n - 1;
        int firstCol = 0;
        int lastCol = m - 1;

        int count = 0;
        int total = n * m;

        while(count < total){

            // Top Row
            for(int j = firstCol; j <= lastCol && count < total; j++){
                ans.add(arr[firstRow][j]);
                count++;
            }
            firstRow++;

            // Right Column
            for(int i = firstRow; i <= lastRow && count < total; i++){
                ans.add(arr[i][lastCol]);
                count++;
            }
            lastCol--;

            // Bottom Row
            for(int j = lastCol; j >= firstCol && count < total; j--){
                ans.add(arr[lastRow][j]);
                count++;
            }
            lastRow--;

            // Left Column
            for(int i = lastRow; i >= firstRow && count < total; i--){
                ans.add(arr[i][firstCol]);
                count++;
            }
            firstCol++;
        }

        return ans;
    }
}