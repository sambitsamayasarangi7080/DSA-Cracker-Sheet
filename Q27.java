/*
 * Q27-Find whether an array is a subset of another array.
 */
import java.util.*;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in the 1st Arrray");
        int n1=sc.nextInt();
        System.out.println("Enter the Elements into the 1st Array");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the No. of Elements you want in the 2nd Arrray");
        int n2=sc.nextInt();
        System.out.println("Enter the Elements into the 2nd Array");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        if(isset(arr1, arr2, n1, n2))
            System.out.println("Yes");
        else
            System.out.println("No");    
    }
    static boolean isset(int arr1[], int arr2[], int m, int n){ 

    int i = 0; 
    int j = 0; 
    for(i = 0; i < n; i++) { 
        for(j = 0; j < m; j++) 
            if (arr2[i] == arr1[j]) 
                break; 

        if (j == m) 
            return false; 
} 


    return true; 
        } 
    

    
    
}
