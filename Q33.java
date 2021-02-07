import java.util.*;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Value you want");
        int k=sc.nextInt();
        int ans=swaps(arr, n, k);
        System.out.println("The Minimum Swaps "+ans);

    }
    static int swaps(int arr[], int n, int k){
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                cnt++;
            }
        }
            int count=0;
        for(int j=0;j<cnt;j++){
            if(arr[j]>k){
                count++;
            }

        }   
        int ans=count;
        for(int m=0,j=cnt;j<n;j++,m++){
            if(arr[m]>k){
                count--;
            }
            if(arr[j]>k){
                count++;
            }

            ans=Math.min(ans, count);
        } 
        
        
        return ans;
    
    
    }
}
