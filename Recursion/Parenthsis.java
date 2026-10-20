package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parenthsis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "",ans);
        System.out.print(ans);
    }
    public static void generate(int n , int l, int r, String s, List<String> ans){
        if(r==n) {
            ans.add(s);
            return;
        }
        if(l<n) generate(n, l+1,r,s+"(",ans);
        if(r<l) generate(n, l,r+1,s+")",ans);
    }
}
