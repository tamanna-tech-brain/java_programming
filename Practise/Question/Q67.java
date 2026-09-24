package Question;

import java.util.Scanner;

public class Q67 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = A+B;
		    int D = 21-C;
		    if(D>=1 && D<=10){
		        System.out.println(D);
		    }
		    else{
		        System.out.println("-1");
		    }
		}

	}
}
