/**
 * Q6-Find the Union and Intersection of the two sorted arrays.
 */
import java.util.*;

public class Q6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the 1st Array");
        int n1=sc.nextInt();
        System.out.println("Enter the Elements of the 1st array in Sorted Way:");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Size of the 2nd Array");
        int n2=sc.nextInt();
        System.out.println("Enter the Elements of the 2nd array in Sorted Way:");
        int arr2[]=new int[n2];
        for(int j=0;j<n2;j++){
            arr2[j]=sc.nextInt();
        }
        System.out.println("The Union of the two Sorted Array:");
        printUnion(arr1, arr2, n1, n2);
        System.out.println("The Intersection of the two Sorted Array:");
        printIntersection(arr1, arr2, n1, n2);
        
    }  
    
    static int printUnion(int arr1[], int arr2[], int n1, int n2){

        int i=0,j=0;
        while(i<n1 && j<n2){
            if (arr1[i]<arr2[j])
                System.out.println(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.println(arr2[j++] + " ");
            else
                System.out.println(arr2[j++]);

        }

        while (i < n1) 
            System.out.println(arr1[i++] + " "); 
        while (j < n2) 
            System.out.println(arr2[j++] + " "); 

         return 0;   
    
    }

    static void printIntersection(int arr1[], int arr2[], int n1, int n2){

        int i=0,j=0;
        while(i<n1 && j<n2){
            if (arr1[i]<arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else
                System.out.println(arr2[j++]);
                i++;

        }

        while (i < n1) 
            System.out.println(arr1[i++] + " "); 
        while (j < n2) 
            System.out.println(arr2[j++] + " "); 

            
    
    }
}
