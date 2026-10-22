package CyclicSort;

public class ArrayDupilcate {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1,3};

        System.out.println(findDup(arr));
    }
    public static int findDup(int[] arr) {
        int i = 0;
        int ans =0;
        int n = arr.length;
         while (i < n) {
            int rightIdx = arr[i] - 1;

            if (arr[i] == i + 1) {
                i++;
            } else if (arr[i] > 0 && arr[rightIdx] == arr[i]) {
                return arr[i];
            } else if (arr[i] == 0) {
                i++;
            } else {
                swap(arr, i, rightIdx);
            }
        }

        return -1;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
