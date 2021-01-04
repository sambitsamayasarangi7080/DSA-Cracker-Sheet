/**
 * Q8-find Largest sum contiguous Subarray [V. IMP]
 */
import java.util.*; 
public class Q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the Array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=contiguous(arr, n);
        System.out.println("Maximum contiguous sum is " + ans);

    }

    static int contiguous(int arr[], int n){
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;

        for(int i=0;i<n;i++){
            max_ending_here=max_ending_here+arr[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }

        }
        return max_so_far;
    }
    
}
