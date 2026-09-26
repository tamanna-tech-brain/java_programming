package Question;

import java.util.Scanner;

public class Q75 {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int S = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    int P = S-(X+Y);
		    int K = Z-P;
		    if(K <=0 ){
		        System.out.println(0);
		    }
		    else if(K <= Math.max(X,Y)){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(2);
		    }
		}

	}
}
