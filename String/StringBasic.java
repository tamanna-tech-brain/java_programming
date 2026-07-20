
// public class StringBasic {
//     public static void main(String[] args) {
//         char[] arr = {'p', 'r', 'i', 'y', 'a'};
//         for(int ele : arr){
//             System.out.print(ele+ " ");
//         }
//     }
// }


// public class StringBasic {
//     public static void main(String[] args) {
//         char[] arr = {'p', 'r', 'i', 'y', 'a'};
//         for(char ele : arr){
//             System.out.print(ele+ " ");
//         }
//     }
// }

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        String str = "shruti is a good girl";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        // String t = sc.nextLine();
        // System.out.println(t);
    }
}