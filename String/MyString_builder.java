public class MyString_builder {
    public static void main(String[] args) {
        // ArrayList<Character> str = new ArrayList<>();
        // str.add('a');
        // str.set(0,'r');
        StringBuilder s = new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Raghav");
        System.out.println(s.length()+" "+ s.capacity());
        System.out.println(s);
        s.setCharAt(1, 'o');
        System.err.println(s);
        String t = s.toString();
        System.out.println(t);
        s.append("exrctyubiwercvtbyuniecrvbyun");
        System.out.println(s.length()+" "+s.capacity());
        s.append('t');
        System.out.println(s.length()+" "+s.capacity());
    }
}
