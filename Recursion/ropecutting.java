import java.util.*;

public class ropecutting {

    static int maxcuts(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<=-1){
            return -1;
        }

        int res = Math.max(maxcuts(n-a, a, b, c),
                  Math.max(maxcuts(n-b, a, b, c),
                  maxcuts(n-c, a, b, c)));

                  if(res == -1)
                  return -1;

                  return res+1;
    } 
    public static void main(String[] args) {
        int n,a,b,c;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
       
         System.out.println(maxcuts(n, a, b, c));

         sc.close();

    }
}
