import java.util.Scanner;

public class Q36 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int t = a*b;
		    int p = x*y;
		    if(p>=t){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
