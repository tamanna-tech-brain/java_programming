package Question;

import java.util.Scanner;

public class Q92 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int gold = 0;
		    
		    // Check if Chef's first race (X) does not clash with the rival's races
		    if(X != A && X != B) {
		        gold++;
		    }
		    
		    // Check if Chef's second race (Y) does not clash with the rival's races
		    if(Y != A && Y != B) {
		        gold++;
		    }
		    
		    System.out.println(gold);
		}

	}
}
