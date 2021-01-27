/*
 * Q20-Rearrange the array in alternating positive and negative items with O(1) extra space.
 */
import java.util.*;
public class Q20 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the No. of elements you want in the Array");
    int n=sc.nextInt();
    System.out.println("Enter the Elements into the Array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int out=-1;
    for(int i=0;i<n;i++){
        if(out!=-1){
            if(arr[out]>=0 && arr[i]<0 || arr[out]<0 && arr[i]>=0){
                rotate(arr, out, i);
                if(i - out>=2)
                     out=out+2;
                else
                    out=-1;    
                }

            }
            else{
                if(arr[i]>=0 && arr[i]%2==0 || arr[i]<0 && arr[i]%2==1)
                    out=-1;
                
            }
        }
        System.out.print("After Rearranging ");
        System.out.println(Arrays.toString(arr));
    
    }
        static void rotate(int arr[], int from, int to){
            int tmp=arr[to];
            for(int i=to;i>from;i--)
             arr[i]=arr[i-1];
            arr[from]=tmp;  
    }

}
