
import java.util.Scanner;

public class GreatestOfThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("a is bigger "+ (a));
        }
        else if (b>c && b>a){
            System.out.println("b is bigger " + (b));
        }
        else if (c>b && c>a){
            System.out.println("c is bigger " + (c));
        }
        else{
            System.out.println("None");
        }
    }
}
