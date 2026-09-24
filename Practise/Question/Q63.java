package Question;

import java.util.Scanner;

public class Q63 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int K = sc.nextInt();
		    int Z = K/X;
		    if(Z<=N){
		        System.out.println(Z);
		    }
		    else{
		        System.out.println(N);
		    }
		}
		

	}
}
