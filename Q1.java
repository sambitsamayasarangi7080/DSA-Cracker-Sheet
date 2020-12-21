/**
 * Q1-Reverse an array or string
 */
import java.util.*;
public class Q1 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Reversed Array:");
        int start=0, end=n-1;
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        
        start++;
        end--;

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}