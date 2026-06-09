
import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){  // kitni lines hongi
            for(int j =1; j<=n; j++){   //har line me kitna * print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
