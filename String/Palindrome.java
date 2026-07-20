import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("str: ");
        String str = sc.nextLine();

        boolean isPalindrome = true;
        int i = 0, j = str.length()-1; 
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
            isPalindrome = false;
            break;
            }
            else{
                i++;
                j--;
            }
            }
        if(isPalindrome){
        System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
