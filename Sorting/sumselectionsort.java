import java.util.Arrays;

public class sumselectionsort {
    public static void main(String[] args) {
        int[] arr = { 7,0,4,3,2,8,10};
        Arrays.sort(arr);
        int tag = 9;
        boolean found = false;
        int i =0, j=arr.length-1;
        while(i<j){
               if(arr[j]+arr[j]==tag) {
               found = true;
               break;
               }
               else if (arr[i]+arr[j]>tag) {
                j--;
               }
               else if(arr[i]+arr[j]<tag) {
                i++;
               }
        }
        System.out.println(found);
    }
}
