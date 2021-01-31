/*
 * Q28-Find the triplet that sum to a given value.
 */
import java.util.*;
public class Q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        boolean ans=sum(arr, n, sum);
        if(!ans)
            System.out.println("No Triplets");
    }
        static boolean sum(int arr[], int n, int sum){
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println("The Triplets are "+arr[i]+","+arr[j]+","+arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}
