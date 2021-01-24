/*
 * Q15-Next Permutation.
 */
import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextpermutation(arr, n);
        
    }

    static void nextpermutation(int arr[], int n){
        if (arr== null || n<=1) return ;
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1])i--;
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i])j--;
            swap(arr,i,j);
        }
        reverse(arr, i+1, n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    static void reverse(int arr[], int i,int j){
        while(i<j){
            swap(arr,i++,j--);
        }
    }
}
