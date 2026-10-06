package Question;
public class Q103 {
    public static void main (String[] args){
        int n = 12321;
        int rev =0;
        if(n<0) {
            return;
        }
        int dup =n;
        int sum =0; 
      while(n>0){
        int lastDigit = n%10;
         rev = (rev*10+ lastDigit);
        n= n/10;
      }
    if(dup == rev){
        System.out.println("YEs");
    }
    else{
        System.out.println("NO");
    }
    }
}
