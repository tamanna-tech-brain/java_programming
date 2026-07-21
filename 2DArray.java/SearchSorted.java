import java.util.Scanner;

public class SearchSorted {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] brr = new int[m][n];
        for(int i =0; i<n; i++){
            for(int j =0; j<m;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println("");
        }
        int target = sc.nextInt();
        int i =0, j=n-1;
        while(j<=0 && i<m){
            if(arr[i][j]>target) j--;
            else if(arr[i][j]<target) i++;
            else System.out.println("true");
            return;
        }
        System.out.println("false");
}
}