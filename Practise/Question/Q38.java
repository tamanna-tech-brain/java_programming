import java.util.Scanner;

public class Q38 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int v = (n-x)+3;
		    if(x>=n){
		    System.out.println(0);
		    }
		    else {
		        System.out.println(v/4);
		    }
		    
		}

	}
}
