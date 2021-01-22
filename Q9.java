/**
 * Q9-Minimise the maximum difference between heights [V.IMP]
 */
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Enter the No. of Elemets you want in the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements in the AArray");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int ans=MinDiff(arr, n, k);
        System.out.println("Maximum Difference is: "+ ans);


    }

    static int MinDiff(int arr[], int n, int k){
        if(n==1)
          return 0;
        
        Arrays.sort(arr);

        int ans=arr[n-1] - arr[0];

        int small=arr[0] + k;
        int big=arr[n-1] - k;
        int tmp=0;

        if(small>big){
            tmp=small;
            small=big;
            big=tmp;
        }

        for(int i=0;i<n;i++){

            int add=arr[i] + k;
            int sub=arr[i] - k;

            if(big>=add || sub>=small)
                continue;

            if(big - sub <= add - small)
                small=sub;
            else
                big=add;    
                
        }
        return Math.min(ans, big - small);


    }
    
    
}
