import java.util.*;
public class power {

    static int powercheck(int x, int n){
        int res = 1;
          for(int i = 0;i<n;i++){
              res = res*x;
          }
          return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int x = sc.nextInt();
        
      int result = powercheck(x, n);
      System.out.println("The power is"+result);
        sc.close();
    }
}
