package Question;

import java.util.Scanner;

public class Q60 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    int tripleY = Y/X;
		    int p = Z-tripleY;
		    if(p<0){
		        System.out.println(0);
		    }
		    else{
		        System.out.println(p);
		    }
		}

	}
}
