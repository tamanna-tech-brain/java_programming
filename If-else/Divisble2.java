import java.util.Scanner;

public class Divisble2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();
        if (n % 5 ==0 ){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
