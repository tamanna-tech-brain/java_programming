import java.util.Scanner;
public class Q29 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int t = (n+5)/6;
		    System.out.println(x*t);
        }
    }
}
