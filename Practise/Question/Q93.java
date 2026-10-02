package Question;

import java.util.Scanner;

public class Q93 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int R = sc.nextInt();
		    int totalSticks = X + (R / 30);
		    int plates = (totalSticks + Y - 1) / Y;
		    
		    System.out.println(plates);
		}

	}
}
