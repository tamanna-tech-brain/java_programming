public class Interningstring {
    public static void main(String[] args) {
        String s3 = ("Raghav");
        String s4 = ("Raghav");
        System.out.println(s3==s4);
        String s1 = new String("Raghav");
        String s2 = new String("Raghav");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.charAt(0)==s2.charAt(0));
    }
}
