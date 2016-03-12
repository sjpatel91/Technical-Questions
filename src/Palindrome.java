import java.io.*;
import java.util.*;

public class Palindrome {

   public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       String A=sc.next();
       char newStr[] = new char[50];
       char newStr2[] = new char[50];
       newStr=A.toCharArray();
       boolean palin=true;
       int count=0;
       /* Enter your code here. Print output to STDOUT. */
       for(int i=(A.length()-1);i>=0;i--){
           newStr2[count]=A.charAt(i);
           count++;
       }
       for(int i=0;i<newStr.length;i++){
    	   System.out.print(newStr2[i]);
           if(newStr[i]!=newStr2[i]){
               palin=false;
           }
       }
       
       if(palin==false){
           System.out.print("No");
       } else {
           System.out.print("Yes");
       }
   }
}