
import java.util.Scanner;

public class SideOfTriangle8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Side of triangle");
        }
        else{
            System.out.println("No ");
        }
    }
}
