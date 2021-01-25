/*
 * Q16-Count Inversion.
 */
import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements in the Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
             
            if(arr[i]>arr[j]){
                count++;
            }
        }
        }
    System.out.println("Total Inversions "+count);
}
    
}
