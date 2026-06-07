import java.util.Scanner;
public class Ternary11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        //condition ? sach : jhoot
        System.out.println(n + " " + ((n%2 ==0) ? "Even" : "Odd"));
    }
}
