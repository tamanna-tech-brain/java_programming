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
        boolean found =  false;
        for(int i = 0; i<n; i++){
            if( x == arr[i]){ System.out.println("yes at index "+ i);
            found = true;
        }
            else System.out.println("Naa");
        }
    }
}
