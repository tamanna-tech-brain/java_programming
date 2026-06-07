import java.util.Scanner;

public class TErnaryInVariable12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int t = (n>=0) ? 100 : 0;

        System.out.println(t);
    }
}
