import java.util.*;

public class SearchingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n, i,x;
        System.out.println("Enter number of elements in array");
        n = sc.nextInt();

        int[] arr = new int[n];
         System.out.println("Enter the element to search in array");
         x = sc.nextInt();
         System.out.println("Enter elements of array");
         for (i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
        
         System.out.println("The elements of array are " );
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element is found in " + i + " position");
                break;
            }
        }
        
        
    }
}
