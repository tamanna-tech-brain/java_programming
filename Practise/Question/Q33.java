import java.util.Scanner;

public class Q33 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = x*y;
		    if(z>=100){
		        System.out.println(z/100);
		    }
		    else{
		        System.out.println(0);
		    }
		}

	}
}
