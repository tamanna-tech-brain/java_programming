package Question;

import java.util.Scanner;

public class Q47 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    if(N%4==0){
		        System.out.println("GOOD");
		    }
		    else{
		        System.out.println("NOT GOOD");
		}
		}
	}
}
