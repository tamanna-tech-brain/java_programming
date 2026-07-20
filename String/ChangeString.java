import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("values of str : " );
        String str = sc.nextLine();

            if(!str.equals(str.toLowerCase()) && !str.equals(str.toUpperCase())){
                System.out.print(str.toUpperCase() + " " +str.toLowerCase());
            }
                   
    }
}