package Question;

import java.util.Scanner;

public class Q57 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int leftShoesToBuy = Math.max(0, N - M);
            int totalShoesToBuy = N + leftShoesToBuy;
            
            System.out.println(totalShoesToBuy);
		}

	}
}
