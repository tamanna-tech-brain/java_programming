
import java.util.Scanner;

public class OutputInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,-8,2,67,43,-97,45,4,85,52};
        int n = arr.length; //index 0 to n-1;
        System.out.println(arr.length);
        for(int i= 0; i<=n-1; i++){
            System.out.print(arr[i] + " ");
        }
        int i =0 ;
        while(i<=n-1){
        System.out.print(arr[i]+" ");
        i++;
        }
    
        //default values
        // int[] karan = new int[7];
        // for(int j=0; j<7; j++){
        //     System.out.println(karan[j]+" ");
        // }

        //input
        int[] karan = new int[7];
        for(int j =0; j<7; j++){
            karan[j] = sc.nextInt();
        }
        for(int j=0; j<7; j++){
            System.out.print(karan[j]+" ");
        }
        
    }
}
