public class CharDataType13 {
    public static void main(String[] args) {
        char n = 's';
        System.out.println(n);
        char eva = '$';
        System.out.println(eva);
        // typeCasting - ek datatype se dusra data type like character to number
        char ch = 'A';
        int x = ch; //implict typecasting
        System.out.println(x);

        char piyush = 'a';
        int y = (int)piyush;  //explicit typecasting
        System.out.println(y);

        char harsh = '3';
        System.out.println((int)harsh);

        char h = 'b';
        System.out.println(h*h);
        System.out.println(h+h);
        System.out.println(h-h);
        System.out.println(h/h);
        // integer to character
        int z= 65;
        char a = (char)z;
        System.out.println(a);
        char b = (char)66;
        System.out.println(b);

    }

}
