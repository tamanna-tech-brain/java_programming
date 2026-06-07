
import java.util.Scanner;

public class EvenNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i;
        int n = sc.nextInt();
        for(i =0; i<=n; i=i+2){
            System.out.print(i+ " ");
        }
        System.out.println();
        for(i =0; i<=n; i=i+2){
            if(i %2 ==0 ){
                System.out.print(i+ " ");
            }
            else{
                System.out.print("none");
            }
        }
    }
}
