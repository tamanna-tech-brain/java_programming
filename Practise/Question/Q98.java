package Question;

import java.util.Scanner;

public class Q98 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if(A<B){
		        System.out.println("<");
		    }
		    else if(A>B) {
		        System.out.println(">");
		    }
		    else{
		        System.out.println("=");
		    }
		}

	}
}
