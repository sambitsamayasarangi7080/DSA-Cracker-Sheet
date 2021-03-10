import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * 
 */
public class test
{
	public static int[]  maxRevenue(int[][] salesRecord)
	{
		int[]  answer = new int[100];
		
		int i = 0;
		int max = 0;
		 while(i < 100)
		 {
		     for(int j=0; j <= salesRecord[i].length-1 ; j++)
		     {
		         if(salesRecord[i][j] > max)
		         {
		             max=salesRecord[i][j];
		         }
		     }
		     
		     answer[i]=max;
		     max=0;
		     i++;
		 }
		

		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// input for salesRecord
		int salesRecord_row = in.nextInt();
		int salesRecord_col = in.nextInt();
		int salesRecord[][] = new int[salesRecord_row][salesRecord_col];
		for(int idx = 0; idx < salesRecord_row; idx++)
		{
			for(int jdx = 0; jdx < salesRecord_col; jdx++)
			{
				salesRecord[idx][jdx] = in.nextInt();
			}
		}

		int[] result = maxRevenue(salesRecord);
		for(int idx = 0; idx <= result.length - 1; idx++)
		{
			System.out.print(result[idx] + " ");
		}
		System.out.print(result[result.length - 1]);
	}
}