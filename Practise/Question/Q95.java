package Question;

import java.util.Scanner;

public class Q95 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    long fact =1;
		    for(int j =1; j<=N; j++){
		        fact*=j;
		    }
		    System.out.println(fact);
		}

	}
}
