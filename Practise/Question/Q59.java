package Question;

import java.util.Scanner;

public class Q59 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int x = sc.nextInt();
		    int rem = x%3;
		    if(rem ==1){
		        System.out.println("HUGE");
		    }
		    else if(rem==2){
		        System.out.println("SMALL");
		    }
		    else{
		        System.out.println("NORMAL");
		    }
		}

	}
}
