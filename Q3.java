/**
 * Q3-Find the "Kth" max and min element of an array 
 */
import java.util.*;

public class Q3 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of the Array");
    int n=sc.nextInt();
    System.out.println("Entre the Elements of the Array");
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the Value of Kth Smallest and Mth Largest Number you Want");
    int k=sc.nextInt();
    int m=sc.nextInt();
    Arrays.sort(arr); 
    System.out.printf("The Kth Smallest Number is: %d \n", arr[k-1]);
    System.out.printf("The Mth Largest Number is: %d", arr[n-m]);

    }
}
