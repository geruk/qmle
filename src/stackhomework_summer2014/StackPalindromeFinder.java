package stackhomework_summer2014;

// Goal: Use Stacks to test if a phrase is a palindrome.


import java.util.*;

public class StackPalindromeFinder  {
   
public static void main(String[] args) {
   
// 1. Store some phrases to test in a stack!
    Stack<String> testPhrase = new Stack<String>();
    testPhrase.push("aa");  // Hawaiian Lava
    testPhrase.push("wow");
    testPhrase.push("deed");   
    testPhrase.push("madam");
    
// These next two are not palindromes.
    testPhrase.push("We love the Drexel Dragons!");
    testPhrase.push("Love is all there is.");


// We will test each word or phrase to see if it is  a palindrome.
// Here are some more interesting examples from a Wikipedia article.
    
    testPhrase.push("Was it a car or a cat I saw?"); 
    testPhrase.push("A nut for a jar of tuna."); 
    testPhrase.push("Do geese see God?"); 
    testPhrase.push("Ma is as selfless as I am.");
    testPhrase.push("Dammit, I'm mad!");
    testPhrase.push("Step on no pets.");
    testPhrase.push("Never odd or even.");
    testPhrase.push("Rise to vote, sir."); // Featured on The Simpsons. 

// For each phrase, we must test to see if it is a palindrome. 
    
System.out.println("\nThis program tests a stack of phrases to see if they are palindromes.\n");
System.out.println("\nIt only uses STACKS to do the testing! Cool!\n");

    
    
for(String phrase : testPhrase)  {
        System.out.println("\nTest Phrase: \t'" + phrase + "'");
        
        if ( isPalindrome(phrase) ) {
            System.out.println("Yes, this is a palindrome!");} // end of if
        
        
        else { System.out.println("Sorry, this is NOT a palindrome!");} // end of else
            
        
} // end of for loop
    
    
    
    
    
}  // end of main method
    

    
/* INSTRUCTIONS
 Replace this recursive version of the isPalindrome() method
 by a non-recursive method based on checking if a stack and its reverse stack are equal. 
 * See the PDF file for some starting code. 
*/
    
    
public static boolean isPalindrome(String text) {

int length = text.length();
// Let's clean up the input first.
// First we will only keep actual letters. 
String newText = ""; // empty String

char nextCharacter;
for (int i = 0 ; i < length ; i++)  {
    nextCharacter = text.charAt(i);
   
if ( Character.isLetter(nextCharacter) )  newText += nextCharacter;
}  // end of for loop
    
newText =newText.toLowerCase(); // Second: Convert all to lower case.
// Great, now that the text has been cleaned up,
// let's recalculate the numebr of characters. 
length = newText.length();
    
    
// 1. Stopping Conditions
// The empty String "" and all Strings of length 1 are palindromes. 

if (length <= 1)   {return true;}

 
// Otherwise handle the general case recursively. 
else {
char first = newText.charAt(0);
char last = newText.charAt(length-1);

if(first!=last) {
    return  false; // Sorry, not a palindrome.
 } // end of if
        
else {
// OK, it might be a palindrome.
// Chop off the first and last letters.
// We are done with them

    String shorterText = newText.substring(1, length-1);
    
    return isPalindrome(shorterText); // Recursive call. 
     
} // end of inner else
    
   
} //  end of outer else block

} // end of isPalindrome

    


} // end of class
