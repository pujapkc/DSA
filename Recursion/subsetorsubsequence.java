import java.util.*;

public class subsetorsubsequence {

    static void subset(String str, int index, String curr){

        int n = str.length();

        if(index  == n){
            System.out.println(curr);
            return;
        }

        subset(str, index+1, curr+str.charAt(index));
        subset(str, index+1, curr);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        str = sc.nextLine();

        int index = 0;
        String curr = "";

        subset(str, index, curr);

        sc.close();
    }
}
