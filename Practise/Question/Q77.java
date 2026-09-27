package Question;

import java.util.Scanner;

public class Q77 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    if(X%10==0){
		        System.out.println(X/10);
		    }
		    else if(X%10==5){
		        System.out.println((X/10)+1);
		    }
		    else{
		        System.out.println("-1");
		    }
		}

	}
}
