import java.util.Scanner;

public class FloorSQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root =0;
        for(int i =0; i<=n; i++){
            if(i*i >n) break;
            root = i;
        }
        System.out.print(root+" ");
    }
}
