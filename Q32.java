/*
 * Q32-Three way partitioning of an array around a given value.
 */
import java.util.*;
public class Q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the No. of Elements to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        partition(arr, n, a, b);
        System.out.println("Modified Array");
        for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
        }
    }

    static void partition(int arr[], int n, int a, int b){
        int i=0;
        int start=0, end=n-1;
        while(i<=end){
            if(arr[i]<a){
                int temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                i++;
                start++;
            }

            else if(arr[i]>b){
                int temp=arr[end];
                arr[end]=arr[i];
                arr[i]=temp;
                end--;
            }
            else
                i++;
        }
    }
    
}
