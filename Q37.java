import java.util.*;
public class Q37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Rows");
        int n=sc.nextInt();
        System.out.println("Enter the No. of Columns");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            System.out.println("123");
            for(int j=0;j<m;j++){
                System.out.println("456");
                 arr[n][m]=sc.nextInt();
            }
        }
        spiral(arr, n, m);
    }
    static void spiral(int arr[][], int n, int m){
        int top=0;
        int down=m-1;
        int left=0;
        int right=n-1;
        int dir=0;
        int i;
        while(top<down && left<right){
            if(dir==0){
                for(i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            else if(dir==1){
                for(i=top;i<=down;i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            else if(dir==2){
                for(i=right;i>=left;i--){
                    System.out.print(arr[down][i]+" ");
                }
                down--;
            }
            else if(dir==3){
                for(i=down;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
            }
            dir=(dir+1)%4;

        }


    }
    
}
