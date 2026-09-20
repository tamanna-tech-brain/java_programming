package Question;

import java.util.Scanner;

public class Q42 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int sum = 0;
		    int N = sc.nextInt();
		    for(int j =0; j<N; j++){
		        int rat = sc.nextInt();
		    if(rat>=1000){
		        sum++;
		    }
		}
		System.out.println(sum);
		}
	}
}
