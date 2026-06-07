
import java.util.Scanner;

public class FourDigitNo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();
        if(n >999 && n <10000){
            System.out.println("no is 4 digit number");
        }
        else{
            System.out.println("No");
        }
    }
}
