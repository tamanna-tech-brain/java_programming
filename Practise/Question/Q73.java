package Question;

import java.util.Scanner;

public class Q73 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if(B >= A - Y && B <= A + X){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
		}

	}
}
