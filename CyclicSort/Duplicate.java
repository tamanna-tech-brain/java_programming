package CyclicSort;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1,3};

        System.out.println(dupNumber(arr));
    }

    public static int dupNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == i) {
                i++;
            } else if(arr[i] == arr[arr[i]]){
               return arr[i];
            } else {
                swap(arr, i, arr[i]);
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
