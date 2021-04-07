/*
 * Q47- Reverse a String.
 */
import java.util.Scanner;

public class Q47 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String s=sc.nextLine();    
    char str[]=s.toCharArray();
    System.out.println("Reverse:");
    for(int i=str.length-1;i>0;i--){
        System.out.print(str[i]);
    }
}
}
