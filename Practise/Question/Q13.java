package Question;

import java.util.Scanner;

public class Q13 {
    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int i = 0; i< T; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>y){
                System.out.println(x-y);
            }
            else{
                System.out.println(0);
            }
        }
}
