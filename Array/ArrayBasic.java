public class ArrayBasic{
    public static void main(String[] args) {
        int[] x = {6,19,7,69,9,171,5};
        //indexing  start from 0
        System.out.println(x[5]);
        System.out.println(x[3]);  
        //updating    mutability
        x[3] = 89;
        System.out.println(x[3]);

        int[] arr = new int[4]; //size of 4 0 to 3
        arr[0] =10;
        arr[1] =20;
        arr[2] =150;
        arr[3] =-8;
    }
}