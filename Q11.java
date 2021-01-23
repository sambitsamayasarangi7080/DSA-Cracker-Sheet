/**
 * Q11-find duplicate in an array of N+1 Integers.
 */
import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want");
        int n=sc.nextInt();
        System.out.println("Enter the Elements in the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            
            if(arr[i]==arr[i+1]){
                System.out.println("The Duplicate Number is "+arr[i]);
                break;
            }
        }
    }
}
