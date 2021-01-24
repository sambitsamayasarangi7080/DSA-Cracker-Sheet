/*
 * Q14-Merge Intervals.
 */
import java.util.*;
class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start=start;
        this.end=end;
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Intervals you want");
        int n=sc.nextInt();
        Interval arr[]=new Interval[n];
        System.out.println("Enter the Intervals");
        for(int i=0;i<n;i++){
            arr[i]=new Interval(sc.nextInt(), sc.nextInt());
        } 
        mergeintervals(arr,n);       
        }

        static void mergeintervals(Interval arr[], int n){
            int index=0;
            for(int i=1;i<n;i++){
                if(arr[index].end>=arr[i].start){
                    arr[index].start=Math.min(arr[index].start, arr[i].start);
                    arr[index].end=Math.max(arr[index].end, arr[i].end);
                }
                else{
                    index++;
                    arr[index]=arr[i];
                }
            }
            System.out.print("The Merged Intervals are: "); 
        for (int i = 0; i <= index; i++)  
        { 
            System.out.print("[" + arr[i].start + "," 
                                        + arr[i].end + "]");  
        } 


        }
}
