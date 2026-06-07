public class AllOddNumber {
    public static void main(String[] args) {
        int i;
        for(i=3; i<=100; i=i+3){
            System.out.print(i + " ");
        }
        System.out.println();
        for(i=1; i<=100; i=i++){
            if(i %3 ==0 )
            System.out.print(i  + " ");
        }
    }
}
