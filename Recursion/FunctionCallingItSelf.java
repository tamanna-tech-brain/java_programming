package Recursion;

public class FunctionCallingItSelf {
    public static void main(String[] args){
        ajay(1);
    }
    public static void ajay(int n){
        if(n==10) return;
        System.out.println("PRIya");
        ajay(n+1);
    }
}
