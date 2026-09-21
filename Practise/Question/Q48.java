package Question;

import java.util.Scanner;

public class Q48 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int x = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = (a*1)+(b*2);
		    if(x<=c){
		        System.out.println("Qualify");
		    }
		    else{
		        System.out.println("NotQualify");
		    }
		}

	}
}
