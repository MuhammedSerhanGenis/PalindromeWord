/**
  *Finding if the entered word is palindrome or not using Stack.
  * 
  *Muhammed Serhan Genis
  *14.08.2022
  *
*/



import java.util.Scanner;
import java.util.Stack;


public class Main {
    
    
    
     public static void main(String args[]){
        
         Stack<Character> stack= new Stack<Character>();
         boolean isPalindrome = false;
         Scanner scanner= new Scanner(System.in);
         System.out.print("Enter the word: ");
         String word=scanner.nextLine();
         
         for(int i=0;i<word.length()/2;i++){
             
             stack.push(word.charAt(i));
             
         }
         
         int isLengthOdd=1;
         if(word.length()%2==0){
             isLengthOdd=0;
         }
         
         for(int i=word.length()/2+isLengthOdd;i<word.length();i++){
             
             if(stack.pop()==word.charAt(i)){
                 isPalindrome=true;
             }
             else{
                 isPalindrome=false;
                 break;
             }
         }
         
         if(isPalindrome){
             System.out.println(word+" is palindrome.");
         }
         else{
             System.out.println(word+ " is not palindrome.");
         }
         
         
         
     }
}
