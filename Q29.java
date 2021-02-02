/*
 * Q29-Trapping Rain water problem.(IMP)
 */
import java.util.*;
public class Q29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum Water Value = "+rainwater(arr, n));


    }

    static int rainwater(int arr[], int n){
        int res=0;
        for(int i=1;i<n-1;i++){
            int left=arr[i];
            for(int j=0;j<i;j++){
                left=Math.max(left, arr[j]);

            }
            int right=arr[i];
            for(int j=i+1;j<n;j++){
                right=Math.max(right, arr[j]);
            }
            res=res+Math.min(left, right)-arr[i];
        }
        return res;
    }
    
}
