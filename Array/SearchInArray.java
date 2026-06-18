import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("value of x: ");
        int x = sc.nextInt();
        // int x = -1;
        boolean flag =  false; //false means target array me nhi hai
        for(int i = 0; i<n; i++){
            if(arr[i] == x){      
               System.out.println("yes at index : "+ i);
            flag = true;  // true means target array me hai  flag is found basically
            // flag = i;
            break;
        }
        }
        // if(!flag != -1  ) System.out.println("No"+ found);
    if(!flag ) System.out.println("No");
        
    }
}

