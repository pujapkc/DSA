import java.util.*;

public class GCD{

    static int commondivisor(int a,int b){
           if(b==0){
            return a;
           }
           else return commondivisor(b,a%b);

    }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();

    int res = commondivisor(a, b);

    System.out.println(res);

    sc.close();

  }
}