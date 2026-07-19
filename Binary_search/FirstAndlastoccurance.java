import java.util.Scanner;

public class FirstAndlastoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of arr : ");
        int n = sc.nextInt();
        System.out.print("values of arr : " );
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("target: ");
        int target = sc.nextInt();
        int first = findOccurrence(arr, target, true);
        int last = findOccurrence(arr, target, false);

        if(first != -1){
            System.out.println("first occurance: "+first+" "+target+" ");
            System.out.println("last occrance: "+last+" "+target+" ");
        }
        else{
            System.out.println("Not found");
        }
    }
        public static int findOccurrence(int[] arr , int target, boolean findfirst){
        int lower = 0;
        int higher = arr.length-1;
        int result = -1;
        while(lower<=higher){
                int mid = (lower + higher) / 2;
                if(arr[mid]==target) {
                    result = mid;
                    if(findfirst){
                        higher = mid-1;
                    }
                    else{
                        lower = mid +1;
                    }
                }
                else if (arr[mid]<target) {
                    lower = mid+1;
                }
                else {
                    higher = mid-1;
        }
    }
    return result;
    }
}
