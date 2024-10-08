import java.util.*;

public class palindromenumber {
    public static void main(String args[]){
        int num,reversednum =0,remainder;

        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        int originalnum= num;

        while(num>0){
            remainder=num % 10;
            reversednum = (reversednum*10)+remainder;
            num/=10;
        }

        if(originalnum==reversednum){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
