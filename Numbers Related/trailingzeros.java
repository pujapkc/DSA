import java.util.*;

public class trailingzeros {

  static  int count(int n){
        int fact=1;

        for(int i=2;i<=n;i++){
            fact = fact*i;
        }

        int res=0;

        while (fact%10 == 0){
            res++;

            fact=fact/10;
        }

       return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number for factorial");
        int n;
         n=sc.nextInt();

         int ans = count(n);

         System.out.println("Trailing zeros are  - "+ans);
         sc.close();
        
    }
}
