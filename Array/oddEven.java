import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array: ");
        int[] arr = new int[n];
        for (int i= 0; i <n ; i++) {
              arr[i] = sc.nextInt();
            if(i%2!=0){ 
                arr[i] = 2*arr[i];
            
            }
            else if(i%2==0) {
                arr[i] = 10+arr[i];
            } 
            for(int val : arr){
                if (val !=0 )
                System.out.print(val +" ");
            }
        }

    }
        
}
