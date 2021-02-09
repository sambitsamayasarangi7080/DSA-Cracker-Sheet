/*
 * Q34-Minimum no. of operations required to make an array palindrome.
 */
import java.util.*;
public class Q34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=palindrome(arr, n);
        if(ans==1)
            System.out.println("Yes, Palindrome");
        else
            System.out.println("Not Palindrome");    
    }
    static int palindrome(int arr[], int n){

        for(int i=0;i<n;i++){
            int ans=0;
            int temp=arr[i];
            while(temp>0){
                int r=temp%10;
                ans=ans*10+r;
                temp=temp/10;
            }
            if(ans!=arr[i]){
                return 0;
            }
        }
        return 1;
    }
    
}
