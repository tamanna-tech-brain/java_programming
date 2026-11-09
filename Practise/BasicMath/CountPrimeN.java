package Practise.BasicMath;
import java.util.Scanner;

public class CountPrimeN {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=0;
        for(int num =2; num<=n; num++){
            int isPrime =1;
        for(int i =2; i*i<=num; i++){
            if(num % i == 0){
                isPrime =0;
                break;
                }
            }
            if(isPrime == 1){
                t++;
            }
        }
        System.out.print(t);
    }
}
