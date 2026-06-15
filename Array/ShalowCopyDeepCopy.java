public class ShalowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] brr = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            brr[i] = arr[i];
        }
        //brr is a deep copy
        // int[] x = arr; //x is shallow copy of arr
        // x[0] = 100;

        // int[] y = Arrays.copyOf(arr, arr.length);
        // y[0] = 100;
        // System.out.println(y[0]);
        // System.out.println(arr[0]);
    }
}
