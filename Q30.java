/*
 * Q30-Chocolate Distribution problem.
 */
import java.util.*;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements into the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Total No. of Students");
        int k=sc.nextInt();
        System.out.println("Minimum Difference= "+diff(arr,n,k));
        
    }
    static int diff(int arr[], int n, int k){
        
        if (k == 0 || n == 0){
            return 0;
        }
      
        Arrays.sort(arr);
      
        if (n < k)
           return -1;
      
        
        int min_diff = Integer.MAX_VALUE;
      
         
        for (int i = 0; i + k - 1 < n; i++)
        {
            int diff = arr[i+k-1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
    
    
}
