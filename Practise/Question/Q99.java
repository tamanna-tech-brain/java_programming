package Question;

import java.util.Scanner;

public class Q99 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int count = 0;
		    for(int j =0; j<N; j++){
		        int M = sc.nextInt();
		        if((M+K) % 7 == 0){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
