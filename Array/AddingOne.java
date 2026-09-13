
import java.util.Collections;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
    int[] arr = {1,2,9};
    int n = arr.length;
    int carry = 1;
    Vector<Integer> ans = new Vector<>();
    for(int i=n-1; i>=0; i--){
       int sum = arr[i] + carry;
       ans.add(sum % 10);
       carry = sum / 10;
       }
       if(carry==1) {
        ans.add(1);
       }
       Collections.reverse(ans);
       System.out.println(ans);
    }
    }
