package Question;
import java.util.Scanner;
public class Q82 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int A = sc.nextInt();
		    int X = sc.nextInt();
		    int B = sc.nextInt();
		    int Y = sc.nextInt();
		    if (A * Y > B * X) {
		        System.out.println("ALICE");
		    } else if (A * Y < B * X) {
		        System.out.println("BOB");
		    } else {
		        System.out.println("EQUAL");
		    }
		}

	}
}
