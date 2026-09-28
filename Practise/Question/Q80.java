package Question;

import java.util.Scanner;

public class Q80 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int D = sc.nextInt();
		    int P = Math.abs(X-Y);
		    if(P<=D){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
