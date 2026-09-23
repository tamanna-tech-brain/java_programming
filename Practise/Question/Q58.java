package Question;

import java.math.BigInteger;
import java.util.Scanner;

public class Q58 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    BigInteger k = BigInteger.ONE;
		    for(int j =1; j<=N; j++){
		        k = k.multiply(BigInteger.valueOf(j));
		    }
		    System.out.println(k);
		}

	}
}
