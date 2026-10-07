package Question;

import java.util.Scanner;

public class Q104 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int H = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int normalAttacksOnly = (H + X - 1) / X;
		    
		    int remainingHealth = H - Y;
		    int specialAndNormal = 1 + (remainingHealth + X - 1) / X;
		    
		    int ans = Math.min(normalAttacksOnly, specialAndNormal);
		    
		    System.out.println(ans);
		}

	}
}
