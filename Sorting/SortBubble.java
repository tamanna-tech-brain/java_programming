public class SortBubble {
    public static void main(String[] args) {
        int[] arr = { 5,-2,6,7,2,0,7,2};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i< n; i++){
        for(int j = 0; j < n-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
        for(int j =0; j<n ; j++){
            System.out.print(arr[j]+ " ");
        }
    }
}
