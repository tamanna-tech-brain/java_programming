import java.util.Scanner;

public class SubStringOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "raghev";
        System.out.println(s);
        s = "Madhav";
        System.out.println(s);
        String Str = "Jaishankar";
        System.out.println(Str.substring(3));
        System.out.println(Str.substring(0, Str.length()-1));
        String str1 = "gopi";
        for(int i =0; i<=str1.length(); i++){
            for(int j=i+1; j<=str1.length(); j++){
            System.out.print(str1.substring(i, j)+" ");
        }
        System.out.println("");
    }
    }
}
