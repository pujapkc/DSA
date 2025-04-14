import java.util.*;


public class factorial1 {

    static int fact(int n) {
        if(n==0)
            return 1;

        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = fact(n);

        System.out.println("The factorial of " +n+ "is" +res);


    }
}
