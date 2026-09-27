package Question;

import java.util.Scanner;

public class Q78 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    int N = sc.nextInt();
		    int P = (N+99)/100;
		    if(P>X){
		        System.out.println(P-X);
		    }
		    else{
		        System.out.println("0");
		    }
		}

	}
}
