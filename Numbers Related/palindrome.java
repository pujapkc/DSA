import java.util.*;

public class palindrome {

    static boolean ispal(String s,int start,int end){

        if(start == end){
            return true;
        }

        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }

        if(start<end+1){
            return ispal(s, start+1, end-1);

           
        }
        return true;

    }
     

    static boolean ispalin(String s){
        int n  = s.length();

        if(n==0){
            return true;
        }
        return ispal(s,0,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s = sc.nextLine();

          if(ispalin(s)){
            System.out.println("True");
          }
          else{
            System.out.println("False");
          }

          sc.close();

    }
}
