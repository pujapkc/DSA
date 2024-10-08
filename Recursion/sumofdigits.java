import java.util.*;


public class sumofdigits {

   static int getsum(int n){
        if(n==0){
            return 0;
        }

        else

        return getsum(n/10)+n%10;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int result=getsum(n);

        System.out.println("The sum of digits "+result);

        sc.close();
        

    }
}
