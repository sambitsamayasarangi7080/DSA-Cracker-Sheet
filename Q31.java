/*
 * Q31-Smallest Subarray with sum greater than a given value.
 */
import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Sum you want");
        int x=sc.nextInt();
        int ans=minsum(arr, n, x);
        if(ans==n+1){
            System.out.println("Not Possible");
        }
        else
            System.out.println("Minimum Length "+ans);

    }
    static int minsum(int arr[], int n, int x){
        int end=n+1;
        for(int i=0;i<n;i++){
            int sum_start=arr[i];
            if(sum_start>x)
                return 1;
          for(int j=i+1;j<n;j++){
              sum_start=sum_start+arr[j];
              if(sum_start>x && (j-i+1)<end){
                end=j-i+1;
              }

          }
                
        }
        return end;
    }
    
}
