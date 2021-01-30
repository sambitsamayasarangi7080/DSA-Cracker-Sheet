/*
 * Q26-Maximum profit by buying and selling a share atmost twice.
 */
import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements into the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum Profit= "+maxpro(arr, n));
    }

    static int maxpro(int arr[], int n){
        int ma=arr[n-1];
        int mi=arr[0];
        int dp[]=new int[n];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>ma){
                ma=arr[i];
            }
            dp[i]=Math.max(dp[i+1], ma-arr[i]);
        }

        for(int i=1;i<n;i++){
            if(arr[i]<mi){
                mi=arr[i];
            }
            dp[i]=Math.max(dp[i-1], (dp[i]+(arr[i]-mi)));
        }

        return dp[n-1];
    }
    
}
