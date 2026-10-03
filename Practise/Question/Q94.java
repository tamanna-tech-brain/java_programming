package Question;

import java.util.Scanner;

public class Q94 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    int M = N/5;
		    int ans = N-M;
		    System.out.println(ans);
		}

	}
}
