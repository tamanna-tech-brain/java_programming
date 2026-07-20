public class PassingStringToMethod {
    public static void Change(String x) {
        x="utkarsh";
    }
    public static void main(String[] args) {
        String x = "raghav";
        System.out.print(x+" ");
        Change(x);
        System.out.print(x);
    }
}
