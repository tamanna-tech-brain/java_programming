
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s+=n;
        System.out.println(s);
        String str = Integer.toString( n);
        System.out.println(str);
    }
}
