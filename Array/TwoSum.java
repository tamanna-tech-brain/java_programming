import java.util.Scanner;

public class TwoSum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array i: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Value of x: ");
        int x = sc.nextInt();
        boolean flag =  false;
        for (int i = 0; i < n; i++) {
            for(int j=i+1; j<n; j++ ){
               if(arr[i]+ arr[j] == x)
               System.out.println("true on nums"+ arr[i]+"+"+arr[j]+"="+ x);
               System.out.println("true on indexs "+ i+" "+j);
               flag = true;
               break;
            }

        }
        }
}
