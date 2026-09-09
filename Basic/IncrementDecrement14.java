public class IncrementDecrement14 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        System.out.println(++x); // preincremnet
        System.out.println(x);
        System.out.println(x++);  //post increment

        int y= x++;
        System.out.println(x+ " " + y);
        int Z= ++x;
        System.out.println(x+ " " + Z);

    }
}
