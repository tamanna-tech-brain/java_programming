import java.util.Scanner;

public class Q31 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(y<x){
		    System.out.println((4*x)+(1*y));
		    }
		}

	}
}
