
public class MaxOfTwo {
    public static int max(int a, int b, int c) {   //parameters
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }
    public static void main(String[] args) {
        System.out.println(max(5,8,10));   //arguments
}
}