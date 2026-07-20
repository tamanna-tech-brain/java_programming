
import java.util.Arrays;

public class FrequentChar {
    public static void main(String[] args) {
        String s = "testtsample";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        int maxfreq = -1;
        int ans = 0;
        int i =0, j=0;
         while(j<n){
            if(arr[i]==arr[j]) j++;
            else{
                int freq = j-i;
                if(freq > maxfreq){
                    maxfreq = freq;
                    ans = arr[i];
                }
                i = j;  
            }
        }
        int freq = j-i;
                if(freq > maxfreq){
                    maxfreq = freq;
                    ans = arr[i];
                }
                System.out.println((char)ans);
    }
}
