import java.util.*;

public class count_digits1 {

    static void count(int n) {
        int res = 0;
        while (n > 0) {
            n = n / 10;
            res++;

        }
     System.out.println("the number of digits is "+res);
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its digits");
        int n = sc.nextInt();
        count(n);
        sc.close();

    }
}
