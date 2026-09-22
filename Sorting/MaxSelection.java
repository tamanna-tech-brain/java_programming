public class MaxSelection {
    public static void main(String[] args) {
        int[] arr = { 8,4,1,9,-3,6,5};
        int n = arr.length;
        int i =0;
        for(i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for( i = 0; i< n-1; i++){
            int max  =  arr[i];
            int maxdx = i;
            for(int j = i; j < n; j++){
               if(arr[j]>max){
                max = arr[j];
                maxdx = j;
               }
            }
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
    }
        for(int j =0; j<n ; j++){
            System.out.print(arr[j]+ " ");
        }
        
    }
}
