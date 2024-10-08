import java.util.*;

public class sumofdigits {

    static int sum(int n){
        int rem =0;
        int sum = 0;

        while(n>0){
            rem = n%10;
             sum = sum+rem;
            n=n/10;
        }
        

        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int result = sum(n);

        System.out.println("The sum of digits is  "+result);
        sc.close();

    }
}
