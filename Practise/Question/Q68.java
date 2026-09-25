package Question;

import java.util.Scanner;

public class Q68 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		SCanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int M = sc.nextInt();
		    int capacityPerBag = K * M;
		    int bags = (N+ capacityPerBag - 1) / capacityPerBag;
		    System.out.println(bags);
		}

	}
}
