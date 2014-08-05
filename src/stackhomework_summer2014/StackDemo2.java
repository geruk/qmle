/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackhomework_summer2014;


import java.util.*;

public class StackDemo2 {
    public static void main(String[] args)
            
            // Names from this site
            // http://www.itsecurity.com/features/top-10-famous-hackers-042407/
    {
        Stack<String> hackerName   = new Stack<>(); // Note use of diamond operator. 
        Scanner keyboard = new Scanner(System.in);
        
        
        //1. Add some names to the stack using the push method.
        hackerName.push("Stephen Wozniak"); hackerName.push("Tim Berners-Lee"); 
        hackerName.push("Jonathan James");  hackerName.push("Adrian Lamo");     hackerName.push("Kevin Mitnick"); 
        
        System.out.println("\nHere is how the default toString method treats your stack.");
                System.out.println("\nIt seems to print from bottom to top.");

        System.out.println(hackerName);
        
        System.out.println("\nHere is a customized stack printing using an enhanced for loop.");
        print(hackerName); 
        
        
        for(String student : hackerName)
        System.out.printf("\nThe location of %s in the stack is: %d",  student , hackerName.search(student) );

         System.out.println("\nHere is a customized stack printing using am classical for loop.");
        printBottomToTop(hackerName); 
        
    } // end of main method
    
    
    
    
    private static void print(Stack<String> myStack ) {
        int count = 1, sizeOfStack = myStack.size();
        System.out.println("\nYour stack has size: " + sizeOfStack);
        
        for (String myString : myStack) 
        {
            System.out.print(count + ". " + myString);
            if(count!=sizeOfStack) System.out.print( " -> ");
            else System.out.print( " :Last");
            count++;
        } // end of for loop
        
    } // end of method print
    
      private static void printBottomToTop(Stack<String> myStack ) {
        int count = 1, sizeOfStack = myStack.size();
        
        System.out.println("\nYour stack has size: " + sizeOfStack);
        
        for (int k = 0; k< sizeOfStack; k++) 
        {
            System.out.print(k + ". " + myStack.get(k) );
            
            if(k!=sizeOfStack) 
                {System.out.print( " -> "); }
            else 
                {System.out.print( " :Last"); }
            
        } // end of for loop
        
    } // end of method printBottomToTop
    
    
} // end of class