package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args){
        hanoi(5,'a','b','c');
    }
    private static void hanoi(int n, char a,char b, char c){
        if(n==0) return ;
        hanoi (n-1, a,c,b); //n-1 disk from a to b via c
        System.out.println(a+"->"+c);
        hanoi(n-1,b,a,c);
    }
}
