package Question;

import java.util.Scanner;

public class Q39 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int  T  = sc.nextInt();
		for(int i =0; i<T; i++){
		    int  a  = sc.nextInt();
		    int  b  = sc.nextInt();
		    int  c  = sc.nextInt();
		    int  d  = sc.nextInt();
		    if(c>=a && d>=b ){
		        System.out.println("POSSIBLE");
		    }
		    else{
		        System.out.println("IMPOSSIBLE");
		    }
		}

	}
}
