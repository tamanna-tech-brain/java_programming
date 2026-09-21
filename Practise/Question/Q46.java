package Question;

import java.util.Scanner;

public class Q46 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int  i =0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    double C = A/(10.0/100.0);
		    double D = B/(20.0/100.0);
		    if(C==D){
		        System.out.println("ANY");
		    }
		    else if(C>D){
		        System.out.println("FIRST");
		    }
		    else{
		        System.out.println("SECOND");
		    }
		}

	}
}
