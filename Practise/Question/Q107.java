package Question;

import java.util.Scanner;

public class Q107 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                
                // Number of rounds is log2(n)
                int rounds = (int)(Math.log(n) / Math.log(2));
                
                // Total time = (rounds * time per round) + ((rounds - 1) * break time)
                int totalTime = (rounds * a) + ((rounds - 1) * b);
                
                System.out.println(totalTime);
            }
	}
}

}
