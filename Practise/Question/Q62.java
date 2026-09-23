package Question;

import java.util.Scanner;

public class Q62 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes
		Scanner sc = new Scanner(System.in);
		int  T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    String S = sc.next();
		    for(int j = 0; j<N; j++){
		        char ch = S.charAt(j);
		       if(ch=='A'){
		           System.out.print("T");
		       }
		       else if(ch == 'T'){
		           System.out.print("A");
		       }
		       else if(ch== 'C'){
		           System.out.print("G");
		       }
		       else if( ch== 'G'){
		           System.out.print("C");
		       }
		    }
		    System.out.println("");
		}
	}
}
