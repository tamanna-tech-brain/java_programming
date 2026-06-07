
import java.util.Scanner;

public class OddOrEven1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter number: ");
       int a = sc.nextInt();
       if( a % 2 == 0){
        System.out.println("Even");
       }
       else{
        System.out.println("Odd");
       }
    }
}
