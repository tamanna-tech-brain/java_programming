package Question;
import java.util.Scanner;

public class Q79 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++){
		    int N = sc.nextInt();
		    int count =0;
		    for(int j =0; j<N; j++){
		        int age = sc.nextInt();
		        if(age>=10 && age<=60){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
