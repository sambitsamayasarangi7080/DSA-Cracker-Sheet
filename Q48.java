import java.util.*;
public class Q48 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();    
        char str[]=s.toCharArray();
       palindrome(str);
    }

        
        
        
        
            
    
    static void palindrome(char str[]){
    int l=0;
        int h=str.length-1;
        while(l<h){
            if(str[l++] != str[h--]){
                System.out.println("Not Palindrome");
                return ;
            }
            
            
        }
        System.out.println("Palindrome");
    }
}
    

