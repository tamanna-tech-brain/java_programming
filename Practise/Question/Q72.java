package Question;

import java.util.Scanner;

public class Q72 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int P = sc.nextInt();
		    int Q = sc.nextInt();
		    if((P+Q)){
		        System.out.println("Alice");
		    }
		    else{
		        System.out.println("Bob");
		    }
		}

	}
}
