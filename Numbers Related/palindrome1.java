import java.util.*;

public class palindrome1 {

    static boolean checkpalin(int n) {
        int res=0;
        int ld = 0;
        int temp = n;
        while (n > 0) {
            ld = n % 10;
            res = res * 10 + ld;
            n = n / 10;
        }
        return (temp == res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome");
        int n = sc.nextInt();
        boolean a = checkpalin(n);
        if (a == true) {
            System.out.println("number is palindrome");

        } else {
            System.out.println("number is not palindrome");
        }
    }
}
