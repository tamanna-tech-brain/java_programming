package Question;

import java.util.Scanner;

public class Q74 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++){
		   int W = sc.nextInt();
		   int X = sc.nextInt();
		   int Y = sc.nextInt();
		   int Z = sc.nextInt();
		   int P = X+Y;
		   int K = Y+Z;
		   int M = X+Z;
		   int N = X+Y+Z;
		   if(W==X || W==Y || W==Z || W==P ||  W==K || W==M || W==N){
		       System.out.println("YES");
		   }
		   else{
		       System.out.println("NO");
		   }
		}

	}
}
