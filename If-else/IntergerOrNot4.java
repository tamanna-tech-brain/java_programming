
import java.util.Scanner;

public class IntergerOrNot4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n -(int)n == 0){
            System.out.println(" Interger");
        }
        else{
            System.out.println(" Not integer");
        }
    }
}
