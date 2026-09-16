package Question;

import java.util.Scanner;

public class Q17 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0; i<T; i++){
            int x = sc.nextInt();
            int N = sc.nextInt();
                System.out.println((x /10)*N);
        }
    }
}
