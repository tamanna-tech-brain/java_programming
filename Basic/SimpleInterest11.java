
import java.util.Scanner;

public class SimpleInterest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        double p = sc.nextInt();
        System.out.print("Enter the rate: ");
        double r = sc.nextInt();
        System.out.print("Enter the time: ");
        double t = sc.nextInt();
        double si = p+r+t / 100;
        System.out.print("simple interest is : ");
        System.out.println(si);
    }
}
