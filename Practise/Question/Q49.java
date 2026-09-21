package Question;

import java.util.Scanner;

public class Q49 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int age =0;
		    for(int j =0; j<N; j++){
		    int I = sc.nextInt();
		    if(I>=X ){
		        age++;
		    }
		    }
		    System.out.println(age);
		}

	}
}
