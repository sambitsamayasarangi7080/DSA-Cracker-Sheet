/*
 * Q22-Find factorial of a large number.
 */
import java.util.*;
public class Q22 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=sc.nextInt();
       int arr[]=new int[100000000];
       int size=1;
       arr[0]=1;
       for(int x=2;x<=n;x++)
           size=fact(x, arr, size);
           
       System.out.print("Factorial= ");
       for(int i=size-1;i>=0;i--){
           System.out.print(arr[i]); 
       }

    }

    static int fact(int x, int arr[], int size){
        int cnt=0;
        for(int i=0;i<size;i++){
            int pro=arr[i] * x + cnt;
            arr[i]=pro%10;
            cnt=pro/10;
            
        }
        while(cnt!=0){
            arr[size]=cnt % 10;
            cnt=cnt/10;
            size++;
        }
        return size;
    }
    
}
