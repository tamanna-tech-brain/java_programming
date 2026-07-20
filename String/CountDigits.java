import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ""+n;
        System.out.println(s.length());
        double ni = sc.nextDouble();
        String str = ""+ni;
        System.out.println(str.length());
        String str1 = "285368";
        int n2 = Integer.parseInt(str1+1);
        System.out.println(n2+1);
    }
}
