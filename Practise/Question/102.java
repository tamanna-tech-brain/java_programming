package Question;

public class 102 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A>=B && C>=B ){
                System.out.println(A+C);
            }
            else if(B>=A && C>=A){
                System.out.println(C+B);
            }
            else{
                System.out.println(A+B);
            }
        }
	}
}
