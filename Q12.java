/*
 * Q12-Merge 2 sorted arrays without using Extra space.
 */
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the 1st Array");
        int n1=sc.nextInt();
        System.out.println("Enter the No. of Elements you want in the 2nd Array");
        int n2=sc.nextInt();
        System.out.println("Enter the Elements in the Sorted Manner to the 1st rray");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Elements in the Sorted Manner to the 2nd rray");
        int arr2[]=new int[n2 ];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int N=n1+n2;
        int final1[]=new int[N];
        int cnt=0;

        for(int i=0;i<n1;i++){
            int ele=arr1[i];
            final1[cnt]=ele;
            cnt++;
        }
        for(int i=0;i<n2;i++){
            int ele=arr2[i];
            final1[cnt]=ele;
            cnt++;
        }
        Arrays.sort(final1);
        System.out.println("After Merging ");
        System.out.println(Arrays.toString(final1)); 
        
        


    }
    
}
