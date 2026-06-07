
import java.util.Scanner;

public class ApTON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i;
        int a=4, d=6;
        for (i = 1; i<=n; i++){
            System.out.print(a+ " ");
            a += d;
        }
    }
}
