package Question;

import java.util.Scanner;

public class Q81 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                int floorX = (x - 1) / 10;
                int floorY = (y - 1) / 10;
                
                int floorDifference = Math.abs(floorX - floorY);
                
                System.out.println(floorDifference);
            }
        
	}
}
