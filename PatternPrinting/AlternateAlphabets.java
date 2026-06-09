
import java.util.Scanner;

public class AlternateAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j =1 ; j<=n; j++){
                for(int k =1 ;k<=n ;k++){
                    System.out.print((char)(j+96)+ " ");
                    System.out.print((char)(k+64)+" ");
            }
            }
            
        System.out.println(" ");
        }
    }
}
