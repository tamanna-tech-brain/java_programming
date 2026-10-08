package Hash;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter aplha: ");
        String s = sc.next();
        int[] hash = new int[256];
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)-'a']++;
        }
        System.out.print("num of q: " + " ");
        int q= sc.nextInt();
        System.out.print("val og q"+ " ");
        while(q-->0){
            char c  =  sc.next().charAt(0);
                System.out.print(hash[c-'a'] + " ");

    }
}
}
