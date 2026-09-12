import java.util.Scanner;

public class TwoSum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array i: ");
        int[] arr = new int[n];
        int i =0;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Value of x: ");
        int x = sc.nextInt();
        int j=0;
        boolean flag =  false;
        outerLoop:
        for(i =0; i<n; i++){
            for(j = i+1; j<n; j++){
                if(arr[i]+arr[j]==x){
                    flag =true;
                    break outerLoop;
                }
            }
        }
        if(flag) System.out.println("values are :"+ arr[i]+" "+arr[j]);
        else System.out.println("not found");
    }
}
