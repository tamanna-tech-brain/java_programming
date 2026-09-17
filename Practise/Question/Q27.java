package Question;

import java.util.Scanner;

public class Q27 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
            if(N>=6 && N<=8){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
}
