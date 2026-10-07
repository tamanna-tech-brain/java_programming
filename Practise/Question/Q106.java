package Question;

import java.util.Scanner;

public class Q106 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
            int N = sc.nextInt();
            int sum = 0;
            
            for (int i = 0; i < N; i++) {
                int val = sc.nextInt();
                sum += val;
            }
            if (N % 2 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(Math.abs(sum) / 2);
            }
        }
	}
}
