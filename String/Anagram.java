
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "latent";
        String s2 = "talent";
        if(s1.length()!=s2.length());
        System.out.println("false");
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i =0; i<arr1.length;i++){
            if(arr1[i]!= arr2[i])
            System.out.println("false");
        }
        System.out.println("true");

    }
}
