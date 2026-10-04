package Question;

import java.util.Scanner;

public class Q97 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		    int R = sc.nextInt();
		    int O = sc.nextInt();
		    int C = sc.nextInt();
		     int remainingOvers = 20 - O;
        
        int maxScore = C + (remainingOvers * 36);
        
        if (maxScore > R) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}
}
