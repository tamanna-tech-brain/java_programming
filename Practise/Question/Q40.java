package Question;

import java.util.Scanner;

public class Q40 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int d = (x ==a  || x ==b || x==c) ? x : -1;
		if(d == x){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
