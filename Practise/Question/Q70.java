package Question;

import java.util.Scanner;

public class Q70 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X1 = sc.nextInt();
		    int Y1 = sc.nextInt();
		    int X2 = sc.nextInt();
		    int Y2 = sc.nextInt();
		    int X3 = Math.abs(X1-X2);
		    int Y3 = Math.abs(Y1-Y2);
		    if(X3>Y3){
		        System.out.println(X3);
		    }
		    else{
		        System.out.println(Y3);
		    }
		}
    }
}
