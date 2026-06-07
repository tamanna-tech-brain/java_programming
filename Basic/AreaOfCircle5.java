
import java.util.Scanner;

public class AreaOfCircle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius: ");
        double r = sc.nextDouble();
        double pie = 3.141592;
        double area = pie*r*r;
        System.out.println(area);
    }
}
