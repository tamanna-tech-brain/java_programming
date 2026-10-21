package MergeSort;

import java.util.Scanner;

public class MagicTechnic {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i =0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
        mergeSort(arr);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    private static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; // 1 length array
        // step 1 : create 2 new empty array
        int[] a = new int[n/2]; int[] b = new int[n-n/2];
        // step 2 : copy-paste arr into a and b
        int idx =0; //idx travel karega arr pe
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];
        // step 3 : Magic
        mergeSort(a); mergeSort(b);
        // step 4 : Merge a and b int arr
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c ){
        int i =0, j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
