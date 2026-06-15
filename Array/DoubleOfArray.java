
import java.util.Scanner;

public class DoubleOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  arr = new int[7];
        for(int i =0; i<7; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<7; i++){
            System.out.print(2*arr[i]+" ");
        }
    }
}
