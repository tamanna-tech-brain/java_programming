import java.util.Scanner;

public class OddNo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i;
        int n = sc.nextInt();
        for(i =0; i<=n; i=i+3){
                System.out.print(i+ " ");
        }
    }
}
