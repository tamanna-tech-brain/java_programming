import java.util.ArrayList;
import java.util.Arrays;
public class CommonSelection {
    public static void main(String[] args) {
        int[] arr = { 2,1,4,8,2,3};
        int a = arr.length;
        for(int i = 0; i < a; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
         int[] arr1 = { 8,6,2,5,2,8,3};
        int b = arr1.length;
        for(int i = 0; i < b; i++){
            System.out.print(arr1[i] + " ");
        }
        ArrayList<Integer> result =  commonElements(arr, arr1);
        System.out.println(result);
    }
        public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } 
            else if (a[i] < b[j]) {
                i++;
            } 
            else {
                j++;
            }
        }
        return ans;
    }
}       
