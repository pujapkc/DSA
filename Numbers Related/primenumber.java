import java.util.*;

public class primenumber {

    static boolean check(int n){
       if(n==1)
        return false;
       
       for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
        }
        
       }
       return true;
    }
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
      

        boolean ans=check(n);

        if(ans== true){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}
