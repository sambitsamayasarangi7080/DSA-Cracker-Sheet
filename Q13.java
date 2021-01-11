/**
 * Q13-Kadane's Algo [V.V.V.V.V IMP] 
 */
import java.util.*;
public class Q13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=kadane(arr,n);
        System.out.println("Maximum contiguous sum is " + ans);

    }

    static int kadane(int arr[],int n){
        int max_sofar=Integer.MIN_VALUE;
        int max_endinghere=0;

        for(int i=0;i<n;i++){
            max_endinghere=max_endinghere+arr[i];
            if(max_sofar<max_endinghere){
                max_sofar=max_endinghere;
            }
            if(max_sofar<0){
                max_sofar=0;
            }

        }
        return max_sofar;
    
    }
    
}
