/**
 * Q7-Write a program to cyclically rotate an array by one.
 */
import java.util.*;
public class Q7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the Array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=arr[n-1];
        for (int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;

        System.out.println("After Rotating array by one:");
        for(int j=0;j<n;j++){
            System.out.println(arr[j] + " ");
        }
        }
    
}
