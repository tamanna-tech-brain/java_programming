package Question;

import java.util.Scanner;

public class Q64 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    if(N%M==0 && (N/M) %2 ==0 ){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}
