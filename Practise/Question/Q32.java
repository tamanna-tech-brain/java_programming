import java.util.Scanner;

public class Q32 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lucky=0;
		int unlucky = 0;
		for(int i =0; i<n; i++){
		    int a1 = sc.nextInt();
		    if(a1 % 2 ==0){
		        lucky++;
		    }
		    else{
		        unlucky++;
		    }
		}
		    if(lucky> unlucky){
		        System.out.println("READY FOR BATTLE");
		    }
		    else{
		        System.out.println("NOT READY");
		    }
	}
}
