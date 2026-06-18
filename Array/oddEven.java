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
            print(arr);
            if(i%2 ==1) arr[i] = 2*arr[i];
            else arr[i] = 10+arr[i];
            }
            print(arr);
    }
            public static void print(int[] arr){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]+ " ");
                }
                System.out.println(" ");
            }
        }

