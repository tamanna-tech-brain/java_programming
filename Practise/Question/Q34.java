import java.util.Scanner;

public class Q34 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++){
		    int N = sc.nextInt();
		    int x = sc.nextInt();
		    int t = (N*x)+3;
		    System.out.println(t/4);
		    
		}

	}
}
