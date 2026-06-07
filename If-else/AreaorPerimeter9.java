
import java.util.Scanner;

public class AreaorPerimeter9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l: ");
        int l = sc.nextInt();
        System.out.print("Enter w: ");
        int w = sc.nextInt();
        int area = l*w;
        int perimeter = 2*(l*w);
        if(area > perimeter) {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
