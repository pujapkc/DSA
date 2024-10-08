import java.util.*;

public class factorial {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,res=1;

         System.out.println("Enter n");
         n=sc.nextInt();

         for(int i=2;i<=n;i++){
            res= res*i;

         }
         System.out.println("The factorial is"+res);

         sc.close();
    }
    

}
