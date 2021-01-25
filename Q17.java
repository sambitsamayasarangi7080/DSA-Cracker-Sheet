/*
 * Q17-Best time to buy and Sell stock.
 */
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of elements you want in the Array");
        int n=sc.nextInt();
        System.out.println("Enter th Elements to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxprofit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i] - min > maxprofit){
                maxprofit=arr[i] - min;
            }
        }
        System.out.println("Maximum Profit is "+maxprofit);

    }
}
