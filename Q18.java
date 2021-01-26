/*
 * Q18-find all pairs on integer array whose sum is equal to given number.
 */
import java.util.*;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Emenets you want in the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Sum you want");
        int k=sc.nextInt();
        System.out.println("Enter the Elements to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j]==k){
                  count++;
                }
            }
        }
        System.out.println("Total No. of pairs on integer array whose sum is equal to given number is "+count);
    }
    
}
