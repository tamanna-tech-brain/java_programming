package Question;

import java.util.Scanner;

public class Q96 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    int ans = (N >= 2) ? (N - 2) / 7 + 1 : 0;
		    System.out.println(ans);
		    
		}

	}
}
