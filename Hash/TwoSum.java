package Hash;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,2,4,3,6};
        int target = 5;
        for(int i =0; i<arr.length; i++){
            int rem = target-arr[i];
            if(set.contains(rem)){
                System.out.println("true");
            }
            set.add(arr[i]);
        }
        System.out.println("false");
}
}