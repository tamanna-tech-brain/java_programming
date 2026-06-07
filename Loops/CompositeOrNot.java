
import java.util.Scanner;

public class CompositeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i<= Math.sqrt(n); i++){
            if(n %i ==0 ){
                flag = false;
                break;
            }
            
        }
        if(n==1) System.out.println("Neither prime not composite");
        else if(flag == false) System.out.print("Composite");
        else  System.out.println("Prime number");
    }
}
