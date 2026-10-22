
package Hash;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int low = 1;
        int high = 8;

        MissingElement obj = new MissingElement();
        System.out.println(obj.missingRange(arr, low, high));
    }

    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int ele : arr) {
            set.add(ele);
        }

        for (int i = low; i <= high; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
