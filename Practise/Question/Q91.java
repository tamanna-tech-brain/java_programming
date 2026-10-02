package Question;

import java.util.Scanner;

public class Q91 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int C = A*Y;
		    int Z = B*X;
		    if(C==Z){
		        System.out.println("BOTH");
		    }
		    else if(C>=Z){
		        System.out.println("CHEFINA");
		    }
		    else{
		        System.out.println("CHEF");
		    }
		    
		}
    }
}
