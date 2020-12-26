/**
 * Q4-Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
 */
import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the Size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cn0=0,cn1=0,cn2=0;
        for(int i=0;i<n;i++){
            switch (arr[i]){
                case 0:
                  cn0++;
                  break;

                case 1:
                  cn1++;
                  break;

                case 2:
                  cn2++;
                  break;

                default:
                break;  
            }
            
        }
        int i=0;
        while(cn0>0){
           arr[i++]=0;
           cn0--; 
        }
        while(cn1>0){
            arr[i++]=1;
            cn1--;
        }
        while(cn2>0){
            arr[i++]=2;
            cn2--;
        }

        System.out.println("After Sorting(Without Doing any Sorting Algo): ");
        for(int j=0;j<n;j++){
            System.out.println(arr[j] + " ");
        }

    }
}
