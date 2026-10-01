package Question;
import java.util.Scanner;

public class Q86 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int P = sc.nextInt();
		    int K = X*3;
		    int M = N-X;
		    int O = K-M;
		    if(O>=P){
		        System.out.println("PASS");
		    }
		    else{
		        System.out.println("FAIL");
		    }
		}

	}
}
