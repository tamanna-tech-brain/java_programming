public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 8,4,1,9,-3,6,5};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i< n-1; i++){
            int min  =  arr[i];
            int mindx = i;
            for(int j = i; j < n; j++){
               if(arr[j]<min){
                min = arr[j];
                mindx = j;
               }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
    }
        for(int j =0; j<n ; j++){
            System.out.print(arr[j]+ " ");
        }
    }
}
