import java.util.Scanner;

public class Q37 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int n = sc.nextInt();
		    int t = 50*n;
		    int sugar = (t*20)/100;
		    int salt = (t*20)/100;
		    int income = (t*30)/100;
		    System.out.println(t-sugar-salt-income);
		}

	}
}
