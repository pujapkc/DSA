import java.util.*;


public class sumofnumbers {

    static int getsum(int n){
        if (n==0){
            return 0;
        }
        return n+getsum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = getsum(n);
        System.out.println("The sum of numbers are  "+result);
        sc.close();
    }
}
