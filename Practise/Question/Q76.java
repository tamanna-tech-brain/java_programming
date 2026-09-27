package Question;

import java.util.Scanner;

public class Q76{
 public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T ; i++){
		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = N/2;
		    int D = N-C;
		        System.out.println((C*A)+(D*B));
		    
		}

	}
}