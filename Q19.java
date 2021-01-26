/*
 * Q19-find common elements In 3 sorted arrays.
 */
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Elements to be Entered in the 1st Array");
        int n1=sc.nextInt();
        System.out.println("Enter the Sorted Elements to the 1st Array");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the No. of Elements to be Entered in the 2nd Array");
        int n2=sc.nextInt();
        System.out.println("Enter the Sorted Elements to the 2nd Array");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter the No. of Elements to be Entered in the 3rd Array");
        int n3=sc.nextInt();
        System.out.println("Enter the Sorted Elements to the 3rd Array");
        int arr3[]=new int[n3];
        for(int i=0;i<n3;i++){
            arr3[i]=sc.nextInt();
        }
        System.out.print("The Common Element(s) is/are ");
        int i=0, j=0, k=0;
        while(i<n1 && j<n2 && k<n3){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.print(+arr1[i] + " ");
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }


    }
}
