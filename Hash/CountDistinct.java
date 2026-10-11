package Hash;

import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,2,2,5,58,7,58,4,6,3};
        for(int i =0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.print(set.size());
}
}