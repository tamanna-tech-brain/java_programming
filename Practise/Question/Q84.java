package Question;
import java.util.Scanner;

public class Q84 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = (500 - (X*2)) + (1000- ((X+Y) * 4));
		    int C = (1000- (Y*4))+ (500- ((X+Y) * 2));
		        System.out.println(Math.max(Z, C));
		}

	}
}
