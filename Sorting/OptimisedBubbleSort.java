public class OptimisedBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5,-2,6,7,2,0,7,2};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int m =n-1;
        for(int i = 0; i< n; i++){
            int swaps = 0;
        for(int j = 0; j < m-i; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
                swaps++;
            }
        }
        if(swaps==0) break;
    }
        for(int j =0; j<n ; j++){
            System.out.print(arr[j]+ " ");
        }
    }
}
