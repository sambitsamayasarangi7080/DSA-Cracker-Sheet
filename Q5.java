/**
 * Q5-Move all the negative elements to one side of the array 
 */
import java.util.*;
public class Q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0,temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
                j++;
            }
            
        }

        System.out.println("The Required Array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
