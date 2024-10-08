import java.util.*;

public class count_digits{


static int check(int n){
    
    if(n/10==0){
        return 1;
    }
    return 1 + check(n/10);
}


public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num;

    num=sc.nextInt();

    int result=check(num);

    System.out.println(" the digits in the number is "+result);
    sc.close();
}
}