/*
 * Q24-Find longest coinsecutive subsequence.
 */
import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements in the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=cons(arr, n);
        System.out.println("Longest Consecutive Subsequence is "+ans);

    }

    static int cons(int arr[], int n){
        Set<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }

        int maxs=0;
        for(int i=0;i<n;i++){
            if(!hs.contains(arr[i]-1)){
                int curr=arr[i];
                int maxx=1;
                while(hs.contains(curr+1)){
                    maxx++;
                    curr++;
                }
                maxs=Math.max(maxs, maxx);
            }
        }
        return maxs;
    }
    
}
