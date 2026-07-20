public class ReverseStrBui {
    public static void main(String[] args) {
        String s = "Devesh";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" jain");
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1,'i');
        System.out.println(sb);
        sb.delete(3, 5);
        System.out.println(sb);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
    }
}
