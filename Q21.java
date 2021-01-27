/*
 * Q21-Find if there is any subarray with sum equal to 0.
 */
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the No. of Elements you want in the Array");
    int n=sc.nextInt();
    System.out.println("Enter the Elements to the Array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    if(check(arr,n)){
        System.out.println("Yes, Found a subarray with 0 as Sum")
    }
    else{
        System.out.println("No Such Sub Array Exists!");
        
    }

    }

    static boolean check(int arr[], int n){
        Set<Integer> hs = new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(arr[i]==0 || sum==0 || hs.contains(sum))
            return true;

            hs.add(sum);
        }
        return false;
    }
}
