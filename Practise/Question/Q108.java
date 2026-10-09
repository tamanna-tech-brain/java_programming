package Question;

import java.util.Scanner;

public class Q108 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();

    while (t-- > 0) {

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();

        int aliceScore = (a1 + a2 + a3)
                - Math.min(a1, Math.min(a2, a3));

        int bobScore = (b1 + b2 + b3)
                - Math.min(b1, Math.min(b2, b3));

        if (aliceScore > bobScore) {
            System.out.println("Alice");
        } else if (bobScore > aliceScore) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }
    }

    scanner.close();
}


}
