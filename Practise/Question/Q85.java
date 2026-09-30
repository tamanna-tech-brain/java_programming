package Question;

import java.util.Scanner;

public class Q85 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if((A > B && A < C) || (A > C && A < B)) {
		        System.out.println(A);
		    } else if ((B > A && B < C) || (B > C && B < A)) {
		        System.out.println(B);
		    } else {
		        System.out.println(C);
		    }
		}

	}
}
