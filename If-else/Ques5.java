
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cp: ");
        int cp = sc.nextInt();
        System.out.print("Enter sp: ");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println("Profit is " + (sp-cp));
        }
        else if (cp>sp) {
            System.out.println("Lose is "+ (cp-sp));
        }
        else {
            System.out.println("No Profit No lose");
        }
    }
}
