import java.util.Scanner;

public class PrintN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of number : " );
        int i ;
        int n = sc.nextInt();
        for(i = 0; i<=n; i++){
            System.out.println(i);
        }
    }
}
