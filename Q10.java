/**
 * Q10-Minimum no. of Jumps to reach end of an array
 */
import java .util.*;
public class Q10 {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the No. of Elements you want");
     int n=sc.nextInt();
     System.out.println("Enter the Elements in the Array");
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
     }
     int ans=jump(arr, n);
     System.out.println("Total No. Jumps Needed is "+ans);
     
    }

    static int jump(int arr[], int n){
      if(n<=1){
        return 0;
      }

      if(arr[0]==0){
        return -1;
      }
      int reach=arr[0];
      int steps=arr[0];
      int cnt=1;

      for(int i=1;i<n;i++){
        if(i==n){
          return cnt;
        }

        reach=Math.max(reach, i+arr[i]);
        steps--;

        if(steps==0){
          cnt++;
        }

        if(i>=reach){
          return -1;
        }

        steps=reach - i;


      }

      return cnt;
    }
}  