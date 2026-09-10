import java.util.Scanner;

class LeftRightShift{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        int rs = a>>b;
        int ls = a<<b;
        System.out.print(rs+" "+ls);
        sc.close();
    }
}