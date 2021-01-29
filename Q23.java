/*
 * Q23-find maximum product subarray.
 */
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxProduct(arr, n);
        System.out.println(ans);
    }
    


    static int maxProduct(int[] arr, int n) {
        
        int maxsf=arr[0];
        int minsf=arr[0];
        int maxpro=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] < 0){
                int temp=maxsf;
                maxsf=minsf;
                minsf=temp;
            }
            maxsf=Math.max(arr[i], maxsf*arr[i]);
            minsf=Math.min(arr[i], minsf*arr[i]);

            maxpro=Math.max(maxpro, maxsf);
        }
        
        return maxpro;
    }
}
