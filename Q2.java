/**
 * Q2-Find the maximum and minimum element in an array
 */
import java.util.*;
public class Q2 {
public static class pair{
    int max;
    int min;
}

static pair myminmax(int arr[], int n){
    pair minmax=new pair();

    if(n==1){
      minmax.min=arr[0];
      minmax.max=arr[0];
    }


    if(arr[0]>arr[1]){
       minmax.max=arr[0];
       minmax.min=arr[1];
    }
    else{
        minmax.max=arr[1];
        minmax.min=arr[0];
    }

    for(int i=2;i<n;i++){
        if(arr[i]>minmax.max)
          minmax.max=arr[i];
        else if(arr[i]<minmax.min)
          minmax.min=arr[i];
    }

    return minmax;


}




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pair minmax=myminmax(arr,n);
        System.out.printf("Maximun: %d \n", minmax.max);
        System.out.printf("Minimum: %d", minmax.min);
    
        
    }
}
