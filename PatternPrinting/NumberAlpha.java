
import java.util.Scanner;

public class NumberAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n; i++){
            for(int j =1 ; j<=i ; j++){
                System.out.println(j);
                for(int k =1; k<=j; k++){
                    System.out.print((char)(k+64)+" ");
                }
            }
        System.out.println(" ");
        }
    }
}
