package Question;

import java.util.Scanner;

public class Q61 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = Y-X;
		    int P = (Z+7)/8;
		        System.out.println(P);
		}

	}
}
