public class BuiltInMethod {
    public static void main(String[] args) {
        String s = "Arpit Bansal";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('z'));   //not present means -1
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String str = "harshita";
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("harsh"));
        if(str.contains("arsh")) System.out.println("happy");
        System.out.println(s.startsWith("arsh"));
    }
}
