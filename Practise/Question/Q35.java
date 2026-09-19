import java.util.Scanner;

public class Q35 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i<T; i++){
		    int r1 = sc.nextInt();
		    int r2= sc.nextInt();
		    int r3 = sc.nextInt();
		    int r4 = sc.nextInt();
		    boolean r5 = (r1==0) &&(r2==0) && (r3==0) &&(r4==0);
		    if(r5){
		        System.out.println("IN");
		    }
		    else{
		        System.out.println("OUT");
		    }
		}

	}
}
