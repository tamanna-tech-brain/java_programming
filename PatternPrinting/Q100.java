import java.util.Scanner;

public class Q100 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int K = sc.nextInt();
		    int M = Math.abs(A-B);
		    int L = (M+K-1)/K;
		    System.out.println(L);
		}

	}
}
