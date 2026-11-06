import java.util.Scanner;

public class Count {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        if(n==0) return 1;
        while(n>0){
        int lastdigit=n%10;
        count++;
        n= n/10;
      }
      System.out.print(count);
    }
}